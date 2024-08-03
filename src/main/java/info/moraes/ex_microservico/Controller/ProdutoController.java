package info.moraes.ex_microservico.Controller;


import info.moraes.ex_microservico.model.Produto;
import info.moraes.ex_microservico.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<Produto> listarProdutos(){
        return produtoService.getAllProdutos();
    }

    @GetMapping("/{id}")
    public Optional<Produto> buscarProdutoPorId(@PathVariable Long id){
        return produtoService.getProdutosById(id);
    }

    @PostMapping
    public Produto adicionarProduto(@RequestBody Produto produto){
        return produtoService.saveProduto(produto);
    }

    @DeleteMapping("/{id}")
    public void removerProduto(@PathVariable Long id){
        produtoService.deleteProduto(id);
    }
}
