package br.com.siteware.app.Pedido.application.api;

import br.com.siteware.app.Pedido.domain.Pedido;
import lombok.Value;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Value
public class PedidoClienteListResponse {

    private UUID idPedido;
    private UUID idCliente;
    private String descricao;
    private LocalDateTime dataHoraDoPedido;

    public PedidoClienteListResponse(Pedido pedido) {
        this.idPedido = pedido.getIdPedido();
        this.idCliente = pedido.getIdCliente();
        this.descricao = pedido.getDescricao();
        this.dataHoraDoPedido = pedido.getDataHoraDoPedido();
    }

    public static List<PedidoClienteListResponse> converte(List<Pedido> enderecosDaPessoa) {
        return enderecosDaPessoa
                .stream()
                .map(PedidoClienteListResponse::new)
                .collect(Collectors.toList());
    }
}