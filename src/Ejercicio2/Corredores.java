import java.util.*;
public class Corredores extends Thread {
    
    public Corredores() {
    }

    public Corredores(String name) {
        super(name);
    }

    @Override
    public void run() {
       Random random = new Random();
       int distancia = 1;

       while(distancia < 10){
            System.out.println(getName() + " avanzo al metro " + distancia);
            try{
                Thread.sleep(random.nextInt(200)+ 100);
            } catch (InterruptedException e) {
                System.out.println("Error: el corredor " + getName() + " ha sido interrumpido.");
            }

            distancia ++;
            if (distancia >= 10) {
                distancia = 10;
                System.out.println(getName() + " avanzo al metro " + distancia);
            }
       } 

       System.out.println(getName() + " llego a la meta");
    }
    
}
