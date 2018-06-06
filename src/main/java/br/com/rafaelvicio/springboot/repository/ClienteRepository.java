package br.com.rafaelvicio.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rafaelvicio.springboot.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}