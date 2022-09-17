package br.com.isaacleal.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.isaacleal.model.Produto;
import br.com.isaacleal.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	ProdutoRepository produtoRepository;

	public Iterable<Produto> buscarProdutos() {
		return produtoRepository.findAll();
	}

	public Produto buscarProdutoPorId(Long id) {
		
		Optional<Produto> produto = produtoRepository.findById(id);

		if (produto.isPresent())
			return produto.get();

		throw new RuntimeException("Produto não encontrado");
	}

	public Produto inserir(Produto produto) {
	 Produto entity = produtoRepository.save(produto);
	 return entity;
	}
}
