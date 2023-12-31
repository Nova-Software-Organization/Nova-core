package com.api.apibackend.Customer.Application.useCase;

/**
 * ----------------------------------------------------------------------------
 * Autor: Kaue de Matos
 * Empresa: Nova Software
 * Propriedade da Empresa: Todos os direitos reservados
 * ----------------------------------------------------------------------------
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.api.apibackend.Customer.Application.DTOs.ResponseMessageDTO;
import com.api.apibackend.Customer.Application.DTOs.registration.CustomerAddressDTO;
import com.api.apibackend.Customer.Application.DTOs.registration.CustomerDTO;
import com.api.apibackend.Customer.Domain.exception.ErrorEmptyCustomer;
import com.api.apibackend.Customer.Domain.service.CustomerService;

@Service
public class CustomerUpdateUseCase {
    private CustomerService customerServiceImp;

    @Autowired
    public CustomerUpdateUseCase(CustomerService customerServiceImp) {
        this.customerServiceImp = customerServiceImp;
    }

     public ResponseEntity<ResponseMessageDTO> execute(Long id, CustomerDTO customerDTO, CustomerAddressDTO customerAddressDTO) {
        try {
            if (customerDTO == null) {
                throw new ErrorEmptyCustomer("Erro: dados do cliente não fornecidos!");
            }
            
            return customerServiceImp.update(id, customerDTO, customerAddressDTO);
        } catch (ErrorEmptyCustomer e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseMessageDTO("Erro", this.getClass().getName(), e.getMessage()));
        }
    }
}
