// application/ports/output/ClienteOutputPort.java
package com.banco.alura.modules.cliente.application.ports.output;
import com.banco.alura.modules.cliente.domain.model.Cliente;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ClienteOutputPort {
    Cliente guardar(Cliente cliente);
    Optional<Cliente> buscarPorId(UUID id);
    List<Cliente> buscarTodos();
    void eliminarPorId(UUID id);
}