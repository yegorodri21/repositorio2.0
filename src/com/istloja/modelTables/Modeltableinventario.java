/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.modelTables;

import com.istloja.vistas.GestionContable;
import com.istloja_modelo.Inventario;
import com.istloja_modelo.Persona;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Usuario
 */
public class Modeltableinventario extends AbstractTableModel{
    public String [] m_colNames = {"codigo_pro", "descripcion", "precios_compra", "precios_venta", "can_productos" };
    public List<Inventario> inventarios;
    private GestionContable gcontable;
    
    public Modeltableinventario(List<Inventario>inventarios,GestionContable gcontable){
        this.inventarios=inventarios;
        this.gcontable = gcontable;
    }
    @Override
    public int getRowCount() {
        return inventarios.size();
    }

    @Override
    public int getColumnCount() {
        return m_colNames.length;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Inventario inventario = inventarios.get(rowIndex);
        switch (columnIndex){
            case 0:
                return inventario.getCodigo_pro();
            case 1:
                return inventario.getDescripcion();
            case 2:
                return inventario.getPrecios_compra();
            case 3:
                return inventario.getPrecios_venta();
            case 4:
                return inventario.getCan_productos();
            
    }   return new String ();
    }
     @Override
    public String getColumnName(int column) {
        return m_colNames[column]; 
    }
    @Override
    public boolean isCellEditable (int rowIndex, int columnIndex) {
        gcontable.clickInventario(inventarios.get(rowIndex));
        return super.isCellEditable(rowIndex, columnIndex);
    }
    public List<Inventario> getPersonas(){
        return inventarios;
    }      
    public void setInventarios(List<Inventario> inventarios){
        this.inventarios= inventarios;
    }
}
