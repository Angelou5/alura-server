package com.banco.alura.modules.cliente.application.ports.input.crear;
import com.banco.alura.modules.cliente.domain.model.Cliente;

public interface CrearClienteUseCase {
    Cliente crearCliente(Cliente cliente);
}