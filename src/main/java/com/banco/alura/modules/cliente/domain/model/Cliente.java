// domain/model/Cliente.java
package com.banco.alura.modules.cliente.domain.model;

public class Cliente {
    private final Long id;
    private final String nombre;
    

    public Cliente(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    // getters y setters 
    public String getNombre() { return nombre; }
    
    public Long getId() {return this.id;}

}