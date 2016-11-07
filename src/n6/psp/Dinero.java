
package n6.psp;


/**
 *
 * @author julian
 */
public class Dinero extends Thread{
    /**
     * En este ejemplo tendria mas sentido pero ne sincronizar la variable
     */
    public double inicial=0;
    
   

    public Dinero(String name) {
        super(name);
    }

    public double getInicial() {
        return inicial;
    }

  
    
  synchronized void ingreso(){
      inicial++;
     
      
      
  }
    
    
    synchronized void extraer(){
       inicial--;
       
        
    }
    
    
    
    
    
    
    
    @Override
    public void run() {
        if ("Extraccion".equals(getName())){
            for (int i = 0; i < 5; i++) {
                extraer();
                System.out.println("Pago (EXTRAER) ---"+" Nos queda "+getInicial());
                
            }
        }
        if ("Ingreso".equals(getName())){
            for (int i = 0; i < 10; i++) {
                ingreso();
                System.out.println("Compran (INGRESO) ---"+" Nos queda "+getInicial());
            }
        }
        
       
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
