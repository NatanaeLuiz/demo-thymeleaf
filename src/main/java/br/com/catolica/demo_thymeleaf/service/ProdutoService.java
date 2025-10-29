package br.com.catolica.demo_thymeleaf.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.catolica.demo_thymeleaf.model.Produto;
import br.com.catolica.demo_thymeleaf.repository.ProdutoRepository;

@Service
public class ProdutoService {

    private final ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public List<Produto> listarTodos() {
        return repository.findAll();
    }

    public Produto salvar(Produto produto) {
        return repository.save(produto);
    }

    public Produto buscarPorId(int id) {
        return repository.findById(id).orElse(null);
    }

    public void excluir(int id) {
        repository.deleteById(id);
    }
}