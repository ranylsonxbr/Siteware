package br.com.siteware.app.Pedido.application.api;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Builder
@Value
public class PedidoResponse {
    UUID idPedido;
}
