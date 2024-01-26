package br.com.siteware.app.Pedido.application.service;

import br.com.siteware.app.Cliente.application.service.ClienteService;
import br.com.siteware.app.Pedido.domain.Pedido;
import br.com.siteware.app.Pedido.application.api.PedidoRequest;
import br.com.siteware.app.Pedido.application.api.PedidoResponse;
import br.com.siteware.app.Pedido.repository.PedidoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class PedidoApplicationService implements PedidoService {

    private final ClienteService clienteServicce;
    private final PedidoRepository pedidoRepository;

    @Override
    public PedidoResponse salvaPedido(UUID idCliente, PedidoRequest pedidoRequest) {
        log.info("[start] PedidoApplicationService - salvaPedido");
        clienteServicce.buscaClientePorId(idCliente);
        Pedido pedido = pedidoRepository.salvaPedido(new Pedido(idCliente, pedidoRequest));
        log.info("[finish] PedidoApplicationService - salvaPedido");
        return PedidoResponse.builder()
                .idPedido(pedido.getIdPedido())
                .build();
    }
}
