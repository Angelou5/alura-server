// infrastructure/adapters/output/persistence/mapper/ClienteMapper.java
package com.banco.alura.modules.cliente.infrastructure.adapters.output.persistence.mapper;

import org.springframework.stereotype.Component;

import com.banco.alura.modules.cliente.domain.model.Cliente;
import com.banco.alura.modules.cliente.infrastructure.adapters.output.persistence.entity.ClienteEntity;

@Component
public class ClienteMapper {
    
    public ClienteEntity toEntity(Cliente cliente) {
        ClienteEntity entity = new ClienteEntity();
        entity.setNombre(cliente.getNombre());
      
        return entity;
    }

    public Cliente toDomain(ClienteEntity entity) {
        return new Cliente(entity.getId(), entity.getNombre());
    }
}