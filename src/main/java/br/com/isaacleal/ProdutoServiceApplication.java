package br.com.isaacleal;

import java.math.BigDecimal;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.isaacleal.model.Produto;
import br.com.isaacleal.repository.ProdutoRepository;

@SpringBootApplication
public class ProdutoServiceApplication implements CommandLineRunner {

//	@Autowired
//	ProdutoRepository produtoRepsitory;
	
	public static void main(String[] args) {
		SpringApplication.run(ProdutoServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		var p1 = new Produto(null, "Notebook",BigDecimal.valueOf(3000.00));
//		var p2 = new Produto(null, "Televisão",BigDecimal.valueOf(3500.00));
//		
//		produtoRepsitory.saveAll(Arrays.asList(p1,p2));

	}

}
