package com.banco.alura.modules.cuenta.insfrastructure.adapters.output.persistence.mapper;

import org.springframework.stereotype.Component;

import com.banco.alura.modules.cuenta.domain.model.Cuenta;
import com.banco.alura.modules.cuenta.insfrastructure.adapters.output.persistence.entity.CuentaEntity;

@Component
public class CuentaMapper {
  
  public CuentaEntity toEntity(Cuenta cuenta) {
    CuentaEntity cuentaEntity = new CuentaEntity();
    cuentaEntity.setId(cuenta.getId());
    cuentaEntity.setNumero_cuenta(cuenta.getNumero_cuenta());
    cuentaEntity.setSaldo(cuenta.getSaldo());
    return cuentaEntity;
  }

  public Cuenta toDomain(CuentaEntity cuentaEntity) {
    Cuenta cuenta = new Cuenta(
      cuentaEntity.getId(),
      cuentaEntity.getCliente_id(),
      cuentaEntity.getTipo_cuenta_id(),
      cuentaEntity.getNumero_cuenta(),
      cuentaEntity.getSaldo(),
      cuentaEntity.getEstado(),
      cuentaEntity.getCreated_at()
    );
   
    return cuenta;
  }

}
