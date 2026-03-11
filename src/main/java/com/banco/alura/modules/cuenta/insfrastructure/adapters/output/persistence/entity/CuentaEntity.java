package com.banco.alura.modules.cuenta.insfrastructure.adapters.output.persistence.entity;

import java.math.BigDecimal;
import java.sql.Time;

import com.banco.alura.enums.Estados;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cuentas")
public class CuentaEntity {
  @Id
  private String id;
  private String cliente_id;
  private String tipo_cuenta_id;
  private String numero_cuenta;
  private BigDecimal saldo;
 
  private Estados estado;
  
  private Time created_at;

  public String getId() { return id; } 
  public void setId(String id) { this.id = id; }

  public String getCliente_id() { return cliente_id; }
  public void setCliente_id(String cliente_id) { this.cliente_id = cliente_id;}

  public String getTipo_cuenta_id() { return tipo_cuenta_id; }
  public void setTipo_cuenta_id(String tipo_cuenta_id) { this.tipo_cuenta_id = tipo_cuenta_id; }

  public String getNumero_cuenta() { return numero_cuenta; }
  public void setNumero_cuenta(String numero_cuenta) { this.numero_cuenta = numero_cuenta; }

  public BigDecimal getSaldo() { return saldo; }
  public void setSaldo(BigDecimal saldo) { this.saldo = saldo; }

  public Estados getEstado() { return estado; }
  public void setEstado(Estados estado) { this.estado = estado; }

  public Time getCreated_at() { return created_at; }
  public void setCreated_at(Time created_at) { this.created_at = created_at; }

}
