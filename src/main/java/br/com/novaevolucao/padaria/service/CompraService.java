package br.com.novaevolucao.padaria.service;

import br.com.novaevolucao.padaria.domain.Compra;
import br.com.novaevolucao.padaria.domain.Venda;
import br.com.novaevolucao.padaria.repository.CompraRepository;
import br.com.novaevolucao.padaria.schema.CompraPostRequest;
import br.com.novaevolucao.padaria.schema.VendaPostRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CompraService {
    CompraRepository compraRepository;
    ProdutoService produtoService;

    public List<Compra> listAll(){
        return compraRepository.findAll();
    }

    public Compra findById(Long id){
        return compraRepository.findById(id).get();
    }

    public Compra save(CompraPostRequest compraPostRequest){
        Compra compra = new Compra();

        compra.setValor(compraPostRequest.getValor());
        compra.setQuantidade(compraPostRequest.getQuantidade());
        compra.setProduto(produtoService.findByIdList(compraPostRequest.getProduto()));

        return compraRepository.save(compra);
    }

    public void delete(Long id){
        compraRepository.deleteById(id);
    }
}
