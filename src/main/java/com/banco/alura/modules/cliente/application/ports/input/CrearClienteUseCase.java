
package com.banco.alura.modules.cliente.application.ports.input;

import com.banco.alura.modules.cliente.domain.model.Cliente;

public interface CrearClienteUseCase {
    Cliente crear(Cliente cliente);
}
