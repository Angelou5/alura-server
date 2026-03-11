package com.banco.alura.modules.cuenta.application.ports.output;

import com.banco.alura.modules.cuenta.domain.model.Cuenta;

public interface CuentaOutputPort {
  Cuenta guardar(Cuenta cuenta);
}
