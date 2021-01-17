
package com.istloja.controlador;
import com.istloja_modelo.Persona;
import java.sql.Connection;
import java.sql.Statement;
import com.istloja.conexionbd.Conexion;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class Personabd {
    public boolean registrarPersona(Persona persona){
        boolean registrar= false;
        //interfaz de acceso a la base de datos
        Statement stm=null;
        //conexion con la base de datos 
        Connection con=null;
        String sql= "INSERT INTO `bdejercicio1`.`persona` (`id_persona`, `cedula`, `Nombres`, `Apellidos`, `Direccion`, `Correo`, `telefono`) VALUES ('"+String.valueOf(persona.getIdPersona())+"', '"+persona.getCedula()+"', '"+persona.getNombre()+"', '"+persona.getApellido()+"', '"+persona.getDireccion()+"', '"+persona.getCorreo()+"', '"+persona.getTelefono()+"');";                   
        try {
            Conexion conexion =new Conexion();
            con= conexion.conectarBaseDatos();
            stm= con.createStatement();
            stm.execute(sql);
            registrar = true;
            stm.close();
        } catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
            
        return registrar;
    }
    public boolean editarPersona(Persona persona){
            
            boolean editar= false;
                    Statement stm=null;
                    Connection con=null;
             String sql = " UPDATE `bdejercicio1`.`persona` SET `id_persona` = '"+String.valueOf(persona.getIdPersona())
                     +"', `cedula` = '"+persona.getCedula()
                     +"', `Nombres` = '"+persona.getNombre()
                     +"', `Apellidos` = '"+persona.getApellido()
                     +"', `Direccion` = '"+persona.getDireccion()
                     +"', `Correo` = '"+persona.getCorreo()
                     +"', `telefono` = '"+persona.getTelefono()
                     +"' WHERE (`id_persona` = '"+String.valueOf(persona.getIdPersona())+"');";

          try {
            Conexion conexion =new Conexion();
            con= conexion.conectarBaseDatos();
            stm= con.createStatement();
            stm.execute(sql);
            editar = true;
            stm.close();
        } catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        } 
          return editar;
   }
    public boolean eliminarPersona(Persona persona){
            
            boolean eliminar= false;
                    Statement stm=null;
                    Connection con=null;
             String sql = "Delete from `bdejercicio1`.`persona` WHERE (`id_persona` = '"+String.valueOf(persona.getIdPersona())+"');";
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
    public List<Persona> obtenerpersona(){
        Connection co=null;
        Statement stm= null;
        ResultSet rs=null;
        
        String sql ="SELECT * FROM `bdejercicio1`.`persona`;";
        List<Persona> listaPersonas = new ArrayList<Persona>();
        try{
            co= new Conexion ().conectarBaseDatos();
            stm= co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()){
                Persona c = new Persona();
                c.setIdPersona(rs.getInt(1));
                c.setCedula(rs.getString(2));
                c.setNombre(rs.getString(3));
                c.setApellido(rs.getString(4));
                c.setDireccion(rs.getString(5));
                c.setCorreo(rs.getString(6));
                c.setTelefono(rs.getString(7));
                listaPersonas.add(c);
            }
            stm.close();
            rs.close();
            co.close();
        }catch (Exception e){
            System.out.println("Error: "+ e.getMessage());
        }
        return listaPersonas;
    }
    }
