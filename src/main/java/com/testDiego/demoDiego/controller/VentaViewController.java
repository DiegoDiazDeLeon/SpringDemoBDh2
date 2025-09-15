package com.testDiego.demoDiego.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.testDiego.demoDiego.service.ventaservice;

@Controller
public class VentaViewController {

    private ventaservice ventaservice;

    public VentaViewController(ventaservice ventaservice) {
        this.ventaservice = ventaservice;
    }

    @GetMapping("/vista-ventas")
    public String mostrarVentas(Model model){
        model.addAttribute("ventas",ventaservice.listarVentas());
        return "ventas";
    }

}
