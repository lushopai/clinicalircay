package com.clinicalircay.sistemadeparking.impl;

import java.util.List;

import com.clinicalircay.sistemadeparking.Repository.MarcaRepository;
import com.clinicalircay.sistemadeparking.models.Marcas;
import com.clinicalircay.sistemadeparking.services.MarcaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImplMarcas implements MarcaService {

    @Autowired
    private MarcaRepository mr;

    @Override
    public List<Marcas> mostrar() {
        return (List<Marcas>) mr.findAll();
    }

    @Override
    public void save(Marcas marca) {
        mr.save(marca);
        
    }

    @Override
    public Marcas findbyid(Long id) {
        return mr.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        mr.deleteById(id);
        
    }
    
}
