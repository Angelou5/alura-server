
package com.banco.alura.modules.cliente.infrastructure.adapters.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.banco.alura.modules.cliente.application.ports.output.ClienteOutputPort;
import com.banco.alura.modules.cliente.domain.service.ClienteService;

@Configuration
public class ClienteBeanConfiguration {

    @Bean
    public ClienteService clienteService(ClienteOutputPort clienteOutputPort) {
      
        return new ClienteService(clienteOutputPort);
    }
}