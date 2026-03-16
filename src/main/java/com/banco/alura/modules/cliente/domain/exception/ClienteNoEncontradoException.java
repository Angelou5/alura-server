// domain/exception/ClienteNoEncontradoException.java
package com.banco.alura.modules.cliente.domain.exception;

public class ClienteNoEncontradoException extends RuntimeException {
    public ClienteNoEncontradoException(String message) {
        super(message);
    }
}