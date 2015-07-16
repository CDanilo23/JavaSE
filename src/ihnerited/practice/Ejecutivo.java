/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ihnerited.practice;

/**
 *
 * @author Cristian
 */
public class Ejecutivo extends Empleado{

    public Ejecutivo(String cargo, Integer sueldo) {
      
    }

    public void hacerAlgo(){
        Empleado emp = new Ejecutivo("Gerente",1234);
        Ejecutivo eje = (Ejecutivo) emp; 
        System.out.println(eje.cargo+" "+eje.sueldo);
    }
}
