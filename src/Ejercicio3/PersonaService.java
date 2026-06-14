public class PersonaService {
    public static void validarEdad(int edad) throws EdadInvalidaException{
        if(edad < 18){
            throw new EdadInvalidaException("\nError: Debe ser mayor de edad.");
        }
    }
}
