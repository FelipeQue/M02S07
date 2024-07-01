package br.com.fmt.M02S07.repositories;

import br.com.fmt.M02S07.entities.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente,Long> {
}
