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
        Pond pond = new Pond(); 
        
        DuckBaseClass duck01 = new RedheadDuck(pond);
        DuckBaseClass duck02 = new MallardDuck(pond);
        DuckBaseClass duck03 = new GumDuck(pond);
        
        pond.printAllStatus(duck01);
        pond.printAllStatus(duck02);
        pond.printAllStatus(duck03);
    }
}

