package br.com.fmt.M02S07.repositories;

import br.com.fmt.M02S07.entities.Nutricionista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NutricionistaRepository extends JpaRepository<Nutricionista,Long> {
}
