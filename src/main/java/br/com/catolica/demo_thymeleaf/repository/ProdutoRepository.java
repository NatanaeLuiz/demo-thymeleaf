package br.com.catolica.demo_thymeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.catolica.demo_thymeleaf.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}