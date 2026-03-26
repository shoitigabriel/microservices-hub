package com.github.shoitigabriel.ms.pedidos.service;

import com.github.shoitigabriel.ms.pedidos.dto.PedidoDTO;
import com.github.shoitigabriel.ms.pedidos.entities.Pedido;
import com.github.shoitigabriel.ms.pedidos.repositories.PedidoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Transactional(readOnly = true)
    public List<PedidoDTO> findAllPedidos(){

        return pedidoRepository.findAll()
                .stream().map(PedidoDTO::new).toList();
    }

}
