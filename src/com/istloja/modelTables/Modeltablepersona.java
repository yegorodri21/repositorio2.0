/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.modelTables;

import com.istloja_modelo.Persona;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Usuario
 */
public class Modeltablepersona extends AbstractTableModel{
    public String [] m_colNames = {"cedula", "Nombres", "Apellidos", "Direccion", "Correo", "telefono" };
    public List<Persona> personas;
    
    public Modeltablepersona(List<Persona>personas){
        this.personas=personas;
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
            
    }   return new String ();
    }
     @Override
    public String getColumnName(int column) {
        return m_colNames[column]; 
    }
            
}
