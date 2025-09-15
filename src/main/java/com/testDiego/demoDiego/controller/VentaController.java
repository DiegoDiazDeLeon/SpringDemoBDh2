package com.testDiego.demoDiego.controller;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testDiego.demoDiego.model.venta;
import com.testDiego.demoDiego.service.ventaservice;

@RestController
@RequestMapping("api/ventas")
public class VentaController {

    private final ventaservice ventaservice;

    public VentaController(ventaservice ventaservice) {
        this.ventaservice = ventaservice;
    }
    
    @GetMapping
    public List<venta> listar(){
        return ventaservice.listarVentas();
    }

    @PostMapping
    public venta crear(@RequestBody venta venta){
        return ventaservice.crearVenta(venta);
    }

    @DeleteMapping
    public void eliminarVenta(@PathVariable Long id){
        ventaservice.eliminarVenta(id);
    }


    

}
