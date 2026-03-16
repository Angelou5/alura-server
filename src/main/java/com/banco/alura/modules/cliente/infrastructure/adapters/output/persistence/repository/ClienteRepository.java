// infrastructure/adapters/output/persistence/repository/ClienteRepository.java
package com.banco.alura.modules.cliente.infrastructure.adapters.output.persistence.repository;

import com.banco.alura.modules.cliente.infrastructure.adapters.output.persistence.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity, UUID> {
}