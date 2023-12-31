package com.api.apibackend.Customer.Infra.persistence.repository;

import java.util.List;

/**
 * ----------------------------------------------------------------------------
 * Autor: Kaue de Matos
 * Empresa: Nova Software
 * Propriedade da Empresa: Todos os direitos reservados
 * ----------------------------------------------------------------------------
 */

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.api.apibackend.Customer.Infra.persistence.entity.CustomerEntity;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {

    @Query("SELECT c FROM CustomerEntity c WHERE c.email = :email")
    Optional<CustomerEntity> findByEmail(String email);
    List<CustomerEntity> findByNameContaining(String name);
    List<CustomerEntity> findByLastNameContaining(String lastName);
    List<CustomerEntity> findByCpfContaining(String cpf);
    List<CustomerEntity> findByPhoneContaining(String phone);
    List<CustomerEntity> findByAge(int age);
    List<CustomerEntity> findByGenderContaining(String gender);
    List<CustomerEntity> findByEmailContaining(String email);
    List<CustomerEntity> findByAddress_CepContaining(String cep);
}