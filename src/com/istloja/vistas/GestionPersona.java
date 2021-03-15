/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.vistas;
import com.istloja_modelo.Persona;
import com.istloja.utilidad.utilidades;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class GestionPersona {
    private JTextField tcedula;
    private JTextField tnombre;
    private JTextField tapellido;
    private JTextField tdireccion;
    private JTextField tcorreo;
    private JTextField ttelefono;
    private utilidades utilidades;
    private JTextField tgenero;
    private Date fecha_R;
    private JFrame frameGestionContable;

    public GestionPersona(JTextField tcedula, JTextField tnombre, JTextField tapellido, JTextField tdireccion, JTextField tcorreo, JTextField ttelefono, JTextField tgenero, utilidades utilidades, JFrame frameGestionContable) {
        this.tcedula = tcedula;
        this.tnombre = tnombre;
        this.tapellido = tapellido;
        this.tdireccion = tdireccion;
        this.tcorreo = tcorreo;
        this.ttelefono = ttelefono;
        this.utilidades = utilidades;
        this.tgenero = tgenero;
        this.frameGestionContable = frameGestionContable;
    }

    public JTextField getTcedula() {
        return tcedula;
    }

    public void setTcedula(JTextField tcedula) {
        this.tcedula = tcedula;
    }

    public JTextField getTnombre() {
        return tnombre;
    }

    public void setTnombre(JTextField tnombre) {
        this.tnombre = tnombre;
    }

    public JTextField getTapellido() {
        return tapellido;
    }

    public void setTapellido(JTextField tapellido) {
        this.tapellido = tapellido;
    }

    public JTextField getTdireccion() {
        return tdireccion;
    }

    public void setTdireccion(JTextField tdireccion) {
        this.tdireccion = tdireccion;
    }

    public JTextField getTcorreo() {
        return tcorreo;
    }

    public void setTcorreo(JTextField tcorreo) {
        this.tcorreo = tcorreo;
    }

    public JTextField getTtelefono() {
        return ttelefono;
    }

    public void setTtelefono(JTextField ttelefono) {
        this.ttelefono = ttelefono;
    }

    public utilidades getUtilidades() {
        return utilidades;
    }

    public void setUtilidades(utilidades utilidades) {
        this.utilidades = utilidades;
    }

    public JTextField getTgenero() {
        return tgenero;
    }

    public void setTgenero(JTextField tgenero) {
        this.tgenero = tgenero;
    }

    public Date getFecha_R() {
        return fecha_R;
    }

    public void setFecha_R(Date fecha_R) {
        this.fecha_R = fecha_R;
    }

    public JFrame getFrameGestionContable() {
        return frameGestionContable;
    }

    public void setFrameGestionContable(JFrame frameGestionContable) {
        this.frameGestionContable = frameGestionContable;
    }

   



     public Persona guardarEditar() {
        if (tcedula.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo cedula no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            tcedula.requestFocus();// Sirve para ubicar el cursor en un campo vacio.
            return null;
        }
        if (!utilidades.validadorcedula(tcedula.getText())) {
            JOptionPane.showMessageDialog(frameGestionContable, "la cedula ingresada no es valida", "ERROR", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        if (tnombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo nombres no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            tnombre.requestFocus();
            return null;
        }
        if (tapellido.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo apellidos no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            tapellido.requestFocus();
            return null;
        }
        if (tdireccion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo direccion no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            tdireccion.requestFocus();
            return null;
        }
        if (ttelefono.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo telefono no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            ttelefono.requestFocus();
            return null;
        }
        if (!utilidades.validarnumero(ttelefono.getText())) {
            JOptionPane.showMessageDialog(frameGestionContable, "Los datos ingresados en el telefono no son validos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            ttelefono.requestFocus();
            return null;
        }
        if (tcorreo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo correo no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            tcorreo.requestFocus();
            return null;
        }
        if (!utilidades.validarcorreo(tcorreo.getText())) {
            JOptionPane.showMessageDialog(frameGestionContable, "El correo ingresado no es valido.", "ERROR", JOptionPane.ERROR_MESSAGE);
            tcorreo.requestFocus();
            return null;
        }
       if (tgenero.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo genero no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            tgenero.requestFocus();
            return null;
        }
        
        Persona persona = new Persona();
        persona.setCedula(tcedula.getText());
        persona.setNombre(tnombre.getText());
        persona.setApellido(tapellido.getText());
        persona.setDireccion(tdireccion.getText());
        persona.setCorreo(tcorreo.getText());
        persona.setTelefono(ttelefono.getText());
        persona.setGenero(tgenero.getText());
        return persona;
    }
    
}