public class Main {
    public static void main(String[] args) {
        DescargarArchivo archivo1 = new DescargarArchivo("Archivo1");
        DescargarArchivo archivo2 = new DescargarArchivo("Archivo2");
        DescargarArchivo archivo3 = new DescargarArchivo("Archivo3");

        System.out.println("==================================");
        System.out.println("SIMULACIÓN DE DESCARGA DE ARCHIVOS");
        System.out.println("==================================");
        
        archivo1.start();
        archivo2.start();
        archivo3.start();
    }
}