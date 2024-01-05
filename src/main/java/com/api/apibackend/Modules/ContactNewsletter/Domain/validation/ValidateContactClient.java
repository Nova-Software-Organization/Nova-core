/**
 * ----------------------------------------------------------------------------
 * Autor: Kaue de Matos
 * Empresa: Nova Software
 * Propriedade da Empresa: Todos os direitos reservados
 * ----------------------------------------------------------------------------
 */

package com.api.apibackend.Modules.ContactNewsletter.Domain.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.apibackend.Modules.Auth.Infra.validation.AutheticationValidationServiceHandler;
import com.api.apibackend.Modules.ContactNewsletter.Application.DTOs.ContactDTO;

@Service
public class ValidateContactClient {

    @Autowired
    private AutheticationValidationServiceHandler clientValidationServiceHandler;

    public boolean validateContactHandler(ContactDTO contactRequest) {
        if (contactRequest != null) {
            boolean isValidEmail = clientValidationServiceHandler.isValidEmail(contactRequest.getEmail()) != null;

            if (isValidEmail) {
                return true;
            }
        }
        return false;
    }
}
