package com.banco.alura.modules.cuenta.insfrastructure.adapters.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.banco.alura.modules.cuenta.application.ports.output.CuentaOutputPort;
import com.banco.alura.modules.cuenta.domain.service.CuentaService;

@Configuration
public class CuentaBeanConfiguration {
  @Bean
  public CuentaService cuentaService(CuentaOutputPort cuentaOutputPort){
    return new CuentaService(cuentaOutputPort);
  }
}
