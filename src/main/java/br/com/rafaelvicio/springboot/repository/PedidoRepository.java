package br.com.rafaelvicio.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rafaelvicio.springboot.model.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}