package br.com.novaevolucao.padaria.service;

import br.com.novaevolucao.padaria.domain.Produto;
import br.com.novaevolucao.padaria.domain.Venda;
import br.com.novaevolucao.padaria.repository.VendaRepository;
import br.com.novaevolucao.padaria.schema.VendaPostRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
@AllArgsConstructor
public class VendaService {
    VendaRepository vendaRepository;
    ProdutoService produtoService;

    public List<Venda> listAll(){
        return vendaRepository.findAll();
    }

    public Venda findById(Long id){
        return vendaRepository.findById(id).get();
    }

    public Venda save(VendaPostRequest vendaPostRequest){
        Venda venda = new Venda();

        venda.setValor(vendaPostRequest.getValor());
        venda.setProduto(produtoService.findByIdList(vendaPostRequest.getProduto()));

        return vendaRepository.save(venda);
    }

    public void delete(Long id){
        vendaRepository.deleteById(id);
    }
}
