/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arduino.modelo;

/**
 *
 * @author cristiano
 */

import gnu.io.CommPortIdentifier;
import java.util.Enumeration;
public class Portas {
    
    private String[] portas;
    private Enumeration listaPortas;
    
    
  public Portas(){
      
      this.setPortas();
  
  
  }  
  public void setPortas(){
      
      
      this.listaPortas = CommPortIdentifier.getPortIdentifiers();
      
  }
    
    public String[] getPortas(){
        
        portas = new String[5];
        int i = 0;
        
        while (listaPortas.hasMoreElements()){
            CommPortIdentifier numPorta = (CommPortIdentifier) this.listaPortas.nextElement();
   
            portas[i] = numPorta.getName()+"  -  "+this.nomePorta(numPorta.getPortType());
            i++;
            
        }
        
        return portas;
    } 
    
    
    
    public String nomePorta(int numPorta){
        
        switch(numPorta){
            
            case CommPortIdentifier.PORT_SERIAL: 
                return "Porta Serial";
            case CommPortIdentifier.PORT_PARALLEL: 
                return "Porta Paralela";
            case CommPortIdentifier.PORT_I2C: 
                return "Porta I2C";
            case CommPortIdentifier.PORT_RAW: 
                return "Porta RAW";
            default:
                return "Porta Desconhecida";
        }

        
    }
        
    
}
