package br.com.novaevolucao.padaria.service;

import br.com.novaevolucao.padaria.domain.Produto;
import br.com.novaevolucao.padaria.repository.ProdutoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
@AllArgsConstructor
public class ProdutoService {

    ProdutoRepository produtoRepository;

    public List<Produto> listAll(){
        return produtoRepository.findAll();
    }

    public Produto findById(@PathVariable Long id){
        return produtoRepository.findById(id).get();
    }

    public List<Produto> findByIdList(List<Long> id){
        return produtoRepository.findAllById(id);
    }


    public Produto save(@RequestBody Produto produto){
        return produtoRepository.save(produto);
    }

    public void delete(@PathVariable Long id){
        produtoRepository.deleteById(id);
    }
}
