package br.com.siteware.app.Pedido.infra;


import br.com.siteware.app.Pedido.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface ProdutoSpringDataJPARepository extends JpaRepository<Pedido, UUID> {
}
