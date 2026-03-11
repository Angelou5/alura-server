package com.banco.alura.modules.cuenta.domain.model;

import java.math.BigDecimal;
import java.sql.Time;

import com.banco.alura.enums.Estados;

public class Cuenta {
  private final String id;
  private final String cliente_id;
  private final String tipo_cuenta_id;
  private final String numero_cuenta;
  private final BigDecimal saldo;
  private final Estados estado;
  private final Time created_at;

  public Cuenta( String id, String cliente_id, String tipo_cuenta_id, String numero_cuenta, BigDecimal saldo, Estados estado, Time created_at) {
    this.id = id;
    this.cliente_id = cliente_id;
    this.tipo_cuenta_id = tipo_cuenta_id;
    this.numero_cuenta = numero_cuenta;
    this.saldo = saldo;
    this.estado = estado;
    this.created_at= created_at;
    
  }

  public String getId() { return id; }

  public String getCliente_id() { return cliente_id; }
  
  public String getTipo_cuenta_id() { return tipo_cuenta_id; }

  public String getNumero_cuenta() { return numero_cuenta; }

  public BigDecimal getSaldo() { return saldo; }

  public Estados getEstado() { return estado; }

  public Time getCreated_at() { return created_at; }

}
