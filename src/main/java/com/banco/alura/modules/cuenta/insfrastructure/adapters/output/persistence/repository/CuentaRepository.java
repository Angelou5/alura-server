package com.banco.alura.modules.cuenta.insfrastructure.adapters.output.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banco.alura.modules.cuenta.insfrastructure.adapters.output.persistence.entity.CuentaEntity;

public interface  CuentaRepository extends JpaRepository<CuentaEntity, Long> {
  
}
