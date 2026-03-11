// infrastructure/adapters/output/persistence/entity/ClienteEntity.java
package com.banco.alura.modules.cliente.infrastructure.adapters.output.persistence.entity;

import java.sql.Time;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clientes")
public class ClienteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private Time fecha_nacimiento;
    private String email;
    private String telefono;
    // estado
    private Time created_at;

    // Getters y Setters ...
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public Time getFecha_nacimiento() { return fecha_nacimiento; }
    public void setFecha_nacimiento(Time fecha_nacimiento) { this.fecha_nacimiento = fecha_nacimiento; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public Time getCreated_at() { return created_at; }
    public void setCreated_at(Time created_at) { this.created_at = created_at; }
}