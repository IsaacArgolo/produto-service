package br.com.isaacleal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.isaacleal.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
