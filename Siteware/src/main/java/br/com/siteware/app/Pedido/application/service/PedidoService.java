package br.com.siteware.app.Pedido.application.service;


import br.com.siteware.app.Pedido.application.api.PedidoRequest;
import br.com.siteware.app.Pedido.application.api.PedidoResponse;

import java.util.UUID;

public interface PedidoService {
    PedidoResponse salvaPedido(UUID idCliente, PedidoRequest pedidoRequest);
}
