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
import com.istloja.controlador.Inventariob;
import com.istloja.controlador.Proveedoresb;
import com.istloja.modelTables.ComunicacionPersona;
import com.istloja.modelTables.Modeltablepersona;
import com.istloja.modelTables.Modeltableinventario;
import com.istloja.modelTables.Modeltableproveedores;
import com.istloja_modelo.Inventario;
import com.istloja_modelo.Proveedores;
import java.sql.Connection;
import java.util.ArrayList;
import  javax.swing.JOptionPane ;
import java.util.List;

import javax.swing.table.DefaultTableModel;



public class GestionContable extends javax.swing.JFrame implements ComunicacionPersona{
    Conexion cc =new Conexion(); 
    Connection cn=cc.conectarBaseDatos();
    DefaultTableModel model;
    private utilidades utilidades;
    private Personabd controladorPersona;
    private Proveedoresb controladorProveedores;
    private Inventariob controladorInventario;
    private Persona personaEditar;
    private Inventario inventarioSeleccionado;
    private Proveedores proveedorSeleccionado;
    private GestionPersona gestionPersona;
    private GestionProveedor gestionProveedor;
    private GestionInventario gestioninventario;

    private Modeltablepersona modeltablepersona;
    private Modeltableproveedores modelTableProveedores;
    private Modeltableinventario modelTableInventario;
    /**
     * Creates new form GestionPersona1
     */
    public GestionContable() {
        controladorPersona = new Personabd();
        controladorProveedores = new Proveedoresb();
        controladorInventario = new Inventariob();
        modeltablepersona = new Modeltablepersona (controladorPersona.obtenerpersona(),this);
        modelTableProveedores = new Modeltableproveedores(controladorProveedores.obtenerProveedores(), this);
        modelTableInventario = new Modeltableinventario(controladorInventario.obtenerinventario(), this);
        initComponents();
        utilidades = new utilidades();
        limpiar();
        blimpiar.setEnabled(false);
        limpiar_p.setEnabled(false);
        limpiar_i.setEnabled(false);
        gestionPersona = new GestionPersona(tcedula, tnombre, tapellido, tdireccion, tcorreo, ttelefono, utilidades, this);

    }
    void limpiar (){
        tcedula.setText("");
        tnombre.setText("");
        tapellido.setText("");
        tdireccion.setText("");
        tcorreo.setText("");
        ttelefono.setText("");    
    }
    
//    void buscarCliente(String buscar){
//        id (combob.getSelectedIndex()==0){
  //      tabla.setModel();
    //}
    //}
  /*MI PROCESO..............................
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
               + "or Apellidos LIKE '%"+ttabla.getText()+"%' "
               + "or Direccion LIKE '%"+ttabla.getText()+"%' "
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
    }*/

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
        bbuscar1 = new javax.swing.JButton();
        btelefono1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel8 = new javax.swing.JPanel();
        tid_i = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        bguardar_p = new javax.swing.JButton();
        buscar_pp = new javax.swing.JButton();
        Bbuscar_i = new javax.swing.JButton();
        limpiar_p = new javax.swing.JButton();
        limpiar_i = new javax.swing.JButton();
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
        combo_persona = new javax.swing.JComboBox();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        ruc_p = new javax.swing.JTextField();
        ta_p = new javax.swing.JTextField();
        rs_p = new javax.swing.JTextField();
        nrl_p = new javax.swing.JTextField();
        arl_p = new javax.swing.JTextField();
        correo_p = new javax.swing.JTextField();
        telefono_p = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        beliminar_p = new javax.swing.JButton();
        beditar_p = new javax.swing.JButton();
        guardar_p = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla_p = new javax.swing.JTable();
        jLabel27 = new javax.swing.JLabel();
        combo_p = new javax.swing.JComboBox();
        buscar_p = new javax.swing.JTextField();
        buscar_t = new javax.swing.JButton();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        combo_i = new javax.swing.JComboBox();
        ttabla_i = new javax.swing.JTextField();
        btabla_i = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla_i = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        guardar_i = new javax.swing.JButton();
        editar_i = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        tcod_i = new javax.swing.JTextField();
        tdescripcion_i = new javax.swing.JTextField();
        tpc_i = new javax.swing.JTextField();
        tpv_i = new javax.swing.JTextField();
        tcp_i = new javax.swing.JTextField();
        eliminar_i = new javax.swing.JButton();
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

