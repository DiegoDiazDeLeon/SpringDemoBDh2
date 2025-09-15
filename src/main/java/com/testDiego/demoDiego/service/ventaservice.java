package com.testDiego.demoDiego.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.testDiego.demoDiego.model.venta;
import com.testDiego.demoDiego.repository.ventarepository;

@Service
public class ventaservice {

    private final ventarepository ventarepository;

    public ventaservice(ventarepository ventarepository){
        this.ventarepository = ventarepository;
    }

    public List<venta> listarVentas(){
        return ventarepository.findAll();
    }

    public venta crearVenta(venta venta){
        return ventarepository.save(venta);
    }

    public void eliminarVenta(Long id) {
        ventarepository.deleteById(id);
    }

}