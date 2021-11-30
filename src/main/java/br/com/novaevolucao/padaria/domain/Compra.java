package br.com.novaevolucao.padaria.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double valor;
    @ElementCollection
    private List<Long> quantidade;
    @ManyToMany(cascade = CascadeType.PERSIST)
    private List<Produto> produto;
}
