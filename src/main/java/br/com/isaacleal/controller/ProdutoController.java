package br.com.isaacleal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<Iterable<Produto>> buscarTodosOsProdutos() {

		var produtos = produtoService.buscarProdutos();

		return ResponseEntity.ok(produtos);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Produto> buscarProdutoPorId(@PathVariable Long id) {
		var produto = produtoService.buscarProdutoPorId(id);
		return ResponseEntity.ok(produto);
	}

	@PostMapping
	public ResponseEntity<Produto> inserir(@RequestBody ProdutoDTO dto) {
		var produto = new Produto(null, dto.getDescricao(), dto.getValor());
		
		var entity = produtoService.inserir(produto);
		
		return ResponseEntity.ok(entity).status(HttpStatus.CREATED).build();
	}

}
