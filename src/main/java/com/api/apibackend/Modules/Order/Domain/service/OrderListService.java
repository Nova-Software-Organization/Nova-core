/**
 * ----------------------------------------------------------------------------
 * Autor: Kaue de Matos
 * Empresa: Nova Software
 * Propriedade da Empresa: Todos os direitos reservados
 * ----------------------------------------------------------------------------
 */

package com.api.apibackend.Modules.Order.Domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.api.apibackend.Modules.Order.infra.persistence.entity.OrderEntity;
import com.api.apibackend.Modules.Order.infra.persistence.repository.OrderRepository;

@Service
public class OrderListService {
    private OrderRepository orderRepository;

    @Autowired
    public OrderListService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public ResponseEntity<List<OrderEntity>> getOrderList() {
        List<OrderEntity> listOrder = orderRepository.findAll();
        return ResponseEntity.ok(listOrder);
    }
}
