package com.clinicalircay.sistemadeparking.services;

import java.util.List;

import com.clinicalircay.sistemadeparking.models.Clientes;

public interface ClienteService {


    public List<Clientes> mostrar();
    public void save(Clientes cliente);
    public Clientes  findbyid(Long id);
    public void  delete(Long id);
    
}
