package info.moraes.ex_microservico.repository;

import info.moraes.ex_microservico.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {


}
