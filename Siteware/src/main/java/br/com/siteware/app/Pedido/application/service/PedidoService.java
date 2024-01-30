package br.com.siteware.app.Pedido.application.service;


import br.com.siteware.app.Pedido.application.api.PedidoClienteListResponse;
import br.com.siteware.app.Pedido.application.api.PedidoDetalhadoResponse;
import br.com.siteware.app.Pedido.application.api.PedidoRequest;
import br.com.siteware.app.Pedido.application.api.PedidoResponse;

import java.util.List;
import java.util.UUID;

public interface PedidoService {
    PedidoResponse salvaPedido(UUID idCliente, PedidoRequest pedidoRequest);

    List<PedidoClienteListResponse> buscaTodosPedidosPorId(UUID idCliente);

    PedidoDetalhadoResponse buscaPedidoPorId(UUID idCliente, UUID idPedido);
}
