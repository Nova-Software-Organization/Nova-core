package com.api.apibackend.modules.Price.infra.repository;

/**
 * ----------------------------------------------------------------------------
 * Autor: Kaue de Matos
 * Empresa: Nova Software
 * Propriedade da Empresa: Todos os direitos reservados
 * ----------------------------------------------------------------------------
 */

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.apibackend.modules.Price.infra.entity.PriceEntity;
import com.api.apibackend.modules.Product.Infra.entity.ProductEntity;

@Repository
public interface PriceRepository extends JpaRepository<PriceEntity, Long> {
    Optional<PriceEntity> findByProductEntityAndStatus(ProductEntity product, int status);
}
