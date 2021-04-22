package com.clinicalircay.sistemadeparking.impl;

import java.util.List;

import com.clinicalircay.sistemadeparking.Repository.VehiculoRepository;
import com.clinicalircay.sistemadeparking.models.Vehiculo;
import com.clinicalircay.sistemadeparking.services.VehiculoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class implvehiculo implements VehiculoService {


    @Autowired
    private VehiculoRepository vr;

    @Override
    public List<Vehiculo> mostrar() {
        return (List<Vehiculo>) vr.findAll();
    }

    @Override
    public void save(Vehiculo vehiculo) {
        vr.save(vehiculo);
        
    }

    @Override
    public Vehiculo findbyid(Long id) {
        return vr.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        vr.deleteById(id);
        
    }
    
}
