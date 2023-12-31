package com.api.apibackend.Order.Application.DTOs;

/**
 * ----------------------------------------------------------------------------
 * Autor: Kaue de Matos
 * Empresa: Nova Software
 * Propriedade da Empresa: Todos os direitos reservados
 * ----------------------------------------------------------------------------
 */

import com.api.apibackend.CustomerAddress.Domain.model.CustomerAddressRequest;

import lombok.Data;

@Data
public class OrderUpdateAddressRequest {
    private Long numberOrder;
    private CustomerAddressRequest customerAddressRequest;
}