
import java.util.*;

public class Main{
    static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        menu(sc);
    }

    public static void menu(Scanner sc){
        int opcion = 0;

        do{
            System.out.println("========================");
            System.out.println("      CALCULADORA");
            System.out.println("========================");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");

            try{
                System.out.print("\n|> Elija una opcion: ");
                opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion) {
                    case 1:
                        Calculadora.sumar(sc);
                        break;
                    case 2:
                        Calculadora.restar(sc);
                        break;
                    case 3:
                        Calculadora.multiplicar(sc);
                        break;
                    case 4:
                        Calculadora.dividir(sc);
                        break;
                    case 5:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opcion invalida.");
                        break;
                }
            }
            catch(InputMismatchException e){
                System.out.println("Error: Debe ingresar un número entero.");
                sc.nextLine();
                opcion = 0;
            }
            
        }while(opcion != 5);
    }
}