package com.clinicalircay.sistemadeparking.services;

import java.util.List;

import com.clinicalircay.sistemadeparking.models.Tipo_Vehiculo;

public interface Tipo_vehiculoService {


    public List<Tipo_Vehiculo> mostrar();
    public void save ( Tipo_Vehiculo tipo_Vehiculo);
    public Tipo_Vehiculo  findbyid(Long id);
    public void  delete(Long id);
    
    
}
