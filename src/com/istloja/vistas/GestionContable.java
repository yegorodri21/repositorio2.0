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
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Date;
import  javax.swing.JOptionPane ;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

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
            ButtonGroup gruporadios;
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
        cedula.setSelected(true);
        utilidades = new utilidades();
        limpiar();
        blimpiar.setEnabled(false);
        limpiar_p.setEnabled(false);
        limpiar_i.setEnabled(false);
        gestionPersona = new GestionPersona(tcedula, tnombre, tapellido, tdireccion, tcorreo, ttelefono, tgenero, calendario, utilidades, this);
        tpcsi_i.setEnabled(false);
        pm_i.setEnabled(false);
        pcf_i.setEnabled(false);
        pcn_i.setEnabled(false);

    }
    void limpiar (){
        tcedula.setText("");
        tnombre.setText("");
        tapellido.setText("");
        tdireccion.setText("");
        tcorreo.setText("");
        ttelefono.setText("");    
        tgenero1.setText("");
    }
    private void calculos(){
        double sin_iva;
        double mayorista;
        double cliente_fijo;
        double cliente_normal;
        sin_iva=Double.parseDouble(tpci_i.getText())*0.12-Double.parseDouble(tpci_i.getText());
        String rsini=String.valueOf(sin_iva);
        
        mayorista=(sin_iva*0.15)+sin_iva;
        String rm=String.valueOf(mayorista);
        
        cliente_fijo=(sin_iva*0.18)+sin_iva;
        String rcf=String.valueOf(cliente_fijo);
        
        cliente_normal=(sin_iva*0.20)+sin_iva;
        String rcn=String.valueOf(cliente_normal);
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
        ttelefono1 = new javax.swing.JTextField();
        bbuscar = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        tgenero1 = new javax.swing.JTextField();
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
        btelefono = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        cedula = new javax.swing.JRadioButton();
        otro = new javax.swing.JRadioButton();
        tgenero = new javax.swing.JComboBox();
        jLabel36 = new javax.swing.JLabel();
        calendario = new com.toedter.calendar.JDateChooser();
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
        jLabel30 = new javax.swing.JLabel();
        dir_p = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        combo_p = new javax.swing.JComboBox();
        buscar_p = new javax.swing.JTextField();
        buscar_t = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla_p = new javax.swing.JTable();
        guardar_p = new javax.swing.JButton();
        beditar_p = new javax.swing.JButton();
        beliminar_p = new javax.swing.JButton();
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
        tpci_i = new javax.swing.JTextField();
        tpcsi_i = new javax.swing.JTextField();
        tcp_i = new javax.swing.JTextField();
        eliminar_i = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        pcn_i = new javax.swing.JTextField();
        pcf_i = new javax.swing.JTextField();
        pm_i = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        tnota_v = new javax.swing.JTextField();
        tcedula_v = new javax.swing.JTextField();
        tnombre_v = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        tfecha_v = new javax.swing.JTextField();
        tdireccion_v = new javax.swing.JTextField();
        ttelefono_v = new javax.swing.JTextField();

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

        bbuscar.setText("Buscar");
        bbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbuscarActionPerformed(evt);
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

        tgenero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgenero1ActionPerformed(evt);
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

        tcedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tcedulaFocusLost(evt);
            }
        });
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

        btelefono.setText("Buscar");
        btelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btelefonoActionPerformed(evt);
            }
        });

        jLabel29.setText("Genero");

        cedula.setText("cedula");
        cedula.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cedulaItemStateChanged(evt);
            }
        });
        cedula.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cedulaStateChanged(evt);
            }
        });
        cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaActionPerformed(evt);
            }
        });

        otro.setText("Otro");
        otro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                otroItemStateChanged(evt);
            }
        });
        otro.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                otroStateChanged(evt);
            }
        });
        otro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otroActionPerformed(evt);
            }
        });

        tgenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Indefinido", "Masculino", "Femenino" }));

        jLabel36.setText("Fecha Nacimiento");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel29))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tcedula)
                                    .addComponent(tnombre)
                                    .addComponent(tapellido)
                                    .addComponent(tcorreo)
                                    .addComponent(ttelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cedula)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(otro)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(tgenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(135, 135, 135)
                                        .addComponent(btelefono))
                                    .addComponent(tdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addGap(18, 18, 18)
                        .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 35, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cedula)
                    .addComponent(otro))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(tgenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36)
                    .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 15, Short.MAX_VALUE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel8)))
                .addGap(436, 436, 436))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(39, 39, 39)
                        .addComponent(combo_persona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(ttabla, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btabla)
                        .addGap(160, 160, 160))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1056, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bguardar)
                                .addGap(103, 103, 103)
                                .addComponent(beditar)
                                .addGap(83, 83, 83)
                                .addComponent(beliminar)
                                .addGap(112, 112, 112)
                                .addComponent(btraer)))
                        .addGap(92, 92, 92)
                        .addComponent(blimpiar)
                        .addGap(126, 126, 126))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bguardar)
                    .addComponent(beditar)
                    .addComponent(beliminar)
                    .addComponent(btraer)
                    .addComponent(blimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(combo_persona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ttabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btabla))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
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
        ruc_p.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ruc_pKeyReleased(evt);
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

        jLabel30.setText("Direccion");

        dir_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dir_pActionPerformed(evt);
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
                        .addComponent(jLabel30)
                        .addGap(144, 144, 144)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(ruc_p, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(arl_p, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nrl_p, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefono_p, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(correo_p, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ta_p, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(rs_p, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dir_p, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18)
                    .addComponent(correo_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dir_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addGap(18, 18, 18))
        );

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Proveedores");

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
        buscar_p.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buscar_pKeyPressed(evt);
            }
        });

        buscar_t.setText("Buscar");
        buscar_t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_tActionPerformed(evt);
            }
        });

        tabla_p.setModel(modelTableProveedores);
        jScrollPane3.setViewportView(tabla_p);

        guardar_p.setText("Guardar");
        guardar_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar_pActionPerformed(evt);
            }
        });

        beditar_p.setText("Editar");
        beditar_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beditar_pActionPerformed(evt);
            }
        });

        beliminar_p.setText("Eliminar");
        beliminar_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beliminar_pActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(504, 504, 504))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(348, 348, 348)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(guardar_p)
                        .addGap(155, 155, 155)
                        .addComponent(beditar_p)
                        .addGap(139, 139, 139)
                        .addComponent(beliminar_p)
                        .addGap(287, 287, 287))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addGap(27, 27, 27)
                        .addComponent(combo_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(buscar_p, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(buscar_t)
                        .addGap(262, 262, 262))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1047, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(beditar_p)
                    .addComponent(guardar_p)
                    .addComponent(beliminar_p))
                .addGap(3, 3, 3)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(combo_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar_t))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 696, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Proveedores", jPanel4);

        jTabbedPane3.addTab("Proveedores", jTabbedPane2);

        jTabbedPane4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTabbedPane4KeyTyped(evt);
            }
        });

        jLabel20.setText("INVENTARIO");

        jLabel28.setText("Buscar tabla");

        combo_i.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Codigo", "Descripcion" }));
        combo_i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_iActionPerformed(evt);
            }
        });

        btabla_i.setText("Buscar");
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

        jLabel24.setText("Precio Compra sin Iva ");

        jLabel25.setText("Precio Compra con Iva");

        jLabel26.setText("Cantidad Producto");

        tcod_i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcod_iActionPerformed(evt);
            }
        });

        tdescripcion_i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tdescripcion_iActionPerformed(evt);
            }
        });

        tpci_i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tpci_iActionPerformed(evt);
            }
        });
        tpci_i.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tpci_iKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tpci_iKeyTyped(evt);
            }
        });

        tpcsi_i.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tpcsi_iFocusLost(evt);
            }
        });
        tpcsi_i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tpcsi_iActionPerformed(evt);
            }
        });
        tpcsi_i.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tpcsi_iKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tpcsi_iKeyTyped(evt);
            }
        });

        tcp_i.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tcp_iKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tcp_iKeyTyped(evt);
            }
        });

        eliminar_i.setText("Eliminar");
        eliminar_i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_iActionPerformed(evt);
            }
        });

        jLabel31.setText("Precio Mayorista");

        jLabel32.setText("Precio cliente fijo ");

        jLabel33.setText("Precio cliente normal");

        jLabel34.setText("Fecha elaboracion");

        pcn_i.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pcn_iKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pcn_iKeyTyped(evt);
            }
        });

        pcf_i.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pcf_iKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pcf_iKeyTyped(evt);
            }
        });

        pm_i.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pm_iKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pm_iKeyTyped(evt);
            }
        });

        jLabel35.setText("Fecha caducidad");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel33)
                            .addComponent(jLabel32)
                            .addComponent(jLabel31)
                            .addComponent(jLabel26)
                            .addComponent(jLabel25)
                            .addComponent(jLabel23)
                            .addComponent(jLabel22)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(guardar_i)
                                .addComponent(jLabel24)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addContainerGap(59, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel34)
                            .addComponent(jLabel35))
                        .addGap(80, 80, 80)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tdescripcion_i)
                            .addComponent(tpci_i)
                            .addComponent(tpcsi_i)
                            .addComponent(tcp_i, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(pcn_i, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(pcf_i, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(pm_i, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(tcod_i)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(editar_i)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                        .addComponent(eliminar_i)
                        .addGap(31, 31, 31))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(tcod_i, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(tdescripcion_i, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(tpci_i, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(tpcsi_i, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(tcp_i, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(pm_i, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(pcf_i, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(pcn_i, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel35))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(eliminar_i))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editar_i)
                            .addComponent(guardar_i))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(514, 514, 514)
                                .addComponent(jLabel20))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(209, 209, 209)
                                .addComponent(jLabel28)
                                .addGap(18, 18, 18)
                                .addComponent(combo_i, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ttabla_i, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btabla_i)))
                        .addGap(0, 301, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4)))
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(666, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Inventario", jPanel6);

        jTabbedPane3.addTab("Inventario", jTabbedPane4);

        jLabel37.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel37.setText("NOTA VENTA");

        jLabel38.setText("NUMERO NOTA VENTA");

        jLabel40.setText("CEDULA O RUC CLIENTE");

        jLabel39.setText("NOMBRE CLIENTE ");

        tcedula_v.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tcedula_vKeyPressed(evt);
            }
        });

        tnombre_v.setEditable(false);

        jLabel41.setText("DIRECCION ");

        jLabel42.setText("TELFONO");

        jLabel43.setText("FECHA");

        tfecha_v.setEditable(false);

        tdireccion_v.setEditable(false);

        ttelefono_v.setEditable(false);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38)
                            .addComponent(jLabel40)
                            .addComponent(jLabel39)
                            .addComponent(jLabel42))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tnombre_v, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                            .addComponent(tcedula_v)
                            .addComponent(tnota_v)
                            .addComponent(ttelefono_v))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel41)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel43)
                                .addGap(9, 9, 9)))
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfecha_v, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                            .addComponent(tdireccion_v)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(tnota_v, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(tcedula_v, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(tnombre_v, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41)
                    .addComponent(tdireccion_v, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(jLabel43)
                    .addComponent(ttelefono_v, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfecha_v, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(202, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(916, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Ventas ", jPanel9);

        jTabbedPane3.addTab("Ventas", jTabbedPane5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(467, 467, 467))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            Persona  personaGuardar= gestionPersona.guardarEditar(false);
            if(personaGuardar!=null){
                personaGuardar.setFechanacimiendo(calendario.getDate());
            }
            if(controladorPersona!=null){
              if(controladorPersona.registrarPersona(personaGuardar)){
                   JOptionPane.showMessageDialog(rootPane,"Persona registrada en el sistema");
                  limpiar();
                  //mostrar();
                  modeltablepersona.setPersonas(controladorPersona.obtenerpersona());
            modeltablepersona.fireTableDataChanged();
               }else{
               JOptionPane.showMessageDialog(rootPane,"A ocurrido un error al momento de guardar la persona");
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
        tgenero.setSelectedIndex(personaEditar.getGenero()); 

        blimpiar.setEnabled(true);
    }//GEN-LAST:event_btraerActionPerformed

    private void beditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beditarActionPerformed
        if (personaEditar == null) {
            JOptionPane.showMessageDialog(rootPane, "No hay una persona seleccionada para editar", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Persona personaEditarLocal = gestionPersona.guardarEditar(true);
        if (personaEditarLocal != null) {
            personaEditarLocal.setFecha(personaEditarLocal.getFecha());
            personaEditarLocal.setIdPersona(personaEditar.getIdPersona());
            if (controladorPersona.editarPersona(personaEditarLocal)) {
                JOptionPane.showMessageDialog(rootPane, "Persona editada con exito del sitema.");
                limpiar();
                blimpiar.setEnabled(false);
                personaEditar = null;
                modeltablepersona.setPersonas(controladorPersona.obtenerpersona());
                 modeltablepersona.fireTableDataChanged();
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
            tgenero.setSelectedIndex(personaEditar.getGenero()); 
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
                  modeltablepersona.setPersonas(controladorPersona.obtenerpersona());
            modeltablepersona.fireTableDataChanged();
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
            tgenero.setSelectedIndex(personaEditar.getGenero()); 
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

    private void tpcsi_iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tpcsi_iActionPerformed
        
    }//GEN-LAST:event_tpcsi_iActionPerformed

    private void guardar_iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar_iActionPerformed
     Inventario i = new Inventario();
        i.setCodigo_pro(tcod_i.getText());
        i.setDescripcion(tdescripcion_i.getText());
        i.setPrecio_compra_con_iva(Double.parseDouble(tpci_i.getText()));
        i.setPrecio_compra_sin_iva(Double.parseDouble(tpcsi_i.getText()));
        i.setCan_productos(tcp_i.getText());
        i.setPrecio_mayorista(tcp_i.getText());
        i.setPrecio_cliente_fijo(tcp_i.getText());
        i.setPrecio_cliente_normal(tcp_i.getText());
        i.setFecha_elaboracion(new Date());
        i.setFecha_caducidad(new Date ());

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
        i.setPrecio_compra_con_iva(Double.parseDouble(tpci_i.getText()));
        i.setPrecio_compra_sin_iva(Double.parseDouble(tpcsi_i.getText()));
        i.setCan_productos(tcp_i.getText());
        i.setPrecio_mayorista(tcp_i.getText());
        i.setPrecio_cliente_fijo(tcp_i.getText());
        i.setPrecio_cliente_normal(tcp_i.getText());
        i.setFecha_elaboracion(new Date());
        i.setFecha_caducidad(new Date());

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
        tpci_i.setText("");
        tpcsi_i.setText("");
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
            if (controladorProveedores.eliminarProveedor(proveedorSeleccionado)) {
                JOptionPane.showMessageDialog(rootPane, "Producto eliminado con éxito del sitema.");
                proveedorSeleccionado = null;
                modelTableProveedores.setProveedores(controladorProveedores.obtenerProveedores());
                modelTableProveedores.fireTableDataChanged();
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
                proveedores.setCorreo(dir_p.getText());
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
                JOptionPane.showMessageDialog(rootPane, "No se puede editar el proveedor", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }        
    }//GEN-LAST:event_beditar_pActionPerformed

    private void buscar_pKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscar_pKeyPressed
        if (evt.getKeyChar() !='1'){
            JOptionPane.showMessageDialog(null," ESa cedula no es Ecuatoriana vuelva a intentar ");
            buscar_p.setText("");
        }
    }//GEN-LAST:event_buscar_pKeyPressed

    private void ruc_pKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ruc_pKeyReleased
            
        
    }//GEN-LAST:event_ruc_pKeyReleased

    private void tpci_iKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tpci_iKeyPressed
        char x=evt.getKeyChar();
         if(Character.isLetter(x)){
             getToolkit().beep();//pitido
         
         JOptionPane.showMessageDialog(rootPane,"Ingrese solo números");
         tpci_i.setText("");
         }
    }//GEN-LAST:event_tpci_iKeyPressed

    private void tpcsi_iKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tpcsi_iKeyPressed

    }//GEN-LAST:event_tpcsi_iKeyPressed

    private void tpcsi_iKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tpcsi_iKeyTyped
        char a=evt.getKeyChar();
         if(a == KeyEvent.VK_SPACE){
             getToolkit().beep();//pitido
         
         JOptionPane.showMessageDialog(rootPane,"No puede realizar espacios");
         tpcsi_i.setText("");
         }
         if(evt.getKeyCode()==KeyEvent.VK_DELETE){
            tpci_i.setText("");
            pm_i.setText("");
            pcf_i.setText("");
            pcn_i.setText("");
         }
    }//GEN-LAST:event_tpcsi_iKeyTyped

    private void tcp_iKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tcp_iKeyTyped
                
    }//GEN-LAST:event_tcp_iKeyTyped

    private void tcp_iKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tcp_iKeyReleased
    char a=evt.getKeyChar();
                System.out.println("_________________Dejo de presionar la tecla_________________");
                System.out.println(a);
    }//GEN-LAST:event_tcp_iKeyReleased

    private void jTabbedPane4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTabbedPane4KeyTyped
//        if(KeyEvent.VK_ESCAPE){
//            getToolkit().beep();//pitido
//            
//            JOptionPane.showMessageDialog(rootPane,"Hello");
//            tcp_i.setText("");
//        } else {
//        }
    }//GEN-LAST:event_jTabbedPane4KeyTyped

    private void tpci_iKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tpci_iKeyTyped
char a=evt.getKeyChar();
         if(a == KeyEvent.VK_SPACE){
             getToolkit().beep();//pitido
         
         JOptionPane.showMessageDialog(rootPane,"No puede realizar espacios");
         tpci_i.setText("");
         }
    }//GEN-LAST:event_tpci_iKeyTyped

    private void dir_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dir_pActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dir_pActionPerformed

    private void pcn_iKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pcn_iKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_pcn_iKeyReleased

    private void pcn_iKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pcn_iKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_pcn_iKeyTyped

    private void pcf_iKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pcf_iKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_pcf_iKeyReleased

    private void pcf_iKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pcf_iKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_pcf_iKeyTyped

    private void pm_iKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pm_iKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_pm_iKeyReleased

    private void pm_iKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pm_iKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_pm_iKeyTyped

    private void cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaActionPerformed

    }//GEN-LAST:event_cedulaActionPerformed

    private void otroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_otroActionPerformed

    private void tcedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tcedulaFocusLost
