package com.api.apibackend.OrderItem.infra.entity;

import java.io.Serializable;

import com.api.apibackend.Order.infra.entity.OrderEntity;
import com.api.apibackend.Product.infra.entity.ProductEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "PedidoItem")
@EqualsAndHashCode(of = "id")
public class OrderItemEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpedItem")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idnumPed")
    private OrderEntity order;

    @ManyToOne
    @JoinColumn(name = "idproduto")
    private ProductEntity product;

    @Column(name = "quantidade")
    private int quantity;

    @Column(name = "precoUni")
    private Double unitPrice;
}
