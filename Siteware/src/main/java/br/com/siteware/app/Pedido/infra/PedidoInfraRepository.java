package br.com.siteware.app.Pedido.infra;

import br.com.siteware.app.Pedido.domain.Pedido;
import br.com.siteware.app.Pedido.repository.PedidoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
@Log4j2
public class PedidoInfraRepository implements PedidoRepository {

    private final ProdutoSpringDataJPARepository produtoSpringDataJPARepository;

    @Override
    public Pedido salvaPedido(Pedido pedido) {
        log.info("[start] PedidoInfraRepository - salvaPedido");
        produtoSpringDataJPARepository.save(pedido);
        log.info("[finish] PedidoInfraRepository - salvaPedido");
        return pedido;
    }
}
