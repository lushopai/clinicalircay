package com.clinicalircay.sistemadeparking.controllers;

import java.util.List;

import javax.validation.Valid;

import com.clinicalircay.sistemadeparking.models.Clientes;
import com.clinicalircay.sistemadeparking.models.Marcas;
import com.clinicalircay.sistemadeparking.models.Tipo_Vehiculo;
import com.clinicalircay.sistemadeparking.models.Vehiculo;
import com.clinicalircay.sistemadeparking.services.ClienteService;
import com.clinicalircay.sistemadeparking.services.MarcaService;
import com.clinicalircay.sistemadeparking.services.Tipo_vehiculoService;
import com.clinicalircay.sistemadeparking.services.VehiculoService;

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
@RequestMapping("vistas/vehiculos")

public class VehiculoController {

    @Autowired
    private  VehiculoService vs;

    @Autowired
    private MarcaService ms;

    @Autowired
    private Tipo_vehiculoService ts;

    @Autowired
    private ClienteService cs;


    @GetMapping("/")
    public String ListadoClientes(Model model) {
        List<Vehiculo> listadovehiculos = vs.mostrar();
        List<Clientes> listadoclientes =  cs.mostrar();
        List<Marcas> listadomarcas = ms.mostrar();
        List<Tipo_Vehiculo> listadotipo = ts.mostrar();
        model.addAttribute("marcas", new Marcas());
        model.addAttribute("vehi", new Vehiculo());
        model.addAttribute("tipo", new Tipo_Vehiculo());
        model.addAttribute("vehiculos", listadovehiculos);
        model.addAttribute("lismarcas", listadomarcas);
        model.addAttribute("lisclientes", listadoclientes);
        model.addAttribute("listipo", listadotipo);
        return "/vistas/vehiculos/listar";
    }

    @PostMapping("/savemarca")
    public String save2(@Valid @ModelAttribute Marcas marcas, BindingResult result, Model model,
            RedirectAttributes attribute) {
        if (result.hasErrors()) {
            model.addAttribute("titulo", "Formulario: Registrar Vehiculo");
            System.out.println(result);
            return "/vistas/vehiculos/";
        }
        try {
            ms.save(marcas);
            attribute.addFlashAttribute("success", "Vehiculo guardado con exito");
            return "redirect:/vistas/vehiculos/";
        } catch (DataIntegrityViolationException e) {
            System.out.println(e);
            attribute.addFlashAttribute("error", "Vehiculo ya existe en el sistema");
            return "redirect:/vistas/vehiculos/";

        }

    }
    @PostMapping("/savetipo")
    public String save3(@Valid @ModelAttribute Tipo_Vehiculo tipo_Vehiculo, BindingResult result, Model model,
            RedirectAttributes attribute) {
        if (result.hasErrors()) {
            model.addAttribute("titulo", "Formulario: Registrar Tipo");
            System.out.println(result);
            return "/vistas/vehiculos/";
        }
        try {
            ts.save(tipo_Vehiculo);
            attribute.addFlashAttribute("success", "Tipo guardado con exito");
            return "redirect:/vistas/vehiculos/";
        } catch (DataIntegrityViolationException e) {
            System.out.println(e);
            attribute.addFlashAttribute("error", "Tipo ya existe en el sistema");
            return "redirect:/vistas/vehiculos/";

        }

    }

    @PostMapping("/savevehiculo")
    public String save3(@Valid @ModelAttribute Vehiculo vehiculo, BindingResult result, Model model,
            RedirectAttributes attribute) {
        if (result.hasErrors()) {
            model.addAttribute("titulo", "Formulario: Registrar Vehiculo");
            System.out.println(result);
            return "/vistas/vehiculos/";
        }
        try {
            vs.save(vehiculo);
            attribute.addFlashAttribute("success", "Vehiculo guardado con exito");
            return "redirect:/vistas/vehiculos/";
        } catch (DataIntegrityViolationException e) {
            System.out.println(e);
            attribute.addFlashAttribute("error", "Vehiculo ya existe en el sistema");
            return "redirect:/vistas/vehiculos/";

        }

    }

    
}
