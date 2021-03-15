/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.modelTables;

import com.istloja.vistas.GestionContable;
import com.istloja_modelo.Persona;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Usuario
 */
public class Modeltablepersona extends AbstractTableModel{
    public String [] m_colNames = {"cedula", "Nombres", "Apellidos", "Direccion", "Correo", "telefono","genero","fecha_registro" };
    public List<Persona> personas;
    //private ComunicacionPersona comunicacionPersona;
    private GestionContable gcontable;
    
    public Modeltablepersona(List<Persona>personas,GestionContable gcontable){
        this.personas=personas;
        this.gcontable =gcontable;
    }
    @Override
    public int getRowCount() {
        return personas.size();
    }

    @Override
    public int getColumnCount() {
        return m_colNames.length;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Persona persona = personas.get(rowIndex);
        switch (columnIndex){
            case 0:
                return persona.getCedula();
            case 1:
                return persona.getNombre();
            case 2:
                return persona.getApellido();
            case 3:
                return persona.getDireccion();
            case 4:
                return persona.getCorreo();
            case 5:
                return persona.getTelefono();
            case 6:
                return persona.getGenero();
            case 7:
                return persona.getFecha();
            
    }   return new String ();
    }
     @Override
    public String getColumnName(int column) {
        return m_colNames[column]; 
    }
    @Override
    public boolean isCellEditable (int rowIndex, int columnIndex) {
        gcontable.clickPersona(personas.get(rowIndex));
        return super.isCellEditable(rowIndex, columnIndex);
    }
    public List<Persona> getPersonas(){
        return personas;
    }      
    public void setPersonas(List<Persona> personas){
        this.personas= personas;
    }
}
