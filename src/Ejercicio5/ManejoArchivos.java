import java.io.*;
import java.util.*;
public class ManejoArchivos {
    public static void Escribir(Scanner sc){
        try{
            FileWriter fw = new FileWriter("actividades.txt", true);
            BufferedWriter buffer = new BufferedWriter(fw);

            System.out.print("|> Ingrese una actividad: ");
            String act = sc.nextLine();

            buffer.write(act);
            buffer.newLine();
            buffer.close();
        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void Mostrar(){
        try{
            File archivo = new File("actividades.txt");
            if(archivo.exists()){
                FileReader fr = new FileReader("actividades.txt");
                BufferedReader buffer = new BufferedReader(fr);
                String linea;

                while((linea = buffer.readLine()) != null){
                    System.out.println(linea);
                }

                buffer.close();
            }
            else{
                System.out.println("Archivo no encontrado.");
            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
