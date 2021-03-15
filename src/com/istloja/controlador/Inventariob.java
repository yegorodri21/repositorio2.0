
package com.istloja.controlador;

import com.istloja.conexionbd.Conexion;
import com.istloja_modelo.Inventario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
        String sql= "INSERT INTO `bdejercicio1`.`inventario` (`id_inventario`, `codigo_pro`, `descripcion`,"
                + " `precio_compra_con_iva`, `precio_compra_sin_iva`, `can_productos`,"
                + " `precio_mayorista`, `precio_cliente_fijo`, `precio_cliente_normal`,"
                + " `fecha_actualizacion`, `fecha_caducidad`, `fecha_registro`)"
                + " VALUES ('"+String.valueOf(inventario.getId_inventario())+"',"
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
             String sql = "UPDATE `bdejercicio1`.`inventario` SET `id_inventario` = '"+String.valueOf(inventario.getId_inventario())+"',"
                     + " `codigo_pro` = '"+inventario.getCodigo_pro()+"',"
                     + " `descripcion` = '"+inventario.getDescripcion()+"', "
                     + "`precios_compra` = '"+inventario.getPrecios_compra()+"', "
                     + "`precios_venta` = '"+inventario.getPrecios_venta()+"', "
                     + "`can_productos` = '"+inventario.getCan_productos()+"' "
                     + "WHERE (`id_inventario` = '"+String.valueOf(inventario.getId_inventario())+"');";

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
                     + "`id_inventario` = '"+String.valueOf(inventario.getId_inventario())+"');";
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
    public List<Inventario> obtenerinventario(){
        Connection co=null;
        Statement stm= null;
        ResultSet rs=null;
        Inventario c=null;
        String sql ="SELECT * FROM `bdejercicio1`.`inventario`;";
        List<Inventario> listaInventario = new ArrayList<Inventario>();
        try{
            co= new Conexion ().conectarBaseDatos();
            stm= co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()){
                c = new Inventario();
                c.setId_inventario(rs.getInt(1));
                c.setCodigo_pro(rs.getString(2));
                c.setDescripcion(rs.getString(3));
                c.setPrecios_compra(rs.getString(4));
                c.setPrecios_venta(rs.getString(5));
                c.setCan_productos(rs.getString(6));
                listaInventario.add(c);
            }
            stm.close();
            rs.close();
            co.close();
        }catch (Exception e){
            System.out.println("Error: "+ e.getMessage());
        }
        return listaInventario;
    }
    public Inventario getInventariocodigo(String codigo_p){
     Connection co =null;
        Statement stm=null;
        ResultSet rs=null;
        Inventario c =null;
        String sql="SELECT * FROM bdejercicio1.inventario where codigo_pro like "+codigo_p+";";
        try {
            co =  new  Conexion().conectarBaseDatos ();
            stm = co.createStatement ();
            rs = stm.executeQuery (sql);
            while (rs.next ()) {
                c = new Inventario ();
                c.setId_inventario(rs.getInt ( 1 ));
                c.setCodigo_pro(rs.getString ( 2 ));
                c.setDescripcion(rs.getString ( 3 ));
                c.setPrecios_compra(rs.getString ( 4 ));
                c.setPrecios_venta(rs.getString ( 5 ));
                c.setCan_productos(rs.getString ( 6 ));
            }
            stm . close();
            rs . close();
            co . close();
        } catch ( SQLException e) {
            System.out.println("Error: "+ e.getMessage());
        }
        return c;
    }
    public List<Inventario> obtenerProductosInventarioCodigo(String codigo) {
        System.out.println("BusquedaCodigo"+ codigo);
        Connection co = null;
        Statement stm = null;
        //Sentencia de JDBC para obtener valores de la base de datos.
        ResultSet rs = null;
        String sql = "SELECT * FROM bdejercicio1.inventario where codigo_pro like \"%"+codigo+"%\";";
        List<Inventario> listaInventario = new ArrayList<Inventario>();
        try {
            co = new Conexion().conectarBaseDatos();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Inventario c = new Inventario();
                c.setId_inventario(rs.getInt(1));
                c.setCodigo_pro(rs.getString(2));
                c.setDescripcion(rs.getString(3));
                c.setPrecios_compra(rs.getString(4));
                c.setPrecios_venta(rs.getString(5));
                c.setCan_productos(rs.getString(6));
                listaInventario.add(c);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error:"+ e.getMessage());
        }

        return listaInventario;
    }
     public List<Inventario> obtenerProductosInventarioDescripcion(String descripcion) {
        Connection co = null;
        Statement stm = null;
        //Sentencia de JDBC para obtener valores de la base de datos.
        ResultSet rs = null;
        String sql = "SELECT * FROM bdejercicio1.inventario where descripcion like \"%"+descripcion+"%\";";
        List<Inventario> listaInventario = new ArrayList<Inventario>();
        try {
            co = new Conexion().conectarBaseDatos();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Inventario c = new Inventario();
                c.setId_inventario(rs.getInt(1));
                c.setCodigo_pro(rs.getString(2));
                c.setDescripcion(rs.getString(3));
                c.setPrecios_compra(rs.getString(4));
                c.setPrecios_venta(rs.getString(5));
                c.setCan_productos(rs.getString(6));
                listaInventario.add(c);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error:"+ e.getMessage());
        }

        return listaInventario;
    }
}
