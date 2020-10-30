package com.jr.livraria.services.exceptions;

public class LivroValidationException extends RuntimeException {

    public LivroValidationException(String mensagem) {
        super(mensagem);
    }
}
