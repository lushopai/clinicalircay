package com.clinicalircay.sistemadeparking.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "clientes")
public class Clientes implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotEmpty(message = "campo requerido")
    @Column(nullable = false,length = 12, unique = true)
    @Size(min = 9,max = 12)
    private String rut;
    @NotEmpty(message = "campo requerido")
    private Long nombres;
    @NotEmpty(message = "campo requerido")
    private Long apellidos;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getRut() {
        return rut;
    }
    public void setRut(String rut) {
        this.rut = rut;
    }
    public Long getNombres() {
        return nombres;
    }
    public void setNombres(Long nombres) {
        this.nombres = nombres;
    }
    public Long getApellidos() {
        return apellidos;
    }
    public void setApellidos(Long apellidos) {
        this.apellidos = apellidos;
    }


    

}
