// infrastructure/adapters/output/persistence/ClientePersistenceAdapter.java
package com.banco.alura.modules.cliente.infrastructure.adapters.output.persistence;

import com.banco.alura.modules.cliente.application.ports.output.ClienteOutputPort;
import com.banco.alura.modules.cliente.domain.model.Cliente;
import com.banco.alura.modules.cliente.infrastructure.adapters.output.persistence.mapper.ClienteMapper;
import com.banco.alura.modules.cliente.infrastructure.adapters.output.persistence.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class ClientePersistenceAdapter implements ClienteOutputPort {

    private final ClienteRepository clienteRepository;
    private final ClienteMapper clienteMapper; 

    @Override
    public Cliente guardar(Cliente cliente) {
        var entity = clienteMapper.toEntity(cliente);
        var entityGuardada = clienteRepository.save(entity);
        return clienteMapper.toDomain(entityGuardada);
    }

    // AQUI CAMBIAMOS Long POR UUID
    @Override
    public Optional<Cliente> buscarPorId(UUID id) {
        return clienteRepository.findById(id).map(clienteMapper::toDomain);
    }

    @Override
    public List<Cliente> buscarTodos() {
        return clienteRepository.findAll().stream()
                .map(clienteMapper::toDomain)
                .collect(Collectors.toList());
    }

    // AQUI CAMBIAMOS Long POR UUID
    @Override
    public void eliminarPorId(UUID id) {
        clienteRepository.deleteById(id);
    }
}