package com.api.apibackend.Customer.Domain.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.api.apibackend.Customer.Infra.persistence.entity.CustomerEntity;
import com.api.apibackend.CustomerAddress.infra.entity.AddressEntity;
import com.api.apibackend.Order.infra.persistence.entity.OrderEntity;
import com.api.apibackend.Product.Infra.entity.ProductEntity;

@Service
public class MyRequestCustomerService {

    public ResponseEntity<Map<String, Object>> buildUserResponse(CustomerEntity client) {
        AddressEntity address = client.getAddress();
        List<OrderEntity> orders = client.getOrders();
        List<ProductEntity> products = new ArrayList<>();

        for (OrderEntity order : orders) {
            products.addAll(order.getProducts());
        }

        Map<String, Object> response = new HashMap<>();
        response.put("client", client);
        response.put("address", address);
        response.put("ordersRequest", orders);
        response.put("products", products);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}