package br.com.siteware.app.Pedido.repository;

import br.com.siteware.app.Pedido.domain.Pedido;

public interface PedidoRepository {
    Pedido salvaPedido(Pedido pedido);
}
