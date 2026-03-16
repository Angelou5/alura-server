// infrastructure/adapters/input/rest/data/response/ClienteResponse.java
package com.banco.alura.modules.cliente.infrastructure.adapters.input.rest.data.response;

import lombok.Data;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class ClienteResponse {
    private UUID id;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private String email;
    private String telefono;
    private String estado;
    private LocalDateTime createdAt;
}