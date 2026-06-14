import java.io.*;
import java.util.*;
public class Main{
    static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        menu(sc);
    }

    public static void menu(Scanner sc){
        int opcion = 0;
        do{
            System.out.println("\n=== MENU ===");

            System.out.println("1. Agregar actividad");
            System.out.println("2. Mostrar actividades");
            System.out.println("3. Salir");

            System.out.print("\n|> Ingrese una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1:
                    ManejoArchivos.Escribir(sc);
                    break;
                case 2:
                    System.out.println("\n=== ACTIVIDADES REGISTRADAS ===\n");
                    ManejoArchivos.Mostrar();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
                    break;
            }

        }while(opcion != 3);
    }
}