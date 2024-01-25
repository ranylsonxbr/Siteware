package br.com.siteware.app.Cliente.repository;

import br.com.siteware.app.Cliente.domain.Cliente;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ClienteRepository {

    Cliente salvaCliente(Cliente cliente);

    List<Cliente> buscaTodosClientes();

    Optional<Cliente> buscaClientePorId(UUID idCliente);
}
