package com.clinicalircay.sistemadeparking.impl;

import java.util.List;

import com.clinicalircay.sistemadeparking.Repository.CargosRepository;
import com.clinicalircay.sistemadeparking.models.Cargos;
import com.clinicalircay.sistemadeparking.services.CargosService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImplCargo implements CargosService {

    @Autowired
    private CargosRepository cr;

    @Override
    public List<Cargos> mostrar() {
        return (List<Cargos>) cr.findAll();
    }

    @Override
    public void save(Cargos cargo) {
        cr.save(cargo);   
    }

    @Override
    public Cargos findbyid(Long id) {
        return cr.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
    cr.deleteById(id);        
    }
    
}
