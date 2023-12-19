package com.api.apibackend.Cart.Application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.apibackend.Cart.Application.DTOs.CheckoutDTO;
import com.api.apibackend.StockProduct.Application.useCase.StockProductUseCase;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("v1/checkout")
public class CheckoutController {
    private StockProductUseCase stockProductUseCase;

    @Autowired
    public CheckoutController(StockProductUseCase stockProductUseCase) {
        this.stockProductUseCase = stockProductUseCase;
    }

    public boolean stockProduct(@RequestBody CheckoutDTO checkoutDTO) {
        return stockProductUseCase.checkProductStock(checkoutDTO.getIdProduct(), checkoutDTO.getNumberOfItemsProductsCart());
    }
}
