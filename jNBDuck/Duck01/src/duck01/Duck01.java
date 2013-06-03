/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package duck01;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vgl
 */
public class Duck01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("All done");
        try {
            int read = System.in.read();
        } catch (IOException ex) {
            Logger.getLogger(Duck01.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
