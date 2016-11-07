
package n6.psp;

/**
 *
 * @author julian
 */
public class N6PSP {

    
    public static void main(String[] args) {
        Dinero d1=new Dinero("Ingreso");
        Dinero d2=new Dinero("Extraccion");
        Dinero d3=new Dinero("Extraccion");
        Dinero d4=new Dinero("Extraccion");
        Dinero d5=new Dinero("Ingreso");
        Dinero d6=new Dinero("Extraccion");
        
        
        d1.start();
        d2.start();
        d3.start();
        d4.start();
        d5.start();
        d6.start();
        
    }
    
}
