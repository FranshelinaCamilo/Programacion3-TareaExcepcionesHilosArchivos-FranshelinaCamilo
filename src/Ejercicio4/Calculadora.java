import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

    public static void sumar(Scanner sc){
        try{
            System.out.print("|> Ingrese el primer numero: ");
            double n1 = sc.nextDouble();

            System.out.print("|> Ingrese el segundo numero: ");
            double n2 = sc.nextDouble();
            
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
            Double n1 = sc.nextDouble();

            System.out.print("|> Ingrese el segundo numero: ");
            Double n2 = sc.nextDouble();
            
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
            Double n1 = sc.nextDouble();

            System.out.print("|> Ingrese el segundo numero: ");
            Double n2 = sc.nextDouble();

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
            Double n1 = sc.nextDouble();

            System.out.print("|> Ingrese el segundo numero: ");
            Double n2 = sc.nextDouble();

            if(n2 == 0){
                throw new ArithmeticException();
            }
            System.out.println("\nEl resultado es: " + (n1 / n2));
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
