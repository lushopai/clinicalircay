package com.clinicalircay.sistemadeparking.controllers;

import java.util.List;

import com.clinicalircay.sistemadeparking.models.Vehiculo;
import com.clinicalircay.sistemadeparking.services.VehiculoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("vistas/vehiculos")

public class VehiculoController {

    @Autowired
    private  VehiculoService vs;


    @GetMapping("/")
    public String ListadoClientes(Model model) {
        List<Vehiculo> listadovehiculos = vs.mostrar();
        model.addAttribute("vehiculos", listadovehiculos);
        return "/vistas/vehiculos/listar";
    }

    
}
