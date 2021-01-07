package com.digital.crud.saladereuniao.saladereuniao.exception;

import org.springframework.http.HttpStatus; //é o status da aplicação
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends Exception{
    private static final long serialVersionUID = 1L; //1L significa long

    public ResourceNotFoundException(String message){
        super(message);
    }
}
