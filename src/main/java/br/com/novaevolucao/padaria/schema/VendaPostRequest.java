package br.com.novaevolucao.padaria.schema;

import br.com.novaevolucao.padaria.domain.Produto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VendaPostRequest {
    private Double valor;
    private List<Long> produto;
}
