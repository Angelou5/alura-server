// application/service/ClienteService.java
package com.banco.alura.modules.cliente.application.service;

import com.banco.alura.modules.cliente.application.ports.input.actualizar.ActualizarClienteUseCase;
import com.banco.alura.modules.cliente.application.ports.input.crear.CrearClienteUseCase;
import com.banco.alura.modules.cliente.application.ports.input.eliminar.EliminarClienteUseCase;
import com.banco.alura.modules.cliente.application.ports.input.obtener.ObtenerClienteUseCase;
import com.banco.alura.modules.cliente.application.ports.output.ClienteOutputPort;
import com.banco.alura.modules.cliente.domain.exception.ClienteNoEncontradoException;
import com.banco.alura.modules.cliente.domain.model.Cliente;
import com.banco.alura.modules.cliente.domain.model.EstadoCliente;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
public class ClienteService implements CrearClienteUseCase, ObtenerClienteUseCase, ActualizarClienteUseCase, EliminarClienteUseCase {

    private final ClienteOutputPort clienteOutputPort;

    @Override
    public Cliente crearCliente(Cliente cliente) {
        // Reglas de negocio al crear
        cliente.setEstado(EstadoCliente.ACTIVO); // Por defecto activo
        cliente.setCreatedAt(LocalDateTime.now());
        return clienteOutputPort.guardar(cliente);
    }

    @Override
    public Cliente obtenerPorId(UUID id) {
        return clienteOutputPort.buscarPorId(id)
                .orElseThrow(() -> new ClienteNoEncontradoException("Cliente no encontrado con ID: " + id));
    }

    @Override
    public List<Cliente> listarTodos() {
        return clienteOutputPort.buscarTodos();
    }

    @Override
    public Cliente actualizarCliente(UUID id, Cliente clienteModificado) {
        Cliente existente = obtenerPorId(id);
        existente.setNombre(clienteModificado.getNombre());
        existente.setApellido(clienteModificado.getApellido());
        existente.setFechaNacimiento(clienteModificado.getFechaNacimiento());
        existente.setEmail(clienteModificado.getEmail());
        existente.setTelefono(clienteModificado.getTelefono());
        // No actualizamos ID ni CreatedAt
        return clienteOutputPort.guardar(existente);
    }

    @Override
    public void eliminarCliente(UUID id) {
        obtenerPorId(id); // Valida que exista
        clienteOutputPort.eliminarPorId(id);
    }
}