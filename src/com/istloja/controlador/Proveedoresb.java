
package com.istloja.controlador;

import com.istloja.conexionbd.Conexion;
import com.istloja_modelo.Inventario;
import com.istloja_modelo.Proveedores;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Proveedoresb {
    public boolean registrarProveedor(Proveedores proveedor){
        boolean registrar= false;
        //interfaz de acceso a la base de datos
        Statement stm=null;
        //conexion con la base de datos 
        Connection con=null;
        String sql= "INSERT INTO `bdejercicio1`.`proveedores` (`ruc`, `razon_social`, `tipo_actividad`, `nombre_representante_legal`, `apellido_representante_legar`, `telefono`, `correo`) VALUES ('"+proveedor.getRuc()+"', '"+proveedor.getRazonSocial()+"', '"+proveedor.getTipoActividad()+"', '"+proveedor.getNombreRepresentanteLegal()+"', '"+proveedor.getApellidosRepresentanteLegal()+"', '"+proveedor.getTelefono()+"', '"+proveedor.getCorreo()+"');";               
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
    public boolean editarProveedores(Proveedores proveedor){
                    Connection connect=null;
                    Statement stm=null;
                    boolean editar= false;
             String sql = "UPDATE `ejercicio`.`proveedores` SET `id_persona` = '"+String.valueOf(proveedor.getIdProveedores())
                     + " `ruc` = '"+proveedor.getRuc()+"',"
                     + " `razon_social` = '"+proveedor.getRazonSocial()+"',"
                     + " `tipo_actividad` = '"+proveedor.getTipoActividad()+"', "
                     + "`nombre_representante_legal` = '"+proveedor.getNombreRepresentanteLegal()+"', "
                     + "`apellido_representante_legal` = '"+proveedor.getApellidosRepresentanteLegal()+"', "
                     + "`telefono` = '"+proveedor.getTelefono()+"', "
                     + "`correo` = '"+proveedor.getCorreo()+"' "
                     + "WHERE (`id_proveedores` = '"+String.valueOf(proveedor.getIdProveedores())+"');";

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
    public boolean eliminarProveedor(Proveedores proveedor){
            
            boolean eliminar= false;
                    Statement stm=null;
                    Connection con=null;
             String sql = "DELETE FROM `ejercicio`.`proveedores` WHERE (`id_proveedores` = '"+String.valueOf(proveedor.getIdProveedores())+"');";
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
    public List<Proveedores> obtenerProveedores(){
        Connection co=null;
        Statement stm= null;
        ResultSet rs=null;
        Proveedores c=null;
        String sql ="SELECT * FROM `bdejercicio1`.`proveedores`;";
         List<Proveedores> listaProveedores = new ArrayList<Proveedores>();
        try {
            co = new Conexion().conectarBaseDatos();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                c = new Proveedores();
                c.setIdProveedores(rs.getInt(1));
                c.setRuc(rs.getString(2));
                c.setRazonSocial(rs.getString(3));
                c.setTipoActividad(rs.getString(4));
                c.setNombreRepresentanteLegal(rs.getString(5));
                c.setApellidosRepresentanteLegal(rs.getString(6));
                c.setTelefono(rs.getString(7));
                c.setCorreo(rs.getString(8));
                listaProveedores.add(c);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error:"+ e.getMessage());
        }

        return listaProveedores;
    }
    public Proveedores getProveedorruc(String ruc){
     Connection co =null;
        Statement stm=null;
        ResultSet rs=null;
        Proveedores c =null;
        String sql="SELECT * FROM bdejercicio1.proveedores where ruc like "+ruc+";";
        try {
            co =  new  Conexion().conectarBaseDatos ();
            stm = co.createStatement ();
            rs = stm.executeQuery (sql);
            while (rs.next ()) {
                c = new Proveedores ();
                c.setIdProveedores(rs.getInt(1));
                c.setRuc(rs.getString(2));
                c.setRazonSocial(rs.getString(3));
                c.setTipoActividad(rs.getString(4));
                c.setNombreRepresentanteLegal(rs.getString(5));
                c.setApellidosRepresentanteLegal(rs.getString(6));
                c.setTelefono(rs.getString(7));
                c.setCorreo(rs.getString(8));
            }
            stm . close();
            rs . close();
            co . close();
        } catch ( SQLException e) {
            System.out.println("Error: "+ e.getMessage());
        }
        return c;
    }
    public Proveedores getProveedortlf(String telefono){
     Connection co =null;
        Statement stm=null;
        ResultSet rs=null;
        Proveedores c =null;
        String sql="SELECT * FROM bdejercicio1.proveedor where telefono = "+telefono+";";
        try {
            co =  new  Conexion().conectarBaseDatos ();
            stm = co.createStatement ();
            rs = stm.executeQuery (sql);
            while (rs.next ()) {
                c = new Proveedores ();
                c.setIdProveedores(rs.getInt(1));
                c.setRuc(rs.getString(2));
                c.setRazonSocial(rs.getString(3));
                c.setTipoActividad(rs.getString(4));
                c.setNombreRepresentanteLegal(rs.getString(5));
                c.setApellidosRepresentanteLegal(rs.getString(6));
                c.setTelefono(rs.getString(7));
                c.setCorreo(rs.getString(8));
            }
            stm . close();
            rs . close();
            co . close();
        } catch ( SQLException e) {
            System.out.println("Error: "+ e.getMessage());
        }
        return c;
    }      
    public Proveedores getProveedoresruc(String ruc){
     Connection co =null;
        Statement stm=null;
        ResultSet rs=null;
        Proveedores c =null;
        String sql="SELECT * FROM bdejercicio1.proveedores where ruc like "+ruc+";";
        try {
            co =  new  Conexion().conectarBaseDatos ();
            stm = co.createStatement ();
            rs = stm.executeQuery (sql);
            while (rs.next ()) {
                c = new Proveedores ();
                c.setIdProveedores(rs.getInt ( 1 ));
                c.setRuc(rs.getString ( 2 ));
                c.setRazonSocial(rs.getString ( 3 ));
                c.setRazonSocial(rs.getString ( 4 ));
                c.setTipoActividad(rs.getString ( 5 ));
                c.setNombreRepresentanteLegal(rs.getString ( 6 ));
                c.setApellidosRepresentanteLegal(rs.getString ( 7 ));
                c.setTelefono(rs.getString ( 8 ));
                c.setCorreo(rs.getString ( 9 ));
            }
            stm . close();
            rs . close();
            co . close();
        } catch ( SQLException e) {
            System.out.println("Error: "+ e.getMessage());
        }
        return c;
    }
}

