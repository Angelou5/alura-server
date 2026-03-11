package com.banco.alura.modules.cliente.infrastructure.adapters.input.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banco.alura.modules.cliente.application.ports.input.CrearClienteUseCase;
import com.banco.alura.modules.cliente.domain.model.Cliente;
import com.banco.alura.modules.cliente.infrastructure.adapters.input.rest.data.request.ClienteRequest;
import com.banco.alura.modules.cliente.infrastructure.adapters.input.rest.data.response.ClienteResponse;

@RestController
@RequestMapping("/clientes")
public class ClienteRestAdapter {

    private final CrearClienteUseCase crearClienteUseCase;

    public ClienteRestAdapter(CrearClienteUseCase crearClienteUseCase) {
        this.crearClienteUseCase = crearClienteUseCase;
    }

    @GetMapping
    public List<ClienteResponse> obtenerClientes() {
        // Este método es solo un ejemplo, no implementa la lógica real
        return List.of(
            new ClienteResponse(1L, "Juan Pérez"),
            new ClienteResponse(2L, "María Gómez")
        );
    }

    @PostMapping
    public ClienteResponse crearCliente(@RequestBody ClienteRequest request) {
        // 1. Convertimos el Request (JSON) al Modelo de Dominio puro
        Cliente clientePuro = new Cliente(null, request.nombre());
        
        // 2. Ejecutamos el caso de uso
        Cliente clienteCreado = crearClienteUseCase.crear(clientePuro);
        
        // 3. Devolvemos la Respuesta
        return new ClienteResponse(clienteCreado.getId(), clienteCreado.getNombre());
    }
}