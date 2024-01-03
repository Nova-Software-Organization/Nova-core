package com.api.apibackend.Modules.Product.Application.useCase.GetAllProduct;

/**
 * ----------------------------------------------------------------------------
 * Autor: Kaue de Matos
 * Empresa: Nova Software
 * Propriedade da Empresa: Todos os direitos reservados
 * ----------------------------------------------------------------------------
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.apibackend.Modules.Product.Domain.model.Product;
import com.api.apibackend.Modules.Product.Domain.service.GetAllProductService;

@Service
public class GetAllProductUseCase {
    private GetAllProductService getAllProductService;

    @Autowired
    public GetAllProductUseCase(GetAllProductService getAllProductService) {
        this.getAllProductService = getAllProductService;
    }

    public List<Product> execute() {
        return getAllProductService.listProducts();
    }
}