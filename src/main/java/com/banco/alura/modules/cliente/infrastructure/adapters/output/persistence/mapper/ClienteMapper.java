// infrastructure/adapters/output/persistence/mapper/ClienteMapper.java
package com.banco.alura.modules.cliente.infrastructure.adapters.output.persistence.mapper;

import com.banco.alura.modules.cliente.domain.model.Cliente;
import com.banco.alura.modules.cliente.infrastructure.adapters.input.rest.data.request.ClienteRequest;
import com.banco.alura.modules.cliente.infrastructure.adapters.input.rest.data.response.ClienteResponse;
import com.banco.alura.modules.cliente.infrastructure.adapters.output.persistence.entity.ClienteEntity;
import org.mapstruct.Mapper;

// Usamos "spring" directamente como texto. Esto evita errores de compatibilidad de versiones.
@Mapper(componentModel = "spring")
public interface ClienteMapper {
    // Dominio <-> BD
    ClienteEntity toEntity(Cliente cliente);
    Cliente toDomain(ClienteEntity entity);

    // DTO <-> Dominio
    Cliente toDomain(ClienteRequest request);
    ClienteResponse toResponse(Cliente cliente);
}