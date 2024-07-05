package br.com.fmt.M02S07.services;

import br.com.fmt.M02S07.controllers.dto.ConsultaRequestDTO;
import br.com.fmt.M02S07.controllers.dto.ConsultaResponseDTO;
import br.com.fmt.M02S07.entities.Consulta;
import br.com.fmt.M02S07.repositories.ConsultaRepository;
import br.com.fmt.M02S07.repositories.NutricionistaRepository;
import br.com.fmt.M02S07.repositories.PacienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ConsultaService {

    private final ConsultaRepository consultaRepository;
    private final NutricionistaRepository nutricionistaRepository;
    private final PacienteRepository pacienteRepository;

    public ConsultaService(ConsultaRepository consultaRepository, NutricionistaRepository nutricionistaRepository, PacienteRepository pacienteRepository) {
        this.consultaRepository = consultaRepository;
        this.nutricionistaRepository = nutricionistaRepository;
        this.pacienteRepository = pacienteRepository;
    }

    // TODO:
//    Para listar Consultas devemos ter as seguintes informações:
//    Data / hora;
//    Nome do nutricionista;
//    Nome do paciente.

    public List<ConsultaResponseDTO> listarConsultas() {
        return consultaRepository.findAll().stream().map(
                consulta -> new ConsultaResponseDTO(
                        consulta.getId(),
                        consulta.getNutricionista(),
                        consulta.getPaciente(),
                        consulta.getData(),
                        consulta.getObservacoes()
                )
        ).collect(Collectors.toList());
    }

    public ConsultaResponseDTO buscarConsulta(Long id){
        Consulta consulta = consultaRepository.findById(id).orElse(null);
        if (consulta != null) {
            return new ConsultaResponseDTO(
                    consulta.getId(),
                    consulta.getNutricionista(),
                    consulta.getPaciente(),
                    consulta.getData(),
                    consulta.getObservacoes()
            );
        }
        return null;
    }

    public ConsultaResponseDTO salvarConsulta(ConsultaRequestDTO request) {
        Consulta consulta = mapearRequest(request);
        Consulta entitySalva = consultaRepository.save(consulta);

        return new ConsultaResponseDTO(entitySalva.getId(),
                entitySalva.getNutricionista(),
                entitySalva.getPaciente(),
                entitySalva.getData(),
                entitySalva.getObservacoes()
        );
    }

    private Consulta mapearRequest(ConsultaRequestDTO source){
        Consulta target = new Consulta();
        target.setData(source.getData());
        target.setObservacoes(source.getObservacoes());
        target.setNutricionista(nutricionistaRepository.findById(source.getIdNutricionista()).orElse(null));
        target.setPaciente(pacienteRepository.findById(source.getIdPaciente()).orElse(null));
        return target;
    }

    public void atualizarConsulta(Long id, ConsultaRequestDTO request) {
        Consulta consulta = consultaRepository.findById(id).orElse(null);
        assert consulta != null;
        consulta.setNutricionista(nutricionistaRepository.findById(request.getIdNutricionista()).orElse(null));
        consulta.setPaciente(pacienteRepository.findById(request.getIdPaciente()).orElse(null));
        consulta.setData(request.getData());
        consulta.setObservacoes(request.getObservacoes());
    }

    public void removerConsulta(Long id) {
        consultaRepository.deleteById(id);
    }

}
