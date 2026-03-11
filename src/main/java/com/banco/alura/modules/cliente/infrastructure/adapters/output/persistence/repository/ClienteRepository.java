// infrastructure/adapters/output/persistence/repository/ClienteRepository.java
package com.banco.alura.modules.cliente.infrastructure.adapters.output.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banco.alura.modules.cliente.infrastructure.adapters.output.persistence.entity.ClienteEntity;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {
  
}