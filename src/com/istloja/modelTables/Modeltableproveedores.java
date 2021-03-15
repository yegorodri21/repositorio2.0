
package com.istloja.modelTables;

import com.istloja.vistas.GestionContable;
import com.istloja_modelo.Persona;
import com.istloja_modelo.Proveedores;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Usuario
 */
public class Modeltableproveedores extends AbstractTableModel{
    public String [] m_colNames = {"ruc", "razon_social", "tipo_actividad", "nombre_representante_legal", "apellido_representante_legal", "telefono","correo" ,"direccion","fecha_registro"};
    public List<Proveedores> proveedores;
    private GestionContable gcontable;
    
    public Modeltableproveedores(List<Proveedores>proveedores,GestionContable gcontable){
        this.proveedores=proveedores;
        this.gcontable = gcontable;
    }
    @Override
    public int getRowCount() {
        return proveedores.size();
    }

    @Override
    public int getColumnCount() {
        return m_colNames.length;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Proveedores proveedor = proveedores.get(rowIndex);
        switch (columnIndex){
            case 0:
                return proveedor.getRuc();
            case 1:
                return proveedor.getRazonSocial();
            case 2:
                return proveedor.getTipoActividad();
            case 3:
                return proveedor.getNombreRepresentanteLegal();
            case 4:
                return proveedor.getApellidosRepresentanteLegal();
            case 5:
                return proveedor.getTelefono();
            case 6:
                return proveedor.getCorreo();
            case 7:
                return proveedor.getDireccion();
            case 8:
                return proveedor.getFecha_R();
    }   return new String ();
    }
     @Override
    public String getColumnName(int column) {
        return m_colNames[column]; 
    }
    @Override
    public boolean isCellEditable (int rowIndex, int columnIndex) {
        gcontable.clickProveedores(proveedores.get(rowIndex));
        return super.isCellEditable(rowIndex, columnIndex);
    }
    public List<Proveedores> getProveedores(){
        return proveedores;
    }      
    public void setProveedores(List<Proveedores> proveedores){
        this.proveedores= proveedores;
    }
}
