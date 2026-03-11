package com.banco.alura.modules.cuenta.application.ports.input;

import com.banco.alura.modules.cuenta.domain.model.Cuenta;

public interface CrearCuentaUseCase {
  Cuenta crear(Cuenta cuenta);
}
