package com.clinicalircay.sistemadeparking.services;

import java.util.List;

import com.clinicalircay.sistemadeparking.models.Area;

public interface AreaService {


    public List<Area> mostrar();
    public void save ( Area area);
    public Area  findbyid(Long id);
    public void  delete(Long id);
    
}
