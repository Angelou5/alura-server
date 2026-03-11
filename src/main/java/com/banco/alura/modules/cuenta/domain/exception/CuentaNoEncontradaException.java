package com.banco.alura.modules.cuenta.domain.exception;

public class CuentaNoEncontradaException extends RuntimeException{
  public CuentaNoEncontradaException(String mensaje){
    super(mensaje);
  }
}
