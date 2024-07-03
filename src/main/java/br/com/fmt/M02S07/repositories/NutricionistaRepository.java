package br.com.fmt.M02S07.repositories;

import br.com.fmt.M02S07.entities.Nutricionista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NutricionistaRepository extends JpaRepository<Nutricionista,Long> {
}
