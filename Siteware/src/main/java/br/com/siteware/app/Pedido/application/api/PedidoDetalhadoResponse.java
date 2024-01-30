package br.com.siteware.app.Pedido.application.api;

import br.com.siteware.app.Pedido.domain.Pedido;
import lombok.Value;

import java.time.LocalDateTime;
import java.util.UUID;

@Value
public class PedidoDetalhadoResponse {
    private UUID idPedido;
    private String descricao;
    private Double total = 0.0;
    private LocalDateTime dataHoraDoPedido;

    public PedidoDetalhadoResponse(Pedido pedido) {
        this.idPedido = pedido.getIdPedido();
        this.descricao = pedido.getDescricao();
        this.dataHoraDoPedido = pedido.getDataHoraDoPedido();
    }


}
