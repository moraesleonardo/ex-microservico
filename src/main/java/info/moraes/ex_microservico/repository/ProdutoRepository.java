package info.moraes.ex_microservico.repository;

import info.moraes.ex_microservico.model.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Long> {


}
