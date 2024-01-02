package com.api.apibackend.Modules.Order.Domain.model;

/**
 * ----------------------------------------------------------------------------
 * Autor: Kaue de Matos
 * Empresa: Nova Software
 * Propriedade da Empresa: Todos os direitos reservados
 * ----------------------------------------------------------------------------
 */

import java.util.ArrayList;
import java.util.List;

import com.api.apibackend.Modules.Order.infra.persistence.entity.OrderEntity;
import com.api.apibackend.Modules.OrderItem.infra.persistence.entity.OrderItemEntity;
import com.api.apibackend.Modules.Product.Infra.entity.ProductEntity;

import lombok.Data;

@Data
public class Order {
    private List<ProductEntity> products;
    private OrderEntity orderEntity;

    public Order() {
        this.products = new ArrayList<>();
    }

    public void calculateTotal() {
        float total = 0.0f;
        for (ProductEntity product : products) {
            Float value = product.getPriceEntity().getPrice().floatValue();
            if (product.getPriceEntity().getPrice() != null && value != 0.0f) {
                total += value;
            }
        }
        orderEntity.setTotalValue(total);
    }
    
    
    public void addProduct(ProductEntity product) {
        if (product != null) {
            this.products.add(product);
        }
    }
    
    public void setProducts(List<OrderItemEntity> orderItems) {
        this.products.clear();
        for (OrderItemEntity orderItem : orderItems) {
            ProductEntity product = orderItem.getProduct();
            this.products.add(product);
        }
    }

    public void clearProducts() {
        products.clear();
    }
}
