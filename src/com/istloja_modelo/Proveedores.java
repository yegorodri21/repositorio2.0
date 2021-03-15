
package com.istloja_modelo;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Proveedores {
    private int idProveedores;
    private String ruc;
    private String razonSocial;
    private String tipoActividad;
    private String nombreRepresentanteLegal;
    private String ApellidosRepresentanteLegal;
    private String telefono;
    private String correo;
    private String direccion;
    private Date fecha_R;

    @Override
    public String toString() {
        return "Proveedores{" + "idProveedores=" + idProveedores + ", ruc=" + ruc + ", razonSocial=" + razonSocial + ", tipoActividad=" + tipoActividad + ", nombreRepresentanteLegal=" + nombreRepresentanteLegal + ", ApellidosRepresentanteLegal=" + ApellidosRepresentanteLegal + ", telefono=" + telefono + ", correo=" + correo + ", direccion=" + direccion + ", fecha_R=" + fecha_R + '}';
    }
     public Proveedores() {

    }
    
    public int getIdProveedores() {
        return idProveedores;
    }

    public void setIdProveedores(int idProveedores) {
        this.idProveedores = idProveedores;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getTipoActividad() {
        return tipoActividad;
    }

    public void setTipoActividad(String tipoActividad) {
        this.tipoActividad = tipoActividad;
    }

    public String getNombreRepresentanteLegal() {
        return nombreRepresentanteLegal;
    }

    public void setNombreRepresentanteLegal(String nombreRepresentanteLegal) {
        this.nombreRepresentanteLegal = nombreRepresentanteLegal;
    }

    public String getApellidosRepresentanteLegal() {
        return ApellidosRepresentanteLegal;
    }

    public void setApellidosRepresentanteLegal(String ApellidosRepresentanteLegal) {
        this.ApellidosRepresentanteLegal = ApellidosRepresentanteLegal;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFecha_R() {
        return fecha_R;
    }

    public void setFecha_R(Date fecha_R) {
        this.fecha_R = fecha_R;
    }
   
}

