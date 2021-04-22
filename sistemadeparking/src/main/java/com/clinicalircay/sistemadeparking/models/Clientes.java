package com.clinicalircay.sistemadeparking.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Clientes implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String rut;
    private String nombres;
    private String  apellidos;
    private Long telefono;
    private String correo;
    private String direccion;
    private String beneficiario;
    private String comentarios;
    private  Long descuento_plantilla;



    @ManyToOne
    @JoinColumn
    private Cargos cargo;

    @ManyToOne
    @JoinColumn
    private Area area;



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
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public Long getTelefono() {
        return telefono;
    }
    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public Cargos getCargo() {
        return cargo;
    }
    public void setCargo(Cargos cargo) {
        this.cargo = cargo;
    }
    public Area getArea() {
        return area;
    }
    public void setArea(Area area) {
        this.area = area;
    }
    public String getBeneficiario() {
        return beneficiario;
    }
    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }
    public String getComentarios() {
        return comentarios;
    }
    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
    public Long getDescuento_plantilla() {
        return descuento_plantilla;
    }
    public void setDescuento_plantilla(Long descuento_plantilla) {
        this.descuento_plantilla = descuento_plantilla;
    }

    

    

    
    

    


    


    

}
