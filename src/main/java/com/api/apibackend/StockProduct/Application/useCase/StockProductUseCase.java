package com.api.apibackend.StockProduct.Application.useCase;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.apibackend.Product.Infra.entity.ProductEntity;
import com.api.apibackend.Product.Infra.repository.ProductRepository;
import com.api.apibackend.StockProduct.Domain.model.StockProduct;

@Service
public class StockProductUseCase {
    private ProductRepository productRepository;
    private StockProduct stockProduct;

    @Autowired
    public StockProductUseCase(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public boolean checkProductStock(Long idProduct, int quantityToCheck) {
        Optional<ProductEntity> product = productRepository.findById(idProduct);
        if (product != null) {
            return stockProduct.hasEnoughStock(quantityToCheck);
        }
        return false;
    }
}
