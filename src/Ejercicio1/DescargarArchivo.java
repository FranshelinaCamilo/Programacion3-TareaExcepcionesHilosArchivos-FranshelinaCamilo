import java.util.*;

public class DescargarArchivo extends Thread {
    public DescargarArchivo(){
    }   

    public DescargarArchivo(String nombre) {
        super(nombre);
    }

    @Override
    public void run() {
        System.out.println("Descargando " + getName() + "...");
        Random random = new Random();
        int progreso = 0;

        while(progreso < 100){
            System.out .println(getName() + " " + progreso + "%" );
            try{
                Thread.sleep(random.nextInt(1000) + 300);
            } catch (InterruptedException e) {
                System.out.println("La descarga de " + getName() + " fue interrumpida.");
                return;
            }

            progreso += random.nextInt(10) + 10;
            if(progreso >= 100){
                progreso = 100;
                System.out.println(getName() + " " + progreso + "%" );
            }
        }
        System.out.println(getName() + " completado");
    }
}
