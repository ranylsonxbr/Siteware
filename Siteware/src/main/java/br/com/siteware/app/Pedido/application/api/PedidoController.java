package br.com.siteware.app.Pedido.application.api;

import br.com.siteware.app.Pedido.application.service.PedidoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@Log4j2
@RequiredArgsConstructor
public class PedidoController implements PedidoAPI {

    private final PedidoService pedidoService;

    @Override
    public PedidoResponse postPedido(UUID idCliente, PedidoRequest pedidoRequest) {
        log.info("[start] PedidoRestController - postPedido");
        log.info("[idCliente] {}", idCliente);
        PedidoResponse novoPedido = pedidoService.salvaPedido(idCliente, pedidoRequest);
        log.info("[finish] PedidoRestController - postPedido");
        return novoPedido;
    }

    @Override
    public List<PedidoClienteListResponse> buscaTodosPedidosPorId(UUID idCliente) {
        log.info("[start] PedidoRestController - buscaTodosPedidosPorId");
        log.info("[idCliente] {}", idCliente);
        List<PedidoClienteListResponse> pedidos =  pedidoService.buscaTodosPedidosPorId(idCliente);
        log.info("[finish] PedidoRestController - buscaTodosPedidosPorId");
        return pedidos;
    }

    @Override
    public PedidoDetalhadoResponse buscaPedidoPorID(UUID idCliente, UUID idPedido) {
        log.info("[start] PedidoRestController - buscaPedidoPorID");
        log.info("[idCliente] {}", idCliente);
        PedidoDetalhadoResponse pedido = pedidoService.buscaPedidoPorId(idCliente,idPedido);
        log.info("[finish] PedidoRestController - buscaPedidoPorID");
        return pedido;
    }
}
