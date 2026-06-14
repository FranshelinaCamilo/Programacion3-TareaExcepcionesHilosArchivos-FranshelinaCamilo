import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

    public static void sumar(Scanner sc){
        try{
            System.out.print("|> Ingrese el primer numero: ");
            int n1 = sc.nextInt();

            System.out.print("|> Ingrese el segundo numero: ");
            int n2 = sc.nextInt();
            
            System.out.println("\nEl resultado es: " + (n1 + n2));
        }
        catch(InputMismatchException e){
            System.out.println("\nError: Debe ingresar un número entero.");
            sc.nextLine();
        }
        finally{
            System.out.println("Proceso finalizado.");
        }
    }
    
    public static void restar(Scanner sc){
        try{
            System.out.print("|> Ingrese el primer numero: ");
            int n1 = sc.nextInt();

            System.out.print("|> Ingrese el segundo numero: ");
            int n2 = sc.nextInt();
            
            System.out.println("\nEl resultado es: " + (n1 - n2));
        }
        catch(InputMismatchException e){
            System.out.println("\nError: Debe ingresar un número entero.");
            sc.nextLine();
        }
        finally{
            System.out.println("Proceso finalizado.");
        }
    }

    public static void multiplicar(Scanner sc){
        try{
            System.out.print("|> Ingrese el primer numero: ");
            int n1 = sc.nextInt();

            System.out.print("|> Ingrese el segundo numero: ");
            int n2 = sc.nextInt();

            System.out.println("\nEl resultado es: " + (n1 * n2));
        }
        catch(InputMismatchException e){
            System.out.println("\nError: Debe ingresar un número entero.");
            sc.nextLine();
        }
        finally{
            System.out.println("Proceso finalizado.");
        }
    }

    public static void dividir(Scanner sc){
        try{
            System.out.print("|> Ingrese el primer numero: ");
            int n1 = sc.nextInt();

            System.out.print("|> Ingrese el segundo numero: ");
            int n2 = sc.nextInt();

            if(n2 == 0){
                throw new ArithmeticException();
            }
            System.out.println("\nEl resultado es: " + ((double)n1 / n2));
        }
        catch(ArithmeticException e){
            System.out.println("\nError: No se puede dividir entre cero.");
        }
        catch(InputMismatchException e){
            System.out.println("\nError: Debe ingresar un número entero.");
            sc.nextLine();
        }
        finally{
            System.out.println("Proceso finalizado.");
        }
    }
}
