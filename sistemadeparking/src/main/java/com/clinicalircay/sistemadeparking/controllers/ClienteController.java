package com.clinicalircay.sistemadeparking.controllers;

import java.util.List;

import com.clinicalircay.sistemadeparking.models.Cargos;
import com.clinicalircay.sistemadeparking.models.Clientes;
import com.clinicalircay.sistemadeparking.services.CargosService;
import com.clinicalircay.sistemadeparking.services.ClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("vistas/clientes")

public class ClienteController {

    @Autowired
    private  ClienteService cs;

    @Autowired
    private CargosService cargoservice;

    @GetMapping("/")
    public String ListadoClientes(Model model){

        List<Clientes> listadoclientes = cs.mostrar();
        model.addAttribute("clientes", listadoclientes);
        return "/vistas/clientes/listar";
    }


    @GetMapping("/crear")
    public String form(Model model) {
        List<Cargos> listacargos = cargoservice.mostrar();
        model.addAttribute("titulo", "Formulario: Crear Cliente");
        model.addAttribute("clientes", new Clientes());
        model.addAttribute("cargos", listacargos);
        return "/vistas/clientes/create";
    }


    
}
