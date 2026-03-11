// domain/service/ClienteService.java
package com.banco.alura.modules.cliente.domain.service;

import com.banco.alura.modules.cliente.application.ports.input.CrearClienteUseCase;
import com.banco.alura.modules.cliente.application.ports.output.ClienteOutputPort;
import com.banco.alura.modules.cliente.domain.model.Cliente;

// ¡Ojo! No lleva @Service de Spring
public class ClienteService implements CrearClienteUseCase {

    private final ClienteOutputPort clienteOutputPort;

    public ClienteService(ClienteOutputPort clienteOutputPort) {
        this.clienteOutputPort = clienteOutputPort;
    }

    @Override
    public Cliente crear(Cliente cliente) {
        // Aquí irían tus reglas de negocio (ej. validar el RFC)
        return clienteOutputPort.guardar(cliente);
    }
}