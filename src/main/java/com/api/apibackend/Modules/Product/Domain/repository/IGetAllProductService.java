package com.api.apibackend.Modules.Product.Domain.repository;

/**
 * ----------------------------------------------------------------------------
 * Autor: Kaue de Matos
 * Empresa: Nova Software
 * Propriedade da Empresa: Todos os direitos reservados
 * ----------------------------------------------------------------------------
 */

import java.util.List;

import com.api.apibackend.Modules.Product.Domain.model.Product;
import com.api.apibackend.Modules.Product.Infra.entity.ProductEntity;

public interface IGetAllProductService {
    List<Product> getAllProductsFromCache();
    Product mapToProduct(ProductEntity product);
    List<Product> listProducts();
}
