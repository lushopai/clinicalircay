package com.clinicalircay.sistemadeparking.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@Table(name = "vehiculo")
public class Vehiculo implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String modelo;
    private String patente;
    private Date fecharegistro;

    @ManyToOne
    @JoinColumn
    private Clientes cliente;

    @ManyToOne
    @JoinColumn
    private Marcas marca;

    @ManyToOne
    @JoinColumn
    private Tipo_Vehiculo tipo_Vehiculo;


    @PrePersist 
    public void PrePersist() {
        fecharegistro = new Date();
    }

    




    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getPatente() {
        return patente;
    }
    public void setPatente(String patente) {
        this.patente = patente;
    }
    public Date getFecharegistro() {
        return fecharegistro;
    }
    public void setFecharegistro(Date fecharegistro) {
        this.fecharegistro = fecharegistro;
    }
    public Clientes getCliente() {
        return cliente;
    }
    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }
    public Marcas getMarca() {
        return marca;
    }
    public void setMarca(Marcas marca) {
        this.marca = marca;
    }
    public Tipo_Vehiculo getTipo_Vehiculo() {
        return tipo_Vehiculo;
    }
    public void setTipo_Vehiculo(Tipo_Vehiculo tipo_Vehiculo) {
        this.tipo_Vehiculo = tipo_Vehiculo;
    }

    

    



    
}
