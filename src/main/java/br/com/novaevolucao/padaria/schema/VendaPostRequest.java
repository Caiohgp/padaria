package br.com.novaevolucao.padaria.schema;

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
    private List<Long> quantidade;
    private List<Long> produto;
}