if (cedula.isSelected()){
    if(tcedula.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Ingrese datos en el campo cedula.", "ERROR", JOptionPane.ERROR_MESSAGE);
                tcedula.requestFocus();
    }else if(!utilidades.validadorcedula(tcedula.getText())){
                JOptionPane.showMessageDialog(this, "la cédula ingresada esta incorrecta por favor verificar nuevamente", "ERROR", JOptionPane.ERROR_MESSAGE);
    }
}
 if (otro.isSelected()) {
            if (tcedula.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ingrese datos correctos", "ERROR", JOptionPane.ERROR_MESSAGE);
                tcedula.requestFocus();     
            }}    
   
    }//GEN-LAST:event_tcedulaFocusLost

    private void tgenero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgenero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tgenero1ActionPerformed

    private void cedulaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cedulaStateChanged
        
    }//GEN-LAST:event_cedulaStateChanged

    private void otroStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_otroStateChanged
        
    }//GEN-LAST:event_otroStateChanged

    private void otroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_otroItemStateChanged
        if(evt.getStateChange()==ItemEvent.SELECTED){
            cedula.setSelected(false);
        }    }//GEN-LAST:event_otroItemStateChanged

    private void cedulaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cedulaItemStateChanged
        if(evt.getStateChange()==ItemEvent.SELECTED){
            otro.setSelected(false);
        }
    }//GEN-LAST:event_cedulaItemStateChanged

    private void tpci_iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tpci_iActionPerformed
