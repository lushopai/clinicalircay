package com.clinicalircay.sistemadeparking.controllers;

import java.util.List;

import javax.validation.Valid;

import com.clinicalircay.sistemadeparking.models.Area;
import com.clinicalircay.sistemadeparking.models.Cargos;
import com.clinicalircay.sistemadeparking.models.Clientes;
import com.clinicalircay.sistemadeparking.services.AreaService;
import com.clinicalircay.sistemadeparking.services.CargosService;
import com.clinicalircay.sistemadeparking.services.ClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("vistas/clientes")

public class ClienteController {

    @Autowired
    private ClienteService cs;

    @Autowired
    private CargosService cargoservice;

    @Autowired
    private AreaService as;

    @GetMapping("/")
    public String ListadoClientes(Model model) {

        List<Clientes> listadoclientes = cs.mostrar();
        model.addAttribute("clientes", listadoclientes);
        return "/vistas/clientes/listar";
    }

    @GetMapping("/crear")
    public String form(Model model) {
        List<Cargos> listacargos = cargoservice.mostrar();
        List<Area> listaareas = as.mostrar();
        model.addAttribute("titulo", "Formulario: Crear Cliente");
        model.addAttribute("clientes", new Clientes());
        model.addAttribute("areas", listaareas);
        model.addAttribute("cargos", listacargos);
        return "/vistas/clientes/create";
    }

    @PostMapping("/save")
    public String save(@Valid @ModelAttribute Clientes clientes, BindingResult result, Model model,
            RedirectAttributes attribute) {
        List<Cargos> listacargos = cargoservice.mostrar();
        List<Area> listaareas = as.mostrar();
        if (result.hasErrors()) {
            model.addAttribute("titulo", "Formulario: Crear Cliente");
            model.addAttribute("areas", listaareas);
            model.addAttribute("cargos", listacargos);
            System.out.println(result);
            return "/vistas/clientes/create";
        }
        try {
            cs.save(clientes);
            attribute.addFlashAttribute("success", "Cliente guardado con exito");
            return "redirect:/vistas/clientes/";
        } catch (DataIntegrityViolationException e) {
            System.out.println(e);
            attribute.addFlashAttribute("error", "Cliente ya existe en el sistema");
            return "redirect:/vistas/clientes/";

        }

    }

}
