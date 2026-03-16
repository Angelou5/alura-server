// infrastructure/adapters/input/rest/data/request/ClienteRequest.java
package com.banco.alura.modules.cliente.infrastructure.adapters.input.rest.data.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@NoArgsConstructor // Muy importante para que Spring deserialice el JSON
@AllArgsConstructor
public class ClienteRequest {
    
    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;
    
    @NotBlank(message = "El apellido es obligatorio")
    private String apellido;
    
    private LocalDate fechaNacimiento;
    
    @Email(message = "Formato de correo inválido")
    private String email;
    
    private String telefono;
}