package com.testDiego.demoDiego.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class venta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String producto;
    private Integer cantidad;
    private Double precio;

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    
    public Integer getCantidad(){
        return cantidad;
    }

    public void setgetCantidad(Integer cantidad){
        this.cantidad = cantidad;
    }
    
    public Double getPrecio(){
        return precio;
    }

    public void setId(Double precio){
        this.precio = precio;
    }
    
    public String getProducto(){
        return producto;
    }

    public void setProducto(String producto){
        this.producto = producto;
    }


}
