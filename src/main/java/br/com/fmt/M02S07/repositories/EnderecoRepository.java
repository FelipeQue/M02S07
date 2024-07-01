package br.com.fmt.M02S07.repositories;

import br.com.fmt.M02S07.entities.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco,Long> {
}
