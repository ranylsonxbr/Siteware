package br.com.siteware.app.Pedido.application.api;

import lombok.Builder;

import java.util.UUID;

@Builder
public class PedidoResponse {
    UUID idPedido;
}
