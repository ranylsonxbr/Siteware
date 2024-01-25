package br.com.siteware.app.Cliente.application.service;


import br.com.siteware.app.Cliente.application.api.ClienteDetalhadoResponse;
import br.com.siteware.app.Cliente.application.api.ClienteListResponse;
import br.com.siteware.app.Cliente.application.api.ClienteRequest;
import br.com.siteware.app.Cliente.application.api.ClienteResponse;

import java.util.List;
import java.util.UUID;

public interface ClienteService {
    ClienteResponse salvaCliente(ClienteRequest clienteRequest);

    List<ClienteListResponse> buscaTodosClientes();

    ClienteDetalhadoResponse buscaClientePorId(UUID idCliente);
}
