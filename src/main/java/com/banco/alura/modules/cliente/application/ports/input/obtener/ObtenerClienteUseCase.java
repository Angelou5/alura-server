package com.banco.alura.modules.cliente.application.ports.input.obtener;
import com.banco.alura.modules.cliente.domain.model.Cliente;
import java.util.List;
import java.util.UUID;

public interface ObtenerClienteUseCase {
    Cliente obtenerPorId(UUID id);
    List<Cliente> listarTodos();
}