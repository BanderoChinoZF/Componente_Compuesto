/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentecompuesto;

import componentesimple.ComponenteSimple;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author luisa
 */
public class ComponenteCompuesto extends JPanel {

    private ComponenteSimple cd;
    private JLabel la;
    private int pos;
    
  public ComponenteCompuesto(int pos){
      
      this.setLayout(new BorderLayout());
      cd= new ComponenteSimple();
      la= new JLabel("");
      setPos(pos);
      posicion();
  
  }
  
  public String Pos(){
        switch(pos){
        case 0: return "centro";
        case 1: return "izquierda";
        case 2: return "derecha";
        case 3: return "arriba";
        case 4: return "abajo";
        }
        return "";
    }
  
    public void posicion(){
        switch(pos){
           case 0:   this.add(la,BorderLayout.CENTER);
                     this.add(cd,BorderLayout.SOUTH); break;
           case 1:   this.add(la,BorderLayout.EAST);
                     this.add(cd); break;
           case 2:   this.add(la,BorderLayout.WEST);
                     this.add(cd); break;
           case 3:   this.add(la,BorderLayout.NORTH);
                     this.add(cd); break;
           case 4:   this.add(la,BorderLayout.SOUTH);
                     this.add(cd); break;        
                     
       }
    }
    
    public void setPos(int ti){
        pos= ti>2 || ti<0? 2:ti;
        
    }
    public void setTextLa(String tex){
       la.setText(tex);
    }
    
    public String getTextLabel(){
            return la.getText();
    }
    
     public String tipo(){
        return cd.tipo();
    }
    
     public void setLongitud(int t){
        cd.setLongitud(t);
    }
    
    public int getLongitud(){
            return cd.getLongitud();
    }
    
    public void setTipo(int ti){
        cd.setTipo(ti);
        
    }
    
    public int getTipo(){
        return cd.getTipo();
    }
    
    public void setTexDato(String d){
          cd.setTexDato(d);
      }
    
    public String getTextDa(){
            return cd.getDato();
    }
    
    public int getValorDa(){
            return cd.getValor();
    }
       
   public void setEnabled(boolean b){
        cd.setEnabled(b);
    }
    
    public void setEditable(boolean b){
        cd.setEditable(b);
    }
}
    

