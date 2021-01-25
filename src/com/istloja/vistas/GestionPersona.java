/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.vistas;
import java.awt.FlowLayout;
import java.awt.GridLayout;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class GestionPersona extends JFrame{
    private JPanel panelTitulo = new JPanel();
    private JPanel panelCuerpo = new JPanel();
    public GestionPersona() {
    //mostrar pantalla
    //titulo de la ventana 
    this.setTitle("ventana");
    // tamaño inicial de la ventana 
    this.setSize(300,400);
    panelTitulo.setSize(300,600);
    panelCuerpo.setSize(200,300);
    // se agrega un layout distribuir los componentes 
    //panel.setLayout(new BoxLayout (panel, BoxLayoud.PAGE_AXIS))
    panelTitulo.setLayout(new FlowLayout());
    panelCuerpo.setLayout(new FlowLayout());

    JLabel label= new JLabel("Registro de personas");
        // agregar el panel a la ventana  

     this.add(panelTitulo);
       
    
    panelCuerpo.setLayout(new GridLayout(5,2));
        panelCuerpo.add(new JLabel("Nombre:"));
    panelCuerpo.add(new JTextField("Diego"));
        panelCuerpo.add(new JLabel("Apellido:"));
    panelCuerpo.add(new JTextField("Garcia"));
        panelCuerpo.add(new JLabel("Direccion:"));
    panelCuerpo.add(new JTextField("Daniel Alvarez"));
        panelCuerpo.add(new JLabel("Correo:"));
    panelCuerpo.add(new JTextField("dsgarcia@gmial.com"));
        panelCuerpo.add(new JLabel("celular:"));
    panelCuerpo.add(new JTextField("0989125607"));    

     JButton guardar=new JButton();
        guardar.setText("Guardar");
     JButton modificar=new JButton();
        modificar.setText("Modificar");
     JButton eliminar=new JButton();
        eliminar.setText("Eliminar");
     JButton traer=new JButton();
        traer.setText("Traer");
             
        panelTitulo.add(label);
   
        panelTitulo.add(panelCuerpo);
           
        panelTitulo.add(guardar);
        panelTitulo.add(modificar);
        panelTitulo.add(eliminar);
        panelTitulo.add(traer);

    
    this.setVisible(true);
    this.setLocationRelativeTo(null);
    // finalizar proceso
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}
