/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraction.practice;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cristian
 */
public abstract class FiguraGeometrica {

    Integer diametro;
    Integer numCirculos;
    List<Circulo> l;
    public FiguraGeometrica(int numCirculos,int diametro) {
        this.diametro = diametro;
        this.numCirculos = numCirculos;
    }
    
    public List<Circulo> dibujar(){
        l = new ArrayList<Circulo>();
        for (int i=0;i<numCirculos;i++) {
            l.add(new Circulo(diametro));
        }
        return l;
    }
}
