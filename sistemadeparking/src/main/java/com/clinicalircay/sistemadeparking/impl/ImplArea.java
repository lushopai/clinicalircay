package com.clinicalircay.sistemadeparking.impl;

import java.util.List;

import com.clinicalircay.sistemadeparking.Repository.AreaRepository;
import com.clinicalircay.sistemadeparking.models.Area;
import com.clinicalircay.sistemadeparking.services.AreaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImplArea implements AreaService {


    @Autowired
    private AreaRepository ar;

    @Override
    public List<Area> mostrar() {
        return (List<Area>) ar.findAll();
    }

    @Override
    public void save(Area area) {
        ar.save(area);
        
    }

    @Override
    public Area findbyid(Long id) {
        return ar.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        ar.deleteById(id);
        
    }
    
}
