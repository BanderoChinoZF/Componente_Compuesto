/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentecompuesto;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*; 
import java.io.Serializable;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author luisa
 */
public class Seleccion extends JPanel implements Serializable, ChangeListener{
    
    private JLabel titulo; //Pregunta
    private String datos[]; //Opciones 
    private JRadioButton botones[]; //JRadioButton
    private ButtonGroup grupo; //agrupar los JRadioButton
    private JButton boton;  //Boton Aceptar
    
    private int respuesta; //indice de la respuesta
    private JLabel correcto; //Eyiqueta de correcto/incorrecto
    private int numElementos;
    private boolean bandera; 
    
    public Seleccion (){
        this.setLayout(new BorderLayout());
        iniciaComponentes();
        eventos();
        setNumeroElementos(numElementos); 
    }
    
    private void iniciaComponentes (){
        this.setLayout(new BorderLayout());
        grupo = new ButtonGroup(); 
        titulo = new JLabel("", SwingConstants.CENTER);
        boton = new JButton("Aceptar");
        
        correcto = new JLabel("", SwingConstants.CENTER); 
        correcto.setVisible(false);
        
        add(titulo, BorderLayout.NORTH);
        add(correcto, BorderLayout.SOUTH);
        add(boton, BorderLayout.EAST);
        eventos();
    }
    
     private void eventos (){
        boton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!bandera){
                    correcto.setText("Incorrecto");
                    correcto.setVisible(true); 
                }
                else{
                    correcto.setText("Correcto");
                    correcto.setVisible(true); 
                }
            }
        });
    }
    
    @Override
    public void stateChanged(ChangeEvent e) {
        for(int i = 0; i < botones.length; i++){
            if(botones[i].isSelected()){
                if(respuesta == i)
                    bandera = true;
                else
                    bandera = false; 
            }     
        }
    }
    
    public void setNumeroElementos(int num) {
        numElementos = num;
        datos = new String[numElementos];
        botones = new JRadioButton[numElementos];
        
        JPanel panel = new JPanel(new FlowLayout());
        this.add(panel, BorderLayout.CENTER); 
        
        for (int i = 0; i < numElementos; i++) {
            JRadioButton  c = new JRadioButton();
            panel.add(c);
            botones[i] = c;
            grupo.add(botones[i]);
            botones[i].addChangeListener(this);
        }
    }
    
    public void setTitulos (String []datos){
        this.datos = datos;
        for(int i = 0; i < botones.length; i++){
            botones[i].setText(datos[i]);
        }
    }
    
    public void setTitulo(String t) {
        titulo.setText(t);
    }
    public void setRespuesta(int r){
        respuesta = r; 
    }
    
    public int getRespuesta()
    {
        return respuesta;
    }
}




    

