package com.istloja.controlador;
import com.istloja_modelo.Persona;
import java.sql.Connection;
import java.sql.Statement;
import com.istloja.conexionbd.Conexion;
import com.istloja.utilidad.utilidades;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Personabd {
    public utilidades utilidades;

    public Personabd() {
        utilidades = new utilidades();
    }
    public boolean registrarPersona(Persona persona){
        boolean registrar= false;
        //interfaz de acceso a la base de datos
        Statement stm=null;
        //conexion con la base de datos 
        Connection con=null;
        String sql;
        if(persona.getFechanacimiendo()==null){
             sql= "INSERT INTO `bdejercicio1`.`persona` (`id_persona`,"
                + " `cedula`, `Nombres`, `Apellidos`, `Direccion`"
                + ", `Correo`, `telefono`, `genero`,`fecha_registro`, `fecha_actualizacion`) "
                + "VALUES ('"+String.valueOf(persona.getIdPersona())+"', "
                + "'"+persona.getCedula()+"', '"+persona.getNombre()+"', "
                + "'"+persona.getApellido()+"', '"+persona.getDireccion()+"',"
                + " '"+persona.getCorreo()+"', '"+persona.getTelefono()+"',"
                + " '"+persona.getGenero()+"', now(), now());";    
        }else{
             sql= "INSERT INTO `bdejercicio1`.`persona` (`id_persona`,"
                + " `cedula`, `Nombres`, `Apellidos`, `Direccion`"
                + ", `Correo`, `telefono`, `genero`,`fecha_registro`, `fecha_actualizacion`,`fecha_nacimiento`) "
                + "VALUES ('"+String.valueOf(persona.getIdPersona())+"', "
                + "'"+persona.getCedula()+"', '"+persona.getNombre()+"', "
                + "'"+persona.getApellido()+"', '"+persona.getDireccion()+"',"
                + " '"+persona.getCorreo()+"', '"+persona.getTelefono()+"',"
                + " '"+persona.getGenero()+"', now(), now(), '"+utilidades.devolverFecha(persona.getFechanacimiendo())+"');";  
        }
                           
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
    public boolean editarPersona(Persona persona){
                    Connection connect=null;
                    Statement stm=null;
                    boolean editar= false;
             String sql = " UPDATE `bdejercicio1`.`persona` SET `id_persona` = '"+String.valueOf(persona.getIdPersona())
                     +"', `cedula` = '"+persona.getCedula()
                     +"', `Nombres` = '"+persona.getNombre()
                     +"', `Apellidos` = '"+persona.getApellido()
                     +"', `Direccion` = '"+persona.getDireccion()
                     +"', `Correo` = '"+persona.getCorreo()
                     +"', `telefono` = '"+persona.getTelefono()
                     +"', `genero` = '"+persona.getGenero()
                     +"', `fecha_actualizacion` = now()"
                     + ",  `fecha_nacimiento` = '"+persona.getFechanacimiendo()+"' WHERE (`id_persona` = '"+String.valueOf(persona.getIdPersona())+"');";

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
        Persona c=null;
        String sql ="SELECT * FROM `bdejercicio1`.`persona`;";
        List<Persona> listaPersonas = new ArrayList<Persona>();
        try{
            co= new Conexion ().conectarBaseDatos();
            stm= co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()){
                c = new Persona();
                c.setIdPersona(rs.getInt(1));
                c.setCedula(rs.getString(2));
                c.setNombre(rs.getString(3));
                c.setApellido(rs.getString(4));
                c.setDireccion(rs.getString(5));
                c.setCorreo(rs.getString(6));
                c.setTelefono(rs.getString(7));
                c.setGenero(rs.getInt(8));
                c.setFecha(rs.getDate(9));
                c.setFechaActualizacion(rs.getDate(10));
                c.setFechanacimiendo(rs.getDate(11));


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
    public Persona getPersonaCedula(String cedula){
     Connection co =null;
        Statement stm=null;
        ResultSet rs=null;
        Persona c =null;
        String sql="SELECT * FROM bdejercicio1.persona where cedula like "+cedula+";";
        try {
            co =  new  Conexion().conectarBaseDatos ();
            stm = co.createStatement ();
            rs = stm.executeQuery (sql);
            while (rs.next ()) {
                c = new Persona ();
                c.setIdPersona (rs.getInt ( 1 ));
                c.setCedula (rs.getString ( 2 ));
                c.setNombre (rs.getString ( 3 ));
                c.setApellido (rs.getString ( 4 ));
                c.setDireccion (rs.getString ( 5 ));
                c.setCorreo (rs.getString ( 6 ));
                c.setTelefono (rs.getString ( 7 ));
                c.setGenero(rs.getInt(8));
                c.setFecha(rs.getDate(9));
                c.setFechaActualizacion(rs.getDate(10));
                c.setFechanacimiendo(rs.getDate(11));

            }
            stm . close();
            rs . close();
            co . close();
        } catch ( SQLException e) {
            System.out.println("Error: "+ e.getMessage());
        }
        return c;
    }
    public Persona getPersonatelefono(String telefono){
     Connection co =null;
        Statement stm=null;
        ResultSet rs=null;
        Persona c =null;
        String sql="SELECT * FROM bdejercicio1.persona where telefono = "+telefono+";";
        try {
            co =  new  Conexion().conectarBaseDatos ();
            stm = co.createStatement ();
            rs = stm.executeQuery (sql);
            while (rs.next ()) {
                c = new Persona ();
                c.setIdPersona (rs.getInt ( 1 ));
                c.setCedula (rs.getString ( 2 ));
                c.setNombre (rs.getString ( 3 ));
                c.setApellido (rs.getString ( 4 ));
                c.setDireccion (rs.getString ( 5 ));
                c.setCorreo (rs.getString ( 6 ));
                c.setTelefono (rs.getString ( 7 ));
                c.setGenero(rs.getInt(8));
                c.setFecha(rs.getDate(9));
                c.setFechaActualizacion(rs.getDate(10));
                c.setFechanacimiendo(rs.getDate(11));
  
            }
            stm . close();
            rs . close();
            co . close();
        } catch ( SQLException e) {
            System.out.println("Error: "+ e.getMessage());
        }
        return c;
    }      
    //para el open box que me servia sin ese 
   public List<Persona> obtenerPersonacedula(String cedula) {
        Connection co = null;
        Statement stm = null;
        //Sentencia de JDBC para obtener valores de la base de datos.
        ResultSet rs = null;
        String sql = "SELECT * FROM bdejercicio1.persona where cedula like \"%"+cedula+"%\";";
        List<Persona> listapersonas = new ArrayList<Persona>();
        try {
            co =  new  Conexion().conectarBaseDatos ();
            stm = co.createStatement ();
            rs = stm.executeQuery (sql);
            while (rs.next ()) {
                 Persona c = new Persona ();
                c.setIdPersona (rs.getInt ( 1 ));
                c.setCedula (rs.getString ( 2 ));
                c.setNombre (rs.getString ( 3 ));
                c.setApellido (rs.getString ( 4 ));
                c.setDireccion (rs.getString ( 5 ));
                c.setCorreo (rs.getString ( 6 ));
                c.setTelefono (rs.getString ( 7 ));
                c.setGenero(rs.getInt ( 8 ));
                c.setFecha(rs.getDate(9));
                c.setFechaActualizacion(rs.getDate(10));
                c.setFechanacimiendo(rs.getDate(11));
                
                   listapersonas.add(c);
            }
            stm . close();
            rs . close();
            co . close();
        } catch ( SQLException e) {
            System.out.println("Error: "+ e.getMessage());
        }
        return listapersonas;
    }      
   public List<Persona> obtenerPersonanombre(String nombre) {
        Connection co = null;
        Statement stm = null;
        //Sentencia de JDBC para obtener valores de la base de datos.
        ResultSet rs = null;
        String sql = "SELECT * FROM bdejercicio1.persona where Nombres like \"%"+nombre+"%\";";
        List<Persona> listapersonas = new ArrayList<Persona>();
        try {
            co =  new  Conexion().conectarBaseDatos ();
            stm = co.createStatement ();
            rs = stm.executeQuery (sql);
            while (rs.next ()) {
                 Persona c = new Persona ();
                c.setIdPersona (rs.getInt ( 1 ));
                c.setCedula (rs.getString ( 2 ));
                c.setNombre (rs.getString ( 3 ));
                c.setApellido (rs.getString ( 4 ));
                c.setDireccion (rs.getString ( 5 ));
                c.setCorreo (rs.getString ( 6 ));
                c.setTelefono (rs.getString ( 7 ));
                c.setGenero(rs.getInt ( 8 ));
                c.setFecha(rs.getDate(9));
                c.setFechaActualizacion(rs.getDate(10));
                c.setFechanacimiendo(rs.getDate(11));
                   listapersonas.add(c);
            }
            stm . close();
            rs . close();
            co . close();
        } catch ( SQLException e) {
            System.out.println("Error: "+ e.getMessage());
        }
        return listapersonas;
    }      

    
}
