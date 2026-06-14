public class Main {
    public static void main(String[] args) {
        Corredores corredor1 = new Corredores("Juan");
        Corredores corredor2 = new Corredores("Maria");
        Corredores corredor3 = new Corredores("Pedro");
        Corredores corredor4 = new Corredores("Ana");

        System.out.println("==============================================");
        System.out.println("                ESTADO INICIAL ");
        System.out.println("==============================================");
        imprimirEstado(corredor1, corredor2, corredor3, corredor4);
        System.out.println("----------------------------------------------\n");

        corredor1.start();
        corredor2.start();
        corredor3.start();
        corredor4.start();

        String ganadorDeterminado = null;

        while (corredor1.getState() != Thread.State.TERMINATED || 
               corredor2.getState() != Thread.State.TERMINATED || 
               corredor3.getState() != Thread.State.TERMINATED || 
               corredor4.getState() != Thread.State.TERMINATED) {

            if (ganadorDeterminado == null) {
                    ganadorDeterminado = imprimirGanador(corredor1, corredor2, corredor3, corredor4);  
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.out.println("Error: el hilo principal ha sido interrumpido.");
            }
        }

        System.out.println("\n==============================================");
        System.out.println("                  ESTADO FINAL ");
        System.out.println("==============================================");
        imprimirEstado(corredor1, corredor2, corredor3, corredor4);
        System.out.println("----------------------------------------------\n");

        if (ganadorDeterminado != null) {
            System.out.println("|> El ganador es: " + ganadorDeterminado);
        } else {
            System.out.println("No se pudo determinar un ganador.");
        }
    }

    public static void imprimirEstado(Corredores corredor1, Corredores corredor2, Corredores corredor3, Corredores corredor4) {
        System.out.println("Estado de " + corredor1.getName() + ": " + corredor1.getState());
        System.out.println("Estado de " + corredor2.getName() + ": " + corredor2.getState());
        System.out.println("Estado de " + corredor3.getName() + ": " + corredor3.getState());
        System.out.println("Estado de " + corredor4.getName() + ": " + corredor4.getState());  
    }

    public static String imprimirGanador(Corredores corredor1, Corredores corredor2, Corredores corredor3, Corredores corredor4) {
        if(corredor1.getState() == Thread.State.TERMINATED) {
            return corredor1.getName();
        } else if (corredor2.getState() == Thread.State.TERMINATED) {
            return corredor2.getName();
        } else if (corredor3.getState() == Thread.State.TERMINATED) {
            return corredor3.getName();
        } else if (corredor4.getState() == Thread.State.TERMINATED) {
            return corredor4.getName();
        }
        return null;
    }
}
