package br.com.isaacleal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.isaacleal.controller.dto.ProdutoDTO;
import br.com.isaacleal.model.Produto;
import br.com.isaacleal.service.ProdutoService;

@RequestMapping("produtos")
@RestController
public class ProdutoController {
	
	@Autowired
	private ProdutoService produtoService;
	


	@GetMapping
	public Iterable<Produto> buscarTodosOsProdutos() {
		return produtoService.buscarProdutos();	
	}
	
	@GetMapping("/{id}")
	public Produto buscarProdutoPorId(@PathVariable Long id) {
		return produtoService.buscarProdutoPorId(id);
	}
	
	@PostMapping
	public Produto inserir(@RequestBody ProdutoDTO dto) {
		var produto = new Produto(null,dto.getDescricao(),dto.getValor());
		
		return produtoService.inserir(produto);
	}
	
}
