package br.com.novaevolucao.padaria.controller;

import br.com.novaevolucao.padaria.domain.Compra;
import br.com.novaevolucao.padaria.domain.Venda;
import br.com.novaevolucao.padaria.schema.CompraPostRequest;
import br.com.novaevolucao.padaria.schema.VendaPostRequest;
import br.com.novaevolucao.padaria.service.CompraService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/compras")
public class CompraController {

    CompraService compraService;

    @GetMapping
    public List<Compra> listAll(){
        return compraService.listAll();
    }

    @GetMapping("/{id}")
    public Compra findById(@PathVariable Long id){
        return compraService.findById(id);
    }

    @PostMapping
    public Compra save(@RequestBody CompraPostRequest compraPostRequest){
        return compraService.save(compraPostRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        compraService.delete(id);
    }
}
