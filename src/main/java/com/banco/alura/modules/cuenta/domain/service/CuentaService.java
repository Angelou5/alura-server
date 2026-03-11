package com.banco.alura.modules.cuenta.domain.service;

import com.banco.alura.modules.cuenta.application.ports.input.CrearCuentaUseCase;
import com.banco.alura.modules.cuenta.application.ports.output.CuentaOutputPort;
import com.banco.alura.modules.cuenta.domain.model.Cuenta;


public class CuentaService implements CrearCuentaUseCase {

  private final CuentaOutputPort cuentaOutputPort;
  
  public CuentaService(CuentaOutputPort cuentaOutputPort){
    this.cuentaOutputPort = cuentaOutputPort;
  }

  @Override
  public Cuenta crear(Cuenta cuenta){
    return cuentaOutputPort.guardar(cuenta);
  }
  
}
