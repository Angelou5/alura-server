package com.banco.alura.modules.cliente.application.ports.input.eliminar;
import java.util.UUID;

public interface EliminarClienteUseCase {
    void eliminarCliente(UUID id);
}