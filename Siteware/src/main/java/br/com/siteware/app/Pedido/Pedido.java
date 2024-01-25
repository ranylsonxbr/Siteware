package br.com.siteware.app.Pedido;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", name = "idPedido", updatable = false, unique = true, nullable = false)
    private UUID idPedido;
    @NotNull
    @Column(columnDefinition = "uuid", name = "idCliente", nullable = false)
    private UUID idCliente;
    @NotBlank
    @Size(message = "Campo descrição não pode estar vazio", max = 100, min = 5)
    private String descricao;
    private Double total = 0.0;
    private LocalDateTime DataHoraDoPedido;

}
