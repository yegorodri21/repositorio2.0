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
    private String codigo_pro;
    private String descripcion;
    private String precios_compra;
    private String precios_venta;
    private String can_productos;
    
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

    public int getId_inventario() {
        return id_inventario;
    }

    public void setId_inventario(int id_inventario) {
        this.id_inventario = id_inventario;
    }

    public String getCodigo_pro() {
        return codigo_pro;
    }

    public void setCodigo_pro(String codigo_pro) {
        this.codigo_pro = codigo_pro;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecios_compra() {
        return precios_compra;
    }

    public void setPrecios_compra(String precios_compra) {
        this.precios_compra = precios_compra;
    }

    public String getPrecios_venta() {
        return precios_venta;
    }

    public void setPrecios_venta(String precios_venta) {
        this.precios_venta = precios_venta;
    }

    public String getCan_productos() {
        return can_productos;
    }

    public void setCan_productos(String can_productos) {
        this.can_productos = can_productos;
    }
    
}
