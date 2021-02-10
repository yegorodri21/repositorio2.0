/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.vistas;

import com.istloja.conexionbd.Conexion;
import com.istloja_modelo.Persona;
import javax.swing.JOptionPane;
import com.istloja.utilidad.utilidades;
import com.istloja.controlador.Personabd;
import com.istloja.modelTables.Modeltablepersona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.table.DefaultTableModel;



public class GestionContable extends javax.swing.JFrame {
    Conexion cc =new Conexion(); 
    Connection cn=cc.conectarBaseDatos();
    DefaultTableModel model;
    private utilidades utilidades;
    private Personabd controladorPersona;
    private Persona personaEditar;
    private GestionPersona gestionPersona;
    private Modeltablepersona modeltablepersona;
    /**
     * Creates new form GestionPersona1
     */
    public GestionContable() {
        controladorPersona = new Personabd();
        modeltablepersona = new Modeltablepersona (controladorPersona.obtenerpersona());
        initComponents();
        utilidades = new utilidades();
        limpiar();
        blimpiar.setEnabled(false);
    }
    void limpiar (){
        tcedula.setText("");
        tnombre.setText("");
        tapellido.setText("");
        tdireccion.setText("");
        tcorreo.setText("");
        ttelefono.setText("");    
    }
  
    void mostrar(){
        DefaultTableModel ps = new DefaultTableModel();
        ps.addColumn("cedula");         
        ps.addColumn("Nombre");         
        ps.addColumn("Apellido");         
        ps.addColumn("Direccion");    
        ps.addColumn("Correo");                 
        ps.addColumn("telefono");                 
        tabla.setModel(ps);         
         String sql= "Select cedula,Nombres,Apellidos,Direccion,Correo,telefono from bdejercicio1.persona where cedula LIKE '%"+ttabla.getText()+"%' "
               + "or Nombres LIKE '%"+ttabla.getText()+"%' "
               + "or Apellidos LIKE '%"+ttabla.getText()+"%' or Direccion LIKE '%"+ttabla.getText()+"%' "
               + "or telefono LIKE '%"+ttabla.getText()+"%';";
        String lista[] = new String[6];         
        Statement datos;         
        try {             
            datos = cn.createStatement();     
            ResultSet res = datos.executeQuery(sql);    
            while (res.next()) {                 
                lista[0] = res.getString(1);                 
                lista[1] = res.getString(2);                 
                lista[2] = res.getString(3);                 
                lista[3] = res.getString(4);   
                lista[4] = res.getString(5);   
                lista[5] = res.getString(6);   
                ps.addRow(lista);             
            }  
            tabla.setModel(ps);         
        } catch (SQLException ex) {             
            Logger.getLogger(GestionContable.class.getName()).log(Level.SEVERE, null, ex);         
        }     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        bguardar1 = new javax.swing.JButton();
        jMenu1 = new javax.swing.JMenu();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tcedula = new javax.swing.JTextField();
        tapellido = new javax.swing.JTextField();
        tnombre = new javax.swing.JTextField();
        tdireccion = new javax.swing.JTextField();
        tcorreo = new javax.swing.JTextField();
        ttelefono = new javax.swing.JTextField();
        bbuscar = new javax.swing.JButton();
        btelefono = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        beditar = new javax.swing.JButton();
        bguardar = new javax.swing.JButton();
        btraer = new javax.swing.JButton();
        beliminar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        blimpiar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        ttabla = new javax.swing.JTextField();
        btabla = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jTabbedPane5 = new javax.swing.JTabbedPane();

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Editar");

        jButton3.setText("Eliminar");

        jButton4.setText("Traer ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        bguardar1.setText("Guardar");
        bguardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bguardar1ActionPerformed(evt);
            }
        });

        jMenu1.setText("jMenu1");

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setToolTipText("");

        jLabel2.setText("Cedula");

        jLabel3.setText("Nombres");

        jLabel4.setText("Apellidos");

        jLabel5.setText("Direccion");

        jLabel6.setText("Correo");

        jLabel7.setText("Telefono");

        tcedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcedulaActionPerformed(evt);
            }
        });

        tnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnombreActionPerformed(evt);
            }
        });

        bbuscar.setText("Buscar");
        bbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbuscarActionPerformed(evt);
            }
        });

        btelefono.setText("Buscar");
        btelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btelefonoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tcedula)
                    .addComponent(tnombre)
                    .addComponent(tapellido)
                    .addComponent(tdireccion)
                    .addComponent(tcorreo)
                    .addComponent(ttelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bbuscar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btelefono, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(51, 51, 51))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bbuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btelefono))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel9.setText("Cuerpo Registro");

        beditar.setText("Editar ");
        beditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beditarActionPerformed(evt);
            }
        });

        bguardar.setText("Guardar");
        bguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bguardarActionPerformed(evt);
            }
        });

        btraer.setText("Traer");
        btraer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btraerActionPerformed(evt);
            }
        });

        beliminar.setText("Eliminar");
        beliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beliminarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Registro de Personas");

        blimpiar.setText("Limpiar");
        blimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blimpiarActionPerformed(evt);
            }
        });

        jLabel10.setText("Buscar cliente");

        ttabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ttablaActionPerformed(evt);
            }
        });
        ttabla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ttablaKeyPressed(evt);
            }
        });

        btabla.setText("Buscar");
        btabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btablaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 103, Short.MAX_VALUE)
        );

        tabla.setModel(modeltablepersona);
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ttabla, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btabla))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bguardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(beditar)
                .addGap(18, 18, 18)
                .addComponent(beliminar)
                .addGap(18, 18, 18)
                .addComponent(btraer)
                .addGap(18, 18, 18)
                .addComponent(blimpiar)
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(16, 16, 16)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bguardar)
                    .addComponent(beditar)
                    .addComponent(beliminar)
                    .addComponent(btraer)
                    .addComponent(blimpiar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(ttabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btabla))
                .addGap(18, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane3.addTab("Clientes", jPanel1);
        jTabbedPane3.addTab("Proveedores", jTabbedPane2);
        jTabbedPane3.addTab("Inventario", jTabbedPane4);
        jTabbedPane3.addTab("Ventas", jTabbedPane5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tcedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcedulaActionPerformed
        
    }//GEN-LAST:event_tcedulaActionPerformed

    private void tnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnombreActionPerformed

    private void bguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bguardarActionPerformed
        if (controladorPersona.getPersonaCedula(tcedula.getText())!=null){
        JOptionPane.showMessageDialog(rootPane,"El numero de cedula ingresado ya se encuentra registrado en el sistema","Error",JOptionPane.ERROR_MESSAGE);
   
        }else{
            Persona editarPersona = gestionPersona.guardarEditar();
            if(controladorPersona!=null){
              if(controladorPersona.registrarPersona(editarPersona)){
                   JOptionPane.showMessageDialog(rootPane,"Persona registrada en el sistema");
                  limpiar();
               }else{
               JOptionPane.showMessageDialog(rootPane,"A ocurrido un eror al momento de guardar la persona");
               }     
            }
            
        }

    }//GEN-LAST:event_bguardarActionPerformed
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btraerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btraerActionPerformed
        List <Persona>obtenerPersona = controladorPersona.obtenerpersona();
        System.out.println("Personas en la base de datos: "+obtenerPersona.size());
        personaEditar=obtenerPersona.get(obtenerPersona.size()-1);
        tcedula.setText(personaEditar.getCedula());
        tnombre.setText(personaEditar.getNombre());
        tapellido.setText(personaEditar.getApellido());
        tdireccion.setText(personaEditar.getDireccion());
        tcorreo.setText(personaEditar.getCorreo());
        ttelefono.setText(personaEditar.getTelefono());        
        blimpiar.setEnabled(true);
    }//GEN-LAST:event_btraerActionPerformed

    private void beditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beditarActionPerformed
        if (personaEditar == null) {
            JOptionPane.showMessageDialog(rootPane, "No hay una persona seleccionada para editar", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Persona personaEditarLocal = gestionPersona.guardarEditar();
        if (personaEditarLocal != null) {
            personaEditarLocal.setIdPersona(personaEditar.getIdPersona());
            if (controladorPersona.editarPersona(personaEditarLocal)) {
                JOptionPane.showMessageDialog(rootPane, "Persona editada con exito del sitema.");
                limpiar();
                blimpiar.setEnabled(false);
                personaEditar = null;
            } else {
                JOptionPane.showMessageDialog(rootPane, "No se puede editar la persona", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_beditarActionPerformed

    private void bguardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bguardar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bguardar1ActionPerformed

    private void bbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbuscarActionPerformed
        Persona persona =controladorPersona.getPersonaCedula(tcedula.getText());       
        if(persona !=null){
            tnombre.setText(persona.getNombre());
            tapellido.setText(persona.getApellido());
            tdireccion.setText(persona.getDireccion());
            tcorreo.setText(persona.getCorreo());
            ttelefono.setText(persona.getTelefono());
                            blimpiar.setEnabled(true);

        }else {
            JOptionPane.showMessageDialog(rootPane, "No se encontro la persona con ese número de cédula en la base de datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            tcedula.setText("");
            tcedula.requestFocus();
        }
    }//GEN-LAST:event_bbuscarActionPerformed

    private void beliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beliminarActionPerformed
        
            if(controladorPersona!=null){
              if(controladorPersona.eliminarPersona(personaEditar)){
                   JOptionPane.showMessageDialog(rootPane,"Persona eliminada del sistema");
                  limpiar();
                  blimpiar.setEnabled(false);
               }else{
               JOptionPane.showMessageDialog(rootPane,"A ocurrido un eror al momento de eliminar la persona");
               }     
            }
    }//GEN-LAST:event_beliminarActionPerformed

    private void btelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btelefonoActionPerformed
        Persona persona =controladorPersona.getPersonatelefono(ttelefono.getText());       
        if(persona !=null){
            tcedula.setText(persona.getCedula());
            tnombre.setText(persona.getNombre());
            tapellido.setText(persona.getApellido());
            tdireccion.setText(persona.getDireccion());
            tcorreo.setText(persona.getCorreo());
            blimpiar.setEnabled(true);
        }else {
            JOptionPane.showMessageDialog(rootPane, "No se encontro la persona con ese número de telefono en la base de datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            ttelefono.setText("");
            ttelefono.requestFocus();
        }
    }//GEN-LAST:event_btelefonoActionPerformed

    private void blimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blimpiarActionPerformed
        limpiar();
        blimpiar.setEnabled(false);
    }//GEN-LAST:event_blimpiarActionPerformed

    private void ttablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ttablaActionPerformed
    }//GEN-LAST:event_ttablaActionPerformed

    private void btablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btablaActionPerformed
            
            try{
    PreparedStatement ps = cn.prepareStatement( "Select cedula,Nombres,Apellidos,Direccion,Correo,telefono from bdejercicio1.persona where "
    + "cedula LIKE '%"+ttabla.getText()+"%' "
    + "or Nombres LIKE '%"+ttabla.getText()+"%' "
    + "or Apellidos LIKE '%"+ttabla.getText()+"%' or Direccion LIKE '%"+ttabla.getText()+"%' "
    + "or telefono LIKE '%"+ttabla.getText()+"%';");
            ResultSet res=ps.executeQuery();
            if(res.next()){
                mostrar();
            }else{
                JOptionPane.showMessageDialog(null,"No existe un id asi ");
            }
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_btablaActionPerformed

    private void ttablaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ttablaKeyPressed

    }//GEN-LAST:event_ttablaKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestionContable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionContable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionContable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionContable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionContable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bbuscar;
    private javax.swing.JButton beditar;
    private javax.swing.JButton beliminar;
    private javax.swing.JButton bguardar;
    private javax.swing.JButton bguardar1;
    private javax.swing.JButton blimpiar;
    private javax.swing.JButton btabla;
    private javax.swing.JButton btelefono;
    private javax.swing.JButton btraer;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField tapellido;
    private javax.swing.JTextField tcedula;
    private javax.swing.JTextField tcorreo;
    private javax.swing.JTextField tdireccion;
    private javax.swing.JTextField tnombre;
    private javax.swing.JTextField ttabla;
    private javax.swing.JTextField ttelefono;
    // End of variables declaration//GEN-END:variables
}
