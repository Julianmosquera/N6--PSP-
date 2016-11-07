
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
      System.out.println("  Se ingreso dinero ");
      
      
  }
    
    
    synchronized void extraer(){
       inicial--;
        System.out.println("Se saco dinero de la caja");
        
    }
    
    
    
    
    
    
    
    @Override
    public void run() {
        if ("Extraccion".equals(getName())){
            for (int i = 0; i < 5; i++) {
                extraer();
                System.out.println("Pagamos "+getInicial());
                
            }
        }
        if ("Ingreso".equals(getName())){
            for (int i = 0; i < 10; i++) {
                ingreso();
                System.out.println("Compran "+getInicial());
            }
        }
        
       
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
