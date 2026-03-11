package com.banco.alura.modules.cliente.infrastructure.adapters.output.persistence;

import org.springframework.stereotype.Component;

import com.banco.alura.modules.cliente.application.ports.output.ClienteOutputPort;
import com.banco.alura.modules.cliente.domain.model.Cliente;
import com.banco.alura.modules.cliente.infrastructure.adapters.output.persistence.entity.ClienteEntity;
import com.banco.alura.modules.cliente.infrastructure.adapters.output.persistence.mapper.ClienteMapper;
import com.banco.alura.modules.cliente.infrastructure.adapters.output.persistence.repository.ClienteRepository;

@Component
public class ClientePersistenceAdapter implements ClienteOutputPort {

    private final ClienteRepository clienteRepository;
    private final ClienteMapper clienteMapper;

    public ClientePersistenceAdapter(ClienteRepository clienteRepository, ClienteMapper clienteMapper) {
        this.clienteRepository = clienteRepository;
        this.clienteMapper = clienteMapper;
    }

    @Override
    public Cliente guardar(Cliente cliente) {
        ClienteEntity clienteEntity = clienteMapper.toEntity(cliente);
        clienteEntity = clienteRepository.save(clienteEntity);
        return clienteMapper.toDomain(clienteEntity);
    }
}
