package br.com.siteware.app.Pedido.repository;

import br.com.siteware.app.Pedido.domain.Pedido;

import java.util.List;
import java.util.UUID;

public interface PedidoRepository {
    Pedido salvaPedido(Pedido pedido);

    List<Pedido> buscaTodosPedidosPorId();

    Pedido buscaPedidoPorId(UUID idPedido);
}
