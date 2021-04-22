package com.clinicalircay.sistemadeparking.services;

import java.util.List;

import com.clinicalircay.sistemadeparking.models.Cargos;

public interface CargosService {

    public List<Cargos> mostrar();
    public void save(Cargos cargo);
    public Cargos  findbyid(Long id);
    public void  delete(Long id);
    
}
