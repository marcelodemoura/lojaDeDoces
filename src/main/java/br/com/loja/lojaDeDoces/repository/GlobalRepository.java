package br.com.loja.lojaDeDoces.repository;

import br.com.loja.lojaDeDoces.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GlobalRepository extends JpaRepository<Cliente, Long> {







}
