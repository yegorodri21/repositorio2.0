
package com.istloja_modelo;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Inventario {
    private int id_inventario;
    private String codigo_pro;
    private String descripcion;
    private Double precio_compra_con_iva;
    private Double precio_compra_sin_iva;
    private String can_productos;
    private String precio_mayorista;
    private String precio_cliente_fijo;
    private String precio_cliente_normal;
    private Date fecha_elaboracion;
    private Date fecha_caducidad;
    private Date fecha_R;

    @Override
    public String toString() {
        return "Inventario{" + "id_inventario=" + id_inventario + ", codigo_pro=" + codigo_pro + ", descripcion=" + descripcion + ", precio_compra_con_iva=" + precio_compra_con_iva + ", precio_compra_sin_iva=" + precio_compra_sin_iva + ", can_productos=" + can_productos + ", precio_mayorista=" + precio_mayorista + ", precio_cliente_fijo=" + precio_cliente_fijo + ", precio_cliente_normal=" + precio_cliente_normal + ", fecha_elacboracion=" + fecha_elaboracion + ", fecha_caducidad=" + fecha_caducidad + ", fecha_R=" + fecha_R + '}';
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

    public Double getPrecio_compra_con_iva() {
        return precio_compra_con_iva;
    }

    public void setPrecio_compra_con_iva(Double precio_compra_con_iva) {
        this.precio_compra_con_iva = precio_compra_con_iva;
    }

    public Double getPrecio_compra_sin_iva() {
        return precio_compra_sin_iva;
    }

    public void setPrecio_compra_sin_iva(Double precio_compra_sin_iva) {
        this.precio_compra_sin_iva = precio_compra_sin_iva;
    }
    

    public String getCan_productos() {
        return can_productos;
    }

    public void setCan_productos(String can_productos) {
        this.can_productos = can_productos;
    }

    public String getPrecio_mayorista() {
        return precio_mayorista;
    }

    public void setPrecio_mayorista(String precio_mayorista) {
        this.precio_mayorista = precio_mayorista;
    }

    public String getPrecio_cliente_fijo() {
        return precio_cliente_fijo;
    }

    public void setPrecio_cliente_fijo(String precio_cliente_fijo) {
        this.precio_cliente_fijo = precio_cliente_fijo;
    }

    public String getPrecio_cliente_normal() {
        return precio_cliente_normal;
    }

    public void setPrecio_cliente_normal(String precio_cliente_normal) {
        this.precio_cliente_normal = precio_cliente_normal;
    }

    public Date getFecha_elaboracion() {
        return fecha_elaboracion;
    }

    public void setFecha_elaboracion(Date fecha_elacboracion) {
        this.fecha_elaboracion = fecha_elacboracion;
    }

    public Date getFecha_caducidad() {
        return fecha_caducidad;
    }

    public void setFecha_caducidad(Date fecha_caducidad) {
        this.fecha_caducidad = fecha_caducidad;
    }

    public Date getFecha_R() {
        return fecha_R;
    }

    public void setFecha_R(Date fecha_R) {
        this.fecha_R = fecha_R;
    }

    
}
