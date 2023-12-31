package br.com.loja.lojaDeDoces.service;

import br.com.loja.lojaDeDoces.model.Empresa;
import br.com.loja.lojaDeDoces.model.Pagamento;

import java.util.Optional;

public interface EmpresaService {


    Object save(Empresa empresa);

    Optional<Empresa> findById(Long id);


    Empresa findAll();

    void delete(Empresa empresa);

}
