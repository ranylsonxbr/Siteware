package br.com.siteware.app.Pedido.infra;

import br.com.siteware.app.Pedido.domain.Pedido;
import br.com.siteware.app.Pedido.repository.PedidoRepository;
import br.com.siteware.app.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
@RequiredArgsConstructor
@Log4j2
public class PedidoInfraRepository implements PedidoRepository {

    private final PedidoSpringDataJPARepository pedidoSpringDataJPARepository;

    @Override
    public Pedido salvaPedido(Pedido pedido) {
        log.info("[start] PedidoInfraRepository - salvaPedido");
        pedidoSpringDataJPARepository.save(pedido);
        log.info("[finish] PedidoInfraRepository - salvaPedido");
        return pedido;
    }

    @Override
    public List<Pedido> buscaTodosPedidosPorId() {
        log.info("[start] PedidoInfraRepository - buscaTodosPedidosPorId");
        List<Pedido> pedidos = pedidoSpringDataJPARepository.findAll();
        log.info("[finish] PedidoInfraRepository - buscaTodosPedidosPorId");
        return pedidos;
    }

    @Override
    public Pedido buscaPedidoPorId(UUID idPedido) {
        log.info("[start] PedidoInfraRepository - buscaPedidoPorId");
        Pedido pedido = pedidoSpringDataJPARepository.findById(idPedido)
                .orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Pedido não encontrado!"));;
        log.info("[finish] PedidoInfraRepository - buscaPedidoPorId");
        return pedido;
    }

}
