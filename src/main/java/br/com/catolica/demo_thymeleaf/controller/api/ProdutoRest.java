package br.com.catolica.demo_thymeleaf.controller.api;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.catolica.demo_thymeleaf.model.Produto;
import br.com.catolica.demo_thymeleaf.service.ProdutoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/produtos")
@Tag(name = "Produtos", description = "Endpoints de gerenciamento de produtos")
public class ProdutoRest {
    
    private final ProdutoService service;

    public ProdutoRest(ProdutoService service) {
        this.service = service;
    }

    @GetMapping
    @Operation(summary = "Listar todos os produtos", description = "Retorna todos os produtos cadastrados")
    public List<Produto> listar() {
        return service.listarTodos(); // retorna JSON
    }

    @GetMapping("/{codigo}")
    @Operation(summary = "Buscar produto por código", description = "Retorna um produto específico")
    public Produto buscarPorCodigo(@PathVariable int codigo) {
        return service.buscarPorCodigo(codigo);
    }

    // SALVAR NOVO PRODUTO
    @PostMapping
    @Operation(summary = "Cadastrar novo produto", description = "Cria um novo produto")
    public void salvar(@RequestBody Produto produto) {
        service.salvar(produto);
    }

    // EXCLUIR PRODUTO
    @DeleteMapping("/{codigo}")
    @Operation(summary = "Excluir produto", description = "Remove um produto pelo código")
    public void excluir(@PathVariable int codigo) {
        service.excluir(codigo);
    }
}
