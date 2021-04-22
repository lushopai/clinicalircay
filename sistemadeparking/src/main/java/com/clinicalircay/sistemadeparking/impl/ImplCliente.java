package com.clinicalircay.sistemadeparking.impl;

import java.util.List;

import com.clinicalircay.sistemadeparking.Repository.ClienteRepository;
import com.clinicalircay.sistemadeparking.models.Clientes;
import com.clinicalircay.sistemadeparking.services.ClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImplCliente  implements ClienteService{

    @Autowired
    private  ClienteRepository cr;

    @Override
    public List<Clientes> mostrar() {
        return (List<Clientes>) cr.findAll();
    }

    @Override
    public void save(Clientes cliente) {
        cr.save(cliente);        
    }

    @Override
    public Clientes findbyid(Long id) {
        return cr.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
    cr.deleteById(id);        
    }
    
}
