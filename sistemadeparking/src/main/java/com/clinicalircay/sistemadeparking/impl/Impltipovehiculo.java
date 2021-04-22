package com.clinicalircay.sistemadeparking.impl;

import java.util.List;

import com.clinicalircay.sistemadeparking.models.Tipo_Vehiculo;
import com.clinicalircay.sistemadeparking.services.Tipo_vehiculoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Impltipovehiculo implements Tipo_vehiculoService {

   

    @Override
    public List<Tipo_Vehiculo> mostrar() {
        return null;
    }

    @Override
    public void save(Tipo_Vehiculo tipo_Vehiculo) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Tipo_Vehiculo findbyid(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        
    }
    
}
