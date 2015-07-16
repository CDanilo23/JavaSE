/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraction.practice;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Cristian
 */
public class AbstractionPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Circulo> dibujar = new FiguraGeometrica(2, 2) {
                                }.dibujar();
        
        for (Iterator<Circulo> it = dibujar.iterator(); it.hasNext();) {
            System.out.println("diametro ".concat(it.next().diametro.toString()));
            
        }
    }
}