        bbuscar1.setText("Buscar");
        bbuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbuscar1ActionPerformed(evt);
            }
        });

        btelefono1.setText("Buscar");
        btelefono1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btelefono1ActionPerformed(evt);
            }
        });

        jLabel17.setText("Telefono");

        jButton5.setText("jButton5");

        jButton7.setText("jButton7");

        jButton6.setText("jButton6");

        jScrollPane2.setViewportView(jTextPane1);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        tid_i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tid_iActionPerformed(evt);
            }
        });

        jLabel21.setText("ID_Inventario");

        jButton16.setText("Buscar");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        bguardar_p.setText("Guardar");
        bguardar_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bguardar_pActionPerformed(evt);
            }
        });

        buscar_pp.setText("Buscar");
        buscar_pp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_ppActionPerformed(evt);
            }
        });

        Bbuscar_i.setText("Buscar");
        Bbuscar_i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bbuscar_iActionPerformed(evt);
            }
        });

        limpiar_p.setText("Limpiar");
        limpiar_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiar_pActionPerformed(evt);
            }
        });

        limpiar_i.setText("Limpiar");
        limpiar_i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiar_iActionPerformed(evt);
            }
        });

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

        jLabel10.setText("Cliente");

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

        combo_persona.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cedula", "Nombre" }));
        combo_persona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_personaActionPerformed(evt);
            }
        });

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combo_persona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ttabla, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btabla))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
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
                    .addComponent(btabla)
                    .addComponent(combo_persona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jTabbedPane3.addTab("Clientes", jPanel1);

        jLabel11.setText("Ruc");

        jLabel12.setText("Razon social");

        jLabel13.setText("Tipo Actividad");

        jLabel14.setText("Nombre Representante Legal");

        jLabel15.setText("Apellidos Representante Legal");

        jLabel16.setText("Telefono");

        ruc_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ruc_pActionPerformed(evt);
            }
        });

        rs_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rs_pActionPerformed(evt);
            }
        });

        correo_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correo_pActionPerformed(evt);
            }
        });

        jLabel18.setText("Correo");

        beliminar_p.setText("Eliminar");
        beliminar_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beliminar_pActionPerformed(evt);
            }
        });

        beditar_p.setText("Editar");
        beditar_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beditar_pActionPerformed(evt);
            }
        });

        guardar_p.setText("Guardar");
        guardar_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar_pActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(guardar_p)
                        .addGap(56, 56, 56)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ruc_p, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(arl_p, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nrl_p, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(telefono_p, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(correo_p, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ta_p, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(rs_p, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(beditar_p)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(beliminar_p)
                        .addGap(68, 68, 68))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(ruc_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(rs_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(ta_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(nrl_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(arl_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(telefono_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(correo_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(beliminar_p)
                    .addComponent(beditar_p)
                    .addComponent(guardar_p)))
        );

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Proveedores");

        tabla_p.setModel(modelTableProveedores);
        jScrollPane3.setViewportView(tabla_p);

        jLabel27.setText("Buscar tabla");

        combo_p.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cedula", "Nombre" }));
        combo_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_pActionPerformed(evt);
            }
        });

        buscar_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_pActionPerformed(evt);
            }
        });

        buscar_t.setText("Buscar");
        buscar_t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_tActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combo_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscar_p, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscar_t)))
                .addGap(9, 9, 9))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(combo_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar_t))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Proveedores", jPanel4);

        jTabbedPane3.addTab("Proveedores", jTabbedPane2);

        jLabel20.setText("INVENTARIO");

        jLabel28.setText("Buscar tabla");

        combo_i.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Codigo", "Descripcion" }));
        combo_i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_iActionPerformed(evt);
            }
        });

        btabla_i.setText("Agregar");
        btabla_i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btabla_iActionPerformed(evt);
            }
        });

        tabla_i.setModel(modelTableInventario);
        jScrollPane4.setViewportView(tabla_i);

        guardar_i.setText("Agregar");
        guardar_i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar_iActionPerformed(evt);
            }
        });

        editar_i.setText("Editar");
        editar_i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editar_iActionPerformed(evt);
            }
        });

        jLabel22.setText("Cod_Inventario");

        jLabel23.setText("Descripcion");

        jLabel24.setText("Precio Venta");

        jLabel25.setText("Precio Compra");

        jLabel26.setText("Cantidad Producto");

        tdescripcion_i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tdescripcion_iActionPerformed(evt);
            }
        });

        tpv_i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tpv_iActionPerformed(evt);
            }
        });

        eliminar_i.setText("Eliminar");
        eliminar_i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_iActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel26)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25)
                            .addComponent(jLabel23)
                            .addComponent(jLabel22)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(guardar_i)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tcod_i, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tdescripcion_i)
                                .addComponent(tpc_i)
                                .addComponent(tpv_i)
                                .addComponent(tcp_i, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)))
                        .addContainerGap(103, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editar_i)
                        .addGap(61, 61, 61)
                        .addComponent(eliminar_i)
                        .addGap(57, 57, 57))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tcod_i, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(tdescripcion_i, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(tpc_i, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(tpv_i, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(tcp_i, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardar_i)
                    .addComponent(editar_i)
                    .addComponent(eliminar_i)))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLabel20))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combo_i, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ttabla_i, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btabla_i)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(combo_i, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ttabla_i, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btabla_i))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Inventario", jPanel6);

        jTabbedPane3.addTab("Inventario", jTabbedPane4);
        jTabbedPane3.addTab("Ventas", jTabbedPane5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
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
                .addContainerGap(27, Short.MAX_VALUE))
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
if (controladorPersona.getPersonaCedula(tid_i.getText())!=null){
        JOptionPane.showMessageDialog(rootPane,"El numero de cedula ingresado ya se encuentra registrado en el sistema","Error",JOptionPane.ERROR_MESSAGE);
   
        }else{
            Persona editarPersona = gestionPersona.guardarEditar();
            if(controladorPersona!=null){
              if(controladorPersona.registrarPersona(editarPersona)){
                   JOptionPane.showMessageDialog(rootPane,"Persona registrada en el sistema");
                  limpiar();
                  //mostrar();
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
//                mostrar();
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
//                  mostrar();
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
    //buscarCliente(ttabla.getText());
   
    }//GEN-LAST:event_ttablaActionPerformed

    private void btablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btablaActionPerformed
    System.out.println("Combo" + combo_persona.getSelectedIndex());
        switch (combo_persona.getSelectedIndex()) {
            case 0://cedula
                modeltablepersona.setPersonas(controladorPersona.obtenerPersonacedula(ttabla.getText()));
                modeltablepersona.fireTableDataChanged();
                break;
            case 1://nombre
                modeltablepersona.setPersonas(controladorPersona.obtenerPersonanombre(ttabla.getText()));
                modeltablepersona.fireTableDataChanged();
                break;
        }

    }//GEN-LAST:event_btablaActionPerformed

    private void ttablaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ttablaKeyPressed

    }//GEN-LAST:event_ttablaKeyPressed

    private void combo_personaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_personaActionPerformed
    }//GEN-LAST:event_combo_personaActionPerformed

    private void ruc_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ruc_pActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ruc_pActionPerformed

    private void rs_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rs_pActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rs_pActionPerformed

    private void bbuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbuscar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bbuscar1ActionPerformed

    private void btelefono1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btelefono1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btelefono1ActionPerformed

    private void correo_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correo_pActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correo_pActionPerformed

    private void tpv_iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tpv_iActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tpv_iActionPerformed

    private void guardar_iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar_iActionPerformed
     Inventario i = new Inventario();
        i.setCodigo_pro(tcod_i.getText());
        i.setDescripcion(tdescripcion_i.getText());
        i.setPrecios_compra(tpc_i.getText());
        i.setPrecios_venta(tpv_i.getText());
        i.setCan_productos(tcp_i.getText());
        if (controladorInventario.registrarInventario(i)) {
            JOptionPane.showMessageDialog(rootPane, "Producto guardado con éxito del sitema.");
        limpiarInventario();
        modelTableInventario.setInventarios(controladorInventario.obtenerinventario());
            modelTableInventario.fireTableDataChanged();
        } else {
            JOptionPane.showMessageDialog(rootPane, "No se puede guardar el producto.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_guardar_iActionPerformed

    private void bguardar_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bguardar_pActionPerformed
       
    }//GEN-LAST:event_bguardar_pActionPerformed

    private void combo_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_pActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_pActionPerformed

    private void buscar_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_pActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscar_pActionPerformed

    private void buscar_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_tActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscar_tActionPerformed

    private void combo_iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_iActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_iActionPerformed

    private void btabla_iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btabla_iActionPerformed
         System.out.println("Combo" + combo_i.getSelectedIndex());
        switch (combo_i.getSelectedIndex()) {
            case 0://Codigo
                modelTableInventario.setInventarios(controladorInventario.obtenerProductosInventarioCodigo(ttabla_i.getText()));
                modelTableInventario.fireTableDataChanged();
                break;
            case 1://7Descripcion
                modelTableInventario.setInventarios(controladorInventario.obtenerProductosInventarioDescripcion(ttabla_i.getText()));
                modelTableInventario.fireTableDataChanged();
                break;
        }
    }//GEN-LAST:event_btabla_iActionPerformed

    private void tdescripcion_iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tdescripcion_iActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tdescripcion_iActionPerformed

    private void tid_iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tid_iActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tid_iActionPerformed

    private void Bbuscar_iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bbuscar_iActionPerformed
        Inventario inventario =controladorInventario.getInventariocodigo(tcod_i.getText());       
        if(inventario !=null){
            tdescripcion_i.setText(inventario.getDescripcion());
            tpc_i.setText(inventario.getPrecios_compra());
            tpv_i.setText(inventario.getPrecios_venta());
            tcp_i.setText(inventario.getCan_productos());
            blimpiar.setEnabled(true);

        }else {
            JOptionPane.showMessageDialog(rootPane, "No se encontro un inventario con ese número de codigo en la base de datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
           
        } 
    }//GEN-LAST:event_Bbuscar_iActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void buscar_ppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_ppActionPerformed
    Proveedores proveedores =controladorProveedores.getProveedoresruc(ruc_p.getText());       
        if(proveedores !=null){
            rs_p.setText(proveedores.getRazonSocial());
            ta_p.setText(proveedores.getTipoActividad());
            nrl_p.setText(proveedores.getNombreRepresentanteLegal());
            arl_p.setText(proveedores.getApellidosRepresentanteLegal());
            telefono_p.setText(proveedores.getTelefono());
            correo_p.setText(proveedores.getCorreo());

            blimpiar.setEnabled(true);

        }else {
            JOptionPane.showMessageDialog(rootPane, "No se encontro un proveedor con ese ruc en la base de datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
           
        }  
    }//GEN-LAST:event_buscar_ppActionPerformed

    private void editar_iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editar_iActionPerformed
          if (inventarioSeleccionado == null) {
            JOptionPane.showMessageDialog(rootPane, "No hay un producto seleccionada para editar", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (inventarioSeleccionado != null) {
             inventarioSeleccionado = valoresActualizarInventario(inventarioSeleccionado);
            if (controladorInventario.editarInventario(inventarioSeleccionado)) {
                JOptionPane.showMessageDialog(rootPane, "Persona editada con exito del sitema.");
                limpiarInventario();
                inventarioSeleccionado = null;
                modelTableInventario.setInventarios(controladorInventario.obtenerinventario());
                modelTableInventario.fireTableDataChanged();
            } else {
                JOptionPane.showMessageDialog(rootPane, "No se puede editar la persona", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
//        
    }//GEN-LAST:event_editar_iActionPerformed

     private Inventario valoresActualizarInventario(Inventario i) {
        i.setCodigo_pro(tcod_i.getText());
        i.setDescripcion(tdescripcion_i.getText());
        i.setPrecios_compra(tpc_i.getText());
        i.setPrecios_venta(tpv_i.getText());
        i.setCan_productos(tcp_i.getText());
        return i;
    }
     private Proveedores valoresActualizarProveedor(Proveedores i) {
        i.setRuc(ruc_p.getText());
        i.setRazonSocial(rs_p.getText());
        i.setTipoActividad(ta_p.getText());
        i.setNombreRepresentanteLegal(nrl_p.getText());
        i.setApellidosRepresentanteLegal(arl_p.getText());
        i.setTelefono(telefono_p.getText());
        i.setCorreo(correo_p.getText());
        return i;
    }
//Metodo para limpiar campos
    void limpiarCamposProveedor() {
        ruc_p.setText("");
        rs_p.setText("");
        ta_p.setText("");
        nrl_p.setText("");
        arl_p.setText("");
        telefono_p.setText("");
        correo_p.setText("");
    }

    void limpiarInventario() {
        tcod_i.setText("");
        tdescripcion_i.setText("");
        tpc_i.setText("");
        tpv_i.setText("");
        tcp_i.setText("");
    }
         
    private void limpiar_iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiar_iActionPerformed
    limpiarInventario();
    limpiar_i.setEnabled(false);

    }//GEN-LAST:event_limpiar_iActionPerformed

    private void limpiar_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiar_pActionPerformed
    limpiarCamposProveedor();
    limpiar_p.setEnabled(false);

    }//GEN-LAST:event_limpiar_pActionPerformed

    private void beliminar_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beliminar_pActionPerformed
if (proveedorSeleccionado != null) {
            if (controladorInventario.eliminarInventario(inventarioSeleccionado)) {
                JOptionPane.showMessageDialog(rootPane, "Producto eliminado con éxito del sitema.");
                inventarioSeleccionado = null;
                modelTableInventario.setInventarios(controladorInventario.obtenerinventario());
                modelTableInventario.fireTableDataChanged();
                limpiarCamposProveedor();
            } else {
                JOptionPane.showMessageDialog(rootPane, "No se puede eliminar el producto seleccionado.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "No hay producto seleccionada para eliminar.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_beliminar_pActionPerformed

    private void eliminar_iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_iActionPerformed
        if (proveedorSeleccionado != null) {
            if (controladorProveedores.eliminarProveedor(proveedorSeleccionado)) {
                JOptionPane.showMessageDialog(rootPane, "Producto eliminado con éxito del sitema.");
                proveedorSeleccionado = null;
                modelTableProveedores.setProveedores(controladorProveedores.obtenerProveedores());
                modelTableProveedores.fireTableDataChanged();
                limpiarInventario();
            } else {
                JOptionPane.showMessageDialog(rootPane, "No se puede eliminar el producto seleccionado.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "No hay producto seleccionada para eliminar.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_eliminar_iActionPerformed

    private void guardar_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar_pActionPerformed
    Proveedores proveedores = new Proveedores();
        proveedores.setRuc(ruc_p.getText());
        proveedores.setRazonSocial(rs_p.getText());
        proveedores.setTipoActividad(ta_p.getText());
        proveedores.setNombreRepresentanteLegal(nrl_p.getText());
        proveedores.setApellidosRepresentanteLegal(arl_p.getText());
        proveedores.setTelefono(telefono_p.getText());
        proveedores.setCorreo(correo_p.getText());
        if (controladorProveedores.registrarProveedor(proveedores)) {
            JOptionPane.showMessageDialog(rootPane, "Proveedor guardado con éxito del sitema.");
        limpiarCamposProveedor();
        modelTableProveedores.setProveedores(controladorProveedores.obtenerProveedores());
            modelTableProveedores.fireTableDataChanged();
        } else {
            JOptionPane.showMessageDialog(rootPane, "No se puede guardar el proveedor.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_guardar_pActionPerformed

    private void beditar_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beditar_pActionPerformed
        if (proveedorSeleccionado == null) {
            JOptionPane.showMessageDialog(rootPane, "No hay un producto seleccionada para editar", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (proveedorSeleccionado != null) {
             proveedorSeleccionado = valoresActualizarProveedor(proveedorSeleccionado);
            if (controladorProveedores.editarProveedores(proveedorSeleccionado)) {
                JOptionPane.showMessageDialog(rootPane, "Persona editada con exito del sitema.");
            limpiarCamposProveedor();
            proveedorSeleccionado = null;
                modelTableProveedores.setProveedores(controladorProveedores.obtenerProveedores());
                modelTableProveedores.fireTableDataChanged();
            } else {
                JOptionPane.showMessageDialog(rootPane, "No se puede editar la persona", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }        
    }//GEN-LAST:event_beditar_pActionPerformed

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
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionContable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bbuscar_i;
    private javax.swing.JTextField arl_p;
    private javax.swing.JButton bbuscar;
    private javax.swing.JButton bbuscar1;
    private javax.swing.JButton beditar;
    private javax.swing.JButton beditar_p;
    private javax.swing.JButton beliminar;
    private javax.swing.JButton beliminar_p;
    private javax.swing.JButton bguardar;
    private javax.swing.JButton bguardar1;
    private javax.swing.JButton bguardar_p;
    private javax.swing.JButton blimpiar;
    private javax.swing.JButton btabla;
    private javax.swing.JButton btabla_i;
    private javax.swing.JButton btelefono;
    private javax.swing.JButton btelefono1;
    private javax.swing.JButton btraer;
    private javax.swing.JTextField buscar_p;
    private javax.swing.JButton buscar_pp;
    private javax.swing.JButton buscar_t;
    private javax.swing.JComboBox combo_i;
    private javax.swing.JComboBox combo_p;
    private javax.swing.JComboBox combo_persona;
    private javax.swing.JTextField correo_p;
    private javax.swing.JButton editar_i;
    private javax.swing.JButton eliminar_i;
    private javax.swing.JButton guardar_i;
    private javax.swing.JButton guardar_p;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JButton limpiar_i;
    private javax.swing.JButton limpiar_p;
    private javax.swing.JTextField nrl_p;
    private javax.swing.JTextField rs_p;
    private javax.swing.JTextField ruc_p;
    private javax.swing.JTextField ta_p;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tabla_i;
    private javax.swing.JTable tabla_p;
    private javax.swing.JTextField tapellido;
    private javax.swing.JTextField tcedula;
    private javax.swing.JTextField tcod_i;
    private javax.swing.JTextField tcorreo;
    private javax.swing.JTextField tcp_i;
    private javax.swing.JTextField tdescripcion_i;
    private javax.swing.JTextField tdireccion;
    private javax.swing.JTextField telefono_p;
    private javax.swing.JTextField tid_i;
    private javax.swing.JTextField tnombre;
    private javax.swing.JTextField tpc_i;
    private javax.swing.JTextField tpv_i;
    private javax.swing.JTextField ttabla;
    private javax.swing.JTextField ttabla_i;
    private javax.swing.JTextField ttelefono;
    // End of variables declaration//GEN-END:variables
    
    @Override
    public void clickPersona(Persona p) {
        tcedula.setText(p.getCedula());
        tnombre.setText(p.getNombre());
        tapellido.setText(p.getApellido());
        tdireccion.setText(p.getDireccion());
        ttelefono.setText(p.getTelefono());
        tcorreo.setText(p.getCorreo());
        blimpiar.setEnabled(true);
        personaEditar=p;
    }
     
     @Override
    public void clickProveedores(Proveedores p) {
        ruc_p.setText(p.getRuc());
        rs_p.setText(p.getRazonSocial());
        ta_p.setText(p.getTipoActividad());
        nrl_p.setText(p.getNombreRepresentanteLegal());
        arl_p.setText(p.getApellidosRepresentanteLegal());
        telefono_p.setText(p.getTelefono());
        correo_p.setText(p.getCorreo());

    }

    @Override
    public void clickInventario(Inventario i) {
        inventarioSeleccionado = i;
        tcod_i.setText(i.getCodigo_pro());
        tdescripcion_i.setText(i.getDescripcion());
        tpc_i.setText(i.getPrecios_compra());
        tpv_i.setText(i.getPrecios_venta());
        tcp_i.setText(i.getCan_productos());
    }

}
