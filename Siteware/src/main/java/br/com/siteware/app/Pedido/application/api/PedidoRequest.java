package br.com.siteware.app.Pedido.application.api;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class PedidoRequest {
    @NotBlank
    @Size(message = "Campo descrição não pode estar vazio", max = 100, min = 5)
    private String descricao;
}
