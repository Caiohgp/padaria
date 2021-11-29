package br.com.novaevolucao.padaria.controller;

import br.com.novaevolucao.padaria.domain.Produto;
import br.com.novaevolucao.padaria.service.ProdutoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/produtos")
public class ProdutoController {

    ProdutoService produtoService;

    @GetMapping
    public List<Produto> listAll(){
        return produtoService.listAll();
    }

    @GetMapping("/{id}")
    public Produto findById(@PathVariable Long id){
        return produtoService.findById(id);
    }

    @PostMapping
    public Produto save(@RequestBody Produto produto){
        return produtoService.save(produto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        produtoService.delete(id);
    }
}
