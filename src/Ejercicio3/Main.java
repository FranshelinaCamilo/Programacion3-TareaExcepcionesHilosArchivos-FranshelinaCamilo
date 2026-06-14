import java.util.*;
public class Main {
    static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        SistemaPersona persona = new SistemaPersona();

        System.out.println("==================================");
        System.out.println("       VERIFICADOR DE EDAD");
        System.out.println("==================================");
        persona.verificarEdad(sc);
    }
}