calculos();        
    }//GEN-LAST:event_tpci_iActionPerformed

    private void tcod_iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcod_iActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tcod_iActionPerformed

    private void tpcsi_iFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tpcsi_iFocusLost
        double valor = precioConIva(Double.parseDouble(tpcsi_i.getText()));
        tpci_i.setText(String.valueOf(valor));
        pm_i.setText(String.valueOf(precioMayorista(Double.parseDouble(tpci_i.getText()))));
        pcf_i.setText(String.valueOf(precioClienteFijo(Double.parseDouble(tpci_i.getText()))));
        pcn_i.setText(String.valueOf(precioNormal(Double.parseDouble(tpci_i.getText()))));
    }//GEN-LAST:event_tpcsi_iFocusLost

    private void tcedula_vKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tcedula_vKeyPressed
         char x=evt.getKeyChar();
         if(x == KeyEvent.VK_ENTER){
         Persona persona =controladorPersona.getPersonaCedula(tcedula_v.getText());       
        if(persona !=null){
            tnombre_v.setText(persona.getNombre());
            tdireccion_v.setText(persona.getDireccion());
            ttelefono_v.setText(persona.getTelefono());
        }else {
            JOptionPane.showMessageDialog(rootPane, "Cedula incorrecta intente nuevamente.", "ERROR", JOptionPane.ERROR_MESSAGE);
            tcedula_v.setText("");
            tcedula_v.requestFocus();
        
        
         }}
         
        
    }//GEN-LAST:event_tcedula_vKeyPressed
 public double precioConIva(double precioSinIva) {
        return ((precioSinIva * 0.12) + precioSinIva);
    }

    public double precioMayorista(double precioSinIva) {
        return ((precioSinIva * 0.10) + precioSinIva);
    }

    public double precioClienteFijo(double precioSinIva) {
        return ((precioSinIva * 0.12) + precioSinIva);
    }

    public double precioNormal(double precioSinIva) {
        return ((precioSinIva * 0.15) + precioSinIva);
    }
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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private com.toedter.calendar.JDateChooser calendario;
    private javax.swing.JRadioButton cedula;
    private javax.swing.JComboBox combo_i;
    private javax.swing.JComboBox combo_p;
    private javax.swing.JComboBox combo_persona;
    private javax.swing.JTextField correo_p;
    private javax.swing.JTextField dir_p;
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
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
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
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
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
    private javax.swing.JRadioButton otro;
    private javax.swing.JTextField pcf_i;
    private javax.swing.JTextField pcn_i;
    private javax.swing.JTextField pm_i;
    private javax.swing.JTextField rs_p;
    private javax.swing.JTextField ruc_p;
    private javax.swing.JTextField ta_p;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tabla_i;
    private javax.swing.JTable tabla_p;
    private javax.swing.JTextField tapellido;
    private javax.swing.JTextField tcedula;
    private javax.swing.JTextField tcedula_v;
    private javax.swing.JTextField tcod_i;
    private javax.swing.JTextField tcorreo;
    private javax.swing.JTextField tcp_i;
    private javax.swing.JTextField tdescripcion_i;
    private javax.swing.JTextField tdireccion;
    private javax.swing.JTextField tdireccion_v;
    private javax.swing.JTextField telefono_p;
    private javax.swing.JTextField tfecha_v;
    private javax.swing.JComboBox tgenero;
    private javax.swing.JTextField tgenero1;
    private javax.swing.JTextField tid_i;
    private javax.swing.JTextField tnombre;
    private javax.swing.JTextField tnombre_v;
    private javax.swing.JTextField tnota_v;
    private javax.swing.JTextField tpci_i;
    private javax.swing.JTextField tpcsi_i;
    private javax.swing.JTextField ttabla;
    private javax.swing.JTextField ttabla_i;
    private javax.swing.JTextField ttelefono;
    private javax.swing.JTextField ttelefono1;
    private javax.swing.JTextField ttelefono_v;
    // End of variables declaration//GEN-END:variables
    
    @Override
    public void clickPersona(Persona p) {
        tcedula.setText(p.getCedula());
        tnombre.setText(p.getNombre());
        tapellido.setText(p.getApellido());
        tdireccion.setText(p.getDireccion());
        ttelefono.setText(p.getTelefono());
        tcorreo.setText(p.getCorreo());
        tgenero.setSelectedIndex(p.getGenero());
        calendario.setDate(p.getFechanacimiendo());
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
    proveedorSeleccionado=p;
    }

    @Override
    public void clickInventario(Inventario i) {
        inventarioSeleccionado = i;
        tcod_i.setText(i.getCodigo_pro());
        tdescripcion_i.setText(i.getDescripcion());
//        tpci_i.setText(i.getPrecio_compra_con_iva());
//        tpcsi_i.setText(Double.parseDouble(i.getPrecio_compra_sin_iva()));
        tcp_i.setText(i.getCan_productos());
    }

}
