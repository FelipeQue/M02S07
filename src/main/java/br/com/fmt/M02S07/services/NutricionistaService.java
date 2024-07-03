package br.com.fmt.M02S07.services;

import br.com.fmt.M02S07.controllers.dto.NutricionistaRequestDTO;
import br.com.fmt.M02S07.controllers.dto.NutricionistaResponseDTO;
import br.com.fmt.M02S07.entities.Nutricionista;
import br.com.fmt.M02S07.repositories.EnderecoRepository;
import br.com.fmt.M02S07.repositories.NutricionistaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class NutricionistaService {

    private final NutricionistaRepository nutricionistaRepository;
    private final EnderecoRepository enderecoRepository;


    public NutricionistaService(NutricionistaRepository nutricionistaRepository, EnderecoRepository enderecoRepository) {
        this.nutricionistaRepository = nutricionistaRepository;
        this.enderecoRepository = enderecoRepository;
    }

    public List<NutricionistaResponseDTO> listarNutricionistas() {
        return nutricionistaRepository.findAll().stream().map(
                nutricionista -> new NutricionistaResponseDTO(
                        nutricionista.getId(),
                        nutricionista.getNome(),
                        nutricionista.getMatricula(),
                        nutricionista.getTempoExperiencia(),
                        nutricionista.getEndereco(),
                        nutricionista.getCrn(),
                        nutricionista.getEspecialidade()
                )
        ).collect(Collectors.toList());
    }

    public NutricionistaResponseDTO buscarNutricionista(Long id){
        Nutricionista nutricionista = nutricionistaRepository.findById(id).orElse(null);
        if (nutricionista != null) {
            return new NutricionistaResponseDTO(
                    nutricionista.getId(),
                    nutricionista.getNome(),
                    nutricionista.getMatricula(),
                    nutricionista.getTempoExperiencia(),
                    nutricionista.getEndereco(),
                    nutricionista.getCrn(),
                    nutricionista.getEspecialidade()
            );
        }
        return null;
    }

    public NutricionistaResponseDTO salvarNutricionista(NutricionistaRequestDTO request) {
        Nutricionista nutricionista = mapearRequest(request);
        Nutricionista entitySalva = nutricionistaRepository.save(nutricionista);

        return new NutricionistaResponseDTO(entitySalva.getId(),
                entitySalva.getNome(),
                entitySalva.getMatricula(),
                entitySalva.getTempoExperiencia(),
                entitySalva.getEndereco(),
                entitySalva.getCrn(),
                entitySalva.getEspecialidade()
        );
    }

    private Nutricionista mapearRequest(NutricionistaRequestDTO source){
        Nutricionista target = new Nutricionista();
        target.setNome(source.getNome());
        target.setMatricula(source.getMatricula());
        target.setTempoExperiencia(source.getTempoExperiencia());
        target.setCrn(source.getCrn());
        target.setEspecialidade(source.getEspecialidade());
        target.setEndereco(enderecoRepository.findById(source.getIdEndereco()).orElse(null));
        return target;
    }

    public void atualizarNutricionista(Long id, NutricionistaRequestDTO request) {
        Nutricionista nutricionista = nutricionistaRepository.findById(id).orElse(null);
        assert nutricionista != null;
        nutricionista.setNome(request.getNome());
        nutricionista.setMatricula(request.getMatricula());
        nutricionista.setTempoExperiencia(request.getTempoExperiencia());
        nutricionista.setCrn(request.getCrn());
        nutricionista.setEspecialidade(request.getEspecialidade());

    }

    public void removerNutricionista(Long id) {
        nutricionistaRepository.deleteById(id);
    }


}
