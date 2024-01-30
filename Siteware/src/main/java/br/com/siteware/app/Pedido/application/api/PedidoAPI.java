package br.com.siteware.app.Pedido.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/pedido")
public interface PedidoAPI {

    @PostMapping(value = "/cria-pedido")
    @ResponseStatus(value = HttpStatus.CREATED)
    PedidoResponse postPedido(@RequestParam(value = "idCliente") UUID idCliente, @RequestBody @Valid PedidoRequest pedidoRequest);

    @GetMapping(value = "/lista-pedidos")
    @ResponseStatus(value = HttpStatus.OK)
    List<PedidoClienteListResponse> buscaTodosPedidosPorId(@RequestParam(value = "idCliente") UUID idCliente);

    @GetMapping("{idPedido}")
    @ResponseStatus(value = HttpStatus.OK)
    PedidoDetalhadoResponse buscaPedidoPorID(@RequestParam UUID idCliente, @PathVariable UUID idPedido);
}
