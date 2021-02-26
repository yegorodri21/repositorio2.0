/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja_modelo;

/**
 *
 * @author Usuario
 */
public class Inventario {
    private int id_inventario;
    private int codigo_pro;
    private String descripcion;
    private Double precios_compra;
    private Double precios_venta;
    private int can_productos;
    
    @Override
    public String toString() {
        return "inventario{" + " id_inventario=" +  id_inventario + ", codigo_pro=" + codigo_pro + ", descripcion=" + descripcion + ", precios_compra=" + precios_compra + ", precios_venta=" + precios_venta + ", can_productos=" + can_productos + '}';
    }
    

//    public Inventario(int id_inventario, int codigo_pro, String descripcion, Double precios_compra, Double precios_venta, int can_productos) {
//        this.id_inventario = id_inventario;
//        this.codigo_pro = codigo_pro;
//        this.descripcion = descripcion;
//        this.precios_compra = precios_compra;
//        this.precios_venta = precios_venta;
//        this.can_productos =can_productos;
//    }

  
    public void setId_inventario(int id_inventario) {
        this.id_inventario = id_inventario;
    }

    public void setCodigo_pro(int codigo_pro) {
        this.codigo_pro = codigo_pro;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecios_compra(Double precios_compra) {
        this.precios_compra = precios_compra;
    }

    public void setPrecios_venta(Double precios_venta) {
        this.precios_venta = precios_venta;
    }

    public void setCan_productos(int can_productos) {
        this.can_productos = can_productos;
    }

    public int getId_inventario() {
        return id_inventario;
    }

    public int getCodigo_pro() {
        return codigo_pro;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Double getPrecios_compra() {
        return precios_compra;
    }

    public Double getPrecios_venta() {
        return precios_venta;
    }

    public int getCan_productos() {
        return can_productos;
    }
    
    
    

    
    
}
