package com.clinicalircay.sistemadeparking.services;

import java.util.List;

import com.clinicalircay.sistemadeparking.models.Vehiculo;

public interface VehiculoService {

    public List<Vehiculo> mostrar();
    public void save ( Vehiculo vehiculo);
    public Vehiculo  findbyid(Long id);
    public void  delete(Long id);

    
}
