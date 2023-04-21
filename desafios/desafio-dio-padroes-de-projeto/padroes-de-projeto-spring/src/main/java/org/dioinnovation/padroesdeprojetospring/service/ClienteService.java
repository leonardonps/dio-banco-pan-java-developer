package org.dioinnovation.padroesdeprojetospring.service;

import org.dioinnovation.padroesdeprojetospring.model.Cliente;

import java.util.Iterator;

public interface ClienteService {

    Iterable<Cliente> buscarTodos();
    Cliente buscarPorId(Long id);
    void inserir(Cliente cliente);
    void atualizar(Long id, Cliente cliente);
    void deletar(Long id);
}
