
package com.istloja.controlador;

import com.istloja.conexionbd.Conexion;
import com.istloja_modelo.Inventario;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Usuario
 */
public class Inventariob {
    public boolean registrarInventario(Inventario inventario){
        boolean registrar= false;
        //interfaz de acceso a la base de datos
        Statement stm=null;
        //conexion con la base de datos 
        Connection con=null;
        String sql= "INSERT INTO `bdejercicio1`.`inventario` (`id_inventario`,"
                + " `codigo_pro`,"
                + " `descripcion`,"
                + " `precios_compra`,"
                + " `precio_venta`, `can_productos`) "
                + "VALUES ('"+inventario.getId_inventario()+"',"
                + " '"+inventario.getCodigo_pro()+"',"
                + " '"+inventario.getDescripcion()+"',"
                + " '"+inventario.getPrecios_compra()+"',"
                + " '"+inventario.getPrecios_venta()+"',"
                + " '"+inventario.getCan_productos()+"');";               
        try {
            Conexion conexion =new Conexion();
            con= conexion.conectarBaseDatos();
            stm= con.createStatement();
            stm.execute(sql);
            registrar = true;
            stm.close();
            con.close();
        } catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
            
        return registrar;
    }
    public boolean editarInventario(Inventario inventario){
                    Connection connect=null;
                    Statement stm=null;
                    boolean editar= false;
             String sql = "UPDATE `bdejercicio1`.`inventario` SET `id_inventario` = '"+inventario.getId_inventario()+"',"
                     + " `codigo_pro` = '"+inventario.getCodigo_pro()+"',"
                     + " `descripcion` = '"+inventario.getDescripcion()+"', "
                     + "`precios_compra` = '"+inventario.getPrecios_compra()+"', "
                     + "`precios_venta` = '"+inventario.getPrecios_venta()+"', "
                     + "`can_productos` = '"+inventario.getCan_productos()+"' "
                     + "WHERE (`id_inventario` = '"+inventario.getId_inventario()+"');";

          try {
            Conexion con =new Conexion();
            connect= con.conectarBaseDatos();
            stm= connect.createStatement();
            stm.execute(sql);
            editar = true;
        } catch(SQLException e){
            System.out.println("Error: "+e.getMessage());
        } 
          return editar;
   }
    public boolean eliminarInventario(Inventario inventario){
            
            boolean eliminar= false;
                    Statement stm=null;
                    Connection con=null;
             String sql = "DELETE FROM `bdejercicio1`.`inventario` WHERE ("
                     + "`id_inventario` = '"+inventario.getId_inventario()+"');";
             try {
            Conexion conexion =new Conexion();
            con= conexion.conectarBaseDatos();
            stm= con.createStatement();
            stm.execute(sql);
            eliminar = true;
            stm.close();
        } catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        } 
          return eliminar;
   }
}
