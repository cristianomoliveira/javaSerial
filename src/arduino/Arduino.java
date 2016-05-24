/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arduino;

import arduino.visao.FormListaPortas;
import arduino.visao.FormTestSerial;


/**
 *
 * @author cristiano
 */
public class Arduino {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //FormListaPortas form = new FormListaPortas();
        FormTestSerial form = new FormTestSerial();
        form.setVisible(true);
    }
    
}
