// infrastructure/adapters/input/rest/ClienteRestAdapter.java
package com.banco.alura.modules.cliente.infrastructure.adapters.input.rest;

import com.banco.alura.modules.cliente.application.service.ClienteService;
import com.banco.alura.modules.cliente.domain.model.Cliente;
import com.banco.alura.modules.cliente.infrastructure.adapters.input.rest.data.request.ClienteRequest;
import com.banco.alura.modules.cliente.infrastructure.adapters.input.rest.data.response.ClienteResponse;
import com.banco.alura.modules.cliente.infrastructure.adapters.output.persistence.mapper.ClienteMapper;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/clientes")
@RequiredArgsConstructor
public class ClienteRestAdapter {

    private final ClienteService clienteService;
    private final ClienteMapper clienteMapper;

    @PostMapping
    public ResponseEntity<ClienteResponse> crear(@Valid @RequestBody ClienteRequest request) {
        Cliente cliente = clienteMapper.toDomain(request);
        Cliente clienteCreado = clienteService.crearCliente(cliente);
        return new ResponseEntity<>(clienteMapper.toResponse(clienteCreado), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClienteResponse> obtenerPorId(@PathVariable UUID id) {
        Cliente cliente = clienteService.obtenerPorId(id);
        return ResponseEntity.ok(clienteMapper.toResponse(cliente));
    }

    @GetMapping
    public ResponseEntity<List<ClienteResponse>> listarTodos() {
        List<ClienteResponse> respuestas = clienteService.listarTodos().stream()
                .map(clienteMapper::toResponse)
                .collect(Collectors.toList());
        return ResponseEntity.ok(respuestas);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ClienteResponse> actualizar(@PathVariable UUID id, @Valid @RequestBody ClienteRequest request) {
        Cliente clienteModificado = clienteMapper.toDomain(request);
        Cliente actualizado = clienteService.actualizarCliente(id, clienteModificado);
        return ResponseEntity.ok(clienteMapper.toResponse(actualizado));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable UUID id) {
        clienteService.eliminarCliente(id);
        return ResponseEntity.noContent().build();
    }
}