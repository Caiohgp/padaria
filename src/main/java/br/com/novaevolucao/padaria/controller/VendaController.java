package br.com.novaevolucao.padaria.controller;

import br.com.novaevolucao.padaria.domain.Venda;
import br.com.novaevolucao.padaria.schema.VendaPostRequest;
import br.com.novaevolucao.padaria.service.VendaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/vendas")
public class VendaController {

    VendaService vendaService;

    @GetMapping
    public List<Venda> listAll(){
        return vendaService.listAll();
    }

    @GetMapping("/{id}")
    public Venda findById(@PathVariable Long id){
        return vendaService.findById(id);
    }

    @PostMapping
    public Venda save(@RequestBody VendaPostRequest vendaPostRequest){
        return vendaService.save(vendaPostRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        vendaService.delete(id);
    }
}
