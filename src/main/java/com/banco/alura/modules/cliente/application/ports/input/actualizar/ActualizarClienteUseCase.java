package com.banco.alura.modules.cliente.application.ports.input.actualizar;
import com.banco.alura.modules.cliente.domain.model.Cliente;
import java.util.UUID;

public interface ActualizarClienteUseCase {
    Cliente actualizarCliente(UUID id, Cliente cliente);
}