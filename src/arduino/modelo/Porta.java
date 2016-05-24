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
public class Porta {
    
    private String nome;
    
    
    public Porta(String n){
        
        this.setNome(n);
        
    }
    
    public void setNome(String n){
        
        this.nome = n;
        
    }
    
    public String getNome(){
        
        return this.nome;
        
    }
    
}
