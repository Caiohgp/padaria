package br.com.novaevolucao.padaria.repository;

import br.com.novaevolucao.padaria.domain.Compra;
import br.com.novaevolucao.padaria.domain.Venda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompraRepository extends JpaRepository<Compra,Long> {
}
