package com.clinicalircay.sistemadeparking.services;

import java.util.List;

import com.clinicalircay.sistemadeparking.models.Marcas;

public interface MarcaService {

    public List<Marcas> mostrar();
    public void save ( Marcas marca);
    public Marcas  findbyid(Long id);
    public void  delete(Long id);
    
}
