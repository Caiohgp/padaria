package br.com.novaevolucao.padaria.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Double precoCompra;
    private Double precoVenda;
    private TipoMedidaEnum tipoMedidaEnum;
    private Integer codigoDeBarras;
    private Integer estoque;
}
