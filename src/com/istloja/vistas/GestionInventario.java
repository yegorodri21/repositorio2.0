/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.vistas;

import com.istloja.utilidad.utilidades;
import com.istloja_modelo.Inventario;
import com.istloja_modelo.Persona;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class GestionInventario {
    private JTextField tid_i;
    private JTextField tcod_i;
    private JTextField tdescripcion_i;
    private JTextField tpc_i;
    private JTextField tpv_i;
    private JTextField tcp_i;
    private utilidades utilidades;
    private JFrame frameGestionContable;

    public GestionInventario(JTextField tid_i, JTextField tcod_i, JTextField tdescripcion_i, JTextField tpc_i, JTextField tpv_i, JTextField tcp_i, utilidades utilidades, JFrame frameGestionContable) {
        this.tid_i = tid_i;
        this.tcod_i = tcod_i;
        this.tdescripcion_i = tdescripcion_i;
        this.tpc_i = tpc_i;
        this.tpv_i = tpv_i;
        this.tcp_i = tcp_i;
        this.utilidades = utilidades;
        this.frameGestionContable = frameGestionContable;
    }

    public JTextField getTid_i() {
        return tid_i;
    }

    public void setTid_i(JTextField tid_i) {
        this.tid_i = tid_i;
    }

    public JTextField getTcod_i() {
        return tcod_i;
    }

    public void setTcod_i(JTextField tcod_i) {
        this.tcod_i = tcod_i;
    }

    public JTextField getTdescripcion_i() {
        return tdescripcion_i;
    }

    public void setTdescripcion_i(JTextField tdescripcion_i) {
        this.tdescripcion_i = tdescripcion_i;
    }

    public JTextField getTpc_i() {
        return tpc_i;
    }

    public void setTpc_i(JTextField tpc_i) {
        this.tpc_i = tpc_i;
    }

    public JTextField getTpv_i() {
        return tpv_i;
    }

    public void setTpv_i(JTextField tpv_i) {
        this.tpv_i = tpv_i;
    }

    public JTextField getTcp_i() {
        return tcp_i;
    }

    public void setTcp_i(JTextField tcp_i) {
        this.tcp_i = tcp_i;
    }
    
     public Inventario datos_vacios() {
        if (tid_i.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo Id no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            tid_i.requestFocus();// Sirve para ubicar el cursor en un campo vacio.
            return null;
        }
        if (tcod_i.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo Codigo no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            tcod_i.requestFocus();
            return null;
        }
        if (!utilidades.numeros(tcod_i.getText())) {
            JOptionPane.showMessageDialog(frameGestionContable, "Ingrese datos numericos, gracias ", "ERROR", JOptionPane.ERROR_MESSAGE);
            tcod_i.requestFocus();
            return null;
        }
        if (tdescripcion_i.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo Descripcion no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            tdescripcion_i.requestFocus();
            return null;
        }
        if (tpc_i.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo Precio de compra no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            tpc_i.requestFocus();
            return null;
        }
        if (tpv_i.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo Precio de venta no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            tpv_i.requestFocus();
            return null;
        }
        
        if (tcp_i.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo Cantidad producto no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            tcp_i.requestFocus();
            return null;
        }
        
        Inventario inventario = new Inventario();
        inventario.setId_inventario(Integer.parseInt(tid_i.getText()));
        inventario.setCodigo_pro(Integer.parseInt(tcod_i.getText()));
        inventario.setDescripcion(tdescripcion_i.getText());
        inventario.setPrecios_compra(Double.parseDouble(tpc_i.getText()));
        inventario.setPrecios_venta(Double.parseDouble(tpv_i.getText()));
        inventario.setCan_productos(Integer.parseInt(tcp_i.getText()));
        return inventario;
    }
}
