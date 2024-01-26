package br.com.siteware.app.Pedido.application.api;

import br.com.siteware.app.Pedido.application.service.PedidoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@Log4j2
@RequiredArgsConstructor
public class PedidoController implements PedidoAPI {

    private final PedidoService pedidoService;

    @Override
    public PedidoResponse postPedido(UUID idCliente, PedidoRequest pedidoRequest) {
        log.info("[inicia] PedidoRestController - postPedido");
        log.info("[idCliente] {}", idCliente);
        PedidoResponse novoPedido = pedidoService.salvaPedido(idCliente, pedidoRequest);
        log.info("[finaliza] PedidoRestController - postPedido");
        return novoPedido;
    }
}
