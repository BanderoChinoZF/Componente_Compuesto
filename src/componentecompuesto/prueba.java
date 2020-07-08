/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentecompuesto;

import javax.swing.JFrame;

/**
 *
 * @author luisa
 */
public class prueba {
   
    public static void main(String[] args) {
        JFrame f= new JFrame("Prueba de componente Compuesto");
        ComponenteCompuesto cdT= new ComponenteCompuesto(0);
        cdT.setTextLa("ESCRIBE NUMEROS CON LONGITUD DE 10 Y TITULO CENTRADO");
        cdT.setTipo(0);
        cdT.setLongitud(10);
        f.add(cdT);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setLocation(600,250);
        f.setSize(200,200);
    
    
}

}
