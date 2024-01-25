package br.com.siteware.app.Pedido;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
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
    private Double total = 0.0;
    private LocalDateTime DataHoraDoPedido;

}
