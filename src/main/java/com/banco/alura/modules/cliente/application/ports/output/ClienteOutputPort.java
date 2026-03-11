// application/ports/output/ClienteOutputPort.java
package com.banco.alura.modules.cliente.application.ports.output;

import com.banco.alura.modules.cliente.domain.model.Cliente;

public interface ClienteOutputPort {
    Cliente guardar(Cliente cliente);
}