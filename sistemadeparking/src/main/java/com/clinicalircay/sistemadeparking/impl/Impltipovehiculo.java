package com.clinicalircay.sistemadeparking.impl;

import java.util.List;

import com.clinicalircay.sistemadeparking.Repository.tipoRepository;
import com.clinicalircay.sistemadeparking.models.Tipo_Vehiculo;
import com.clinicalircay.sistemadeparking.services.Tipo_vehiculoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Impltipovehiculo implements Tipo_vehiculoService {

    @Autowired
    private tipoRepository tr;

   

    @Override
    public List<Tipo_Vehiculo> mostrar() {
        return (List<Tipo_Vehiculo>) tr.findAll();
    }

    @Override
    public void save(Tipo_Vehiculo tipo_Vehiculo) {
        tr.save(tipo_Vehiculo);
        
    }

    @Override
    public Tipo_Vehiculo findbyid(Long id) {
        return tr.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        tr.deleteById(id);
        
    }
    
}
