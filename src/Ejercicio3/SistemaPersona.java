
import java.util.*;
public class SistemaPersona {
    public void verificarEdad(Scanner sc){
        try{
            System.out.print("|> Ingrese su nombre: ");
            String nombre = sc.nextLine();

            System.out.print("|> Ingrese su edad: ");
            int edad = sc.nextInt();
            sc.nextLine();

            PersonaService.validarEdad(edad);
        }
        catch(EdadInvalidaException e){
            System.out.println(e.getMessage());
        }
        catch(InputMismatchException e){
            System.out.println("\nError: Debe ingresar un número entero.");
        }
        finally{
            System.out.println("Proceso finalizado.");
        }
    }
}
