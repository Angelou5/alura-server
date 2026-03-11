package com.banco.alura.modules.cuenta.insfrastructure.adapters.output.persistence;

import org.springframework.stereotype.Component;

import com.banco.alura.modules.cuenta.application.ports.output.CuentaOutputPort;
import com.banco.alura.modules.cuenta.domain.model.Cuenta;
import com.banco.alura.modules.cuenta.insfrastructure.adapters.output.persistence.entity.CuentaEntity;
import com.banco.alura.modules.cuenta.insfrastructure.adapters.output.persistence.mapper.CuentaMapper;
import com.banco.alura.modules.cuenta.insfrastructure.adapters.output.persistence.repository.CuentaRepository;

@Component
public class CuentaPersistenceAdapter implements CuentaOutputPort {
  
  private final CuentaRepository cuentaRepository;
  private final CuentaMapper cuentaMapper;

  public CuentaPersistenceAdapter(CuentaRepository cuentaRepository, CuentaMapper cuentaMapper) {
    this.cuentaRepository = cuentaRepository;
    this.cuentaMapper = cuentaMapper;
  }

  @Override
  public Cuenta guardar(Cuenta cuenta) {
    CuentaEntity cuentaEntity = cuentaMapper.toEntity(cuenta);
    cuentaEntity = cuentaRepository.save(cuentaEntity);
    return cuentaMapper.toDomain(cuentaEntity);

  }

}
