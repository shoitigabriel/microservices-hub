package com.github.shoitigabriel.ms.pedidos.repositories;

import com.github.shoitigabriel.ms.pedidos.entities.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
