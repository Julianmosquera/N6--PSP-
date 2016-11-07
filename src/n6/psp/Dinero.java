
package n6.psp;

/**
 *
 * @author julian
 */
public class Dinero extends Thread{
    public double inicial=2000;
   

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
                System.out.println("Pago ---"+" Nos queda "+getInicial());
                
            }
        }
        if ("Ingreso".equals(getName())){
            for (int i = 0; i < 10; i++) {
                ingreso();
                System.out.println("Compran ---"+" Nos queda "+getInicial());
            }
        }
        
       
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
