package com.api.apibackend.Cart.Infra.persistence.repository;

/**
 * ----------------------------------------------------------------------------
 * Autor: Kaue de Matos
 * Empresa: Nova Software
 * Propriedade da Empresa: Todos os direitos reservados
 *
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.apibackend.Cart.Infra.persistence.entity.CartEntity;

@Repository
public interface CartRepository extends JpaRepository<CartEntity, Long> { }