// infrastructure/adapters/config/ClienteBeanConfiguration.java
package com.banco.alura.modules.cliente.infrastructure.adapters.config;

import com.banco.alura.modules.cliente.application.ports.output.ClienteOutputPort;
import com.banco.alura.modules.cliente.application.service.ClienteService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClienteBeanConfiguration {
    @Bean
    public ClienteService clienteService(ClienteOutputPort clienteOutputPort) {
        return new ClienteService(clienteOutputPort);
    }
}