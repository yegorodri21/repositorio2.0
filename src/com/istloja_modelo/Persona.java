/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja_modelo;

import java.util.Date;


public class Persona {
    private int idPersona;
    private String cedula;
    private String nombre;
    private String apellido;
    private String direccion;
    private String correo;
    private String telefono;
    private int genero;
    private Date fecha;
    private Date fechaActualizacion;
    private Date fechanacimiendo;
    
   
    
     @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", correo=" + correo + ", telefono=" + telefono + ", genero=" + genero + ", fecha=" + fecha + ", fechaActualizacion=" + fechaActualizacion + ", fechanacimiendo=" + fechanacimiendo + '}';
    }

    

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public Date getFechanacimiendo() {
        return fechanacimiendo;
    }

    public void setFechanacimiendo(Date fechanacimiendo) {
        this.fechanacimiendo = fechanacimiendo;
    }
    
}
