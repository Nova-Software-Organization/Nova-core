package com.api.apibackend.SupplierAddress.infra.repository;

/**
 * ----------------------------------------------------------------------------
 * Autor: Kaue de Matos
 * Empresa: Nova Software
 * Propriedade da Empresa: Todos os direitos reservados
 * ----------------------------------------------------------------------------
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.apibackend.SupplierAddress.infra.persistence.entity.SupplierAddressEntity;

@Repository
public interface SupplierAddressRepository extends JpaRepository<SupplierAddressEntity, Long> { }
