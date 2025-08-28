import java.util.Scanner;

public class Nombrecompleto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String[] primerNombre = new String[1];
        String[] segundoNombre = new String[1];
        String[] primerApellido = new String[1];
        String[] segundoApellido = new String[1];

        System.out.println("Primer nombre: ");
        primerNombre[0] = teclado.nextLine();

        System.out.println("Segundo nombre: ");
        segundoNombre[0] = teclado.nextLine();

        System.out.println("Primer apellido: ");
        primerApellido[0] = teclado.nextLine();

        System.out.println("Segundo apellido: ");
        segundoApellido[0] = teclado.nextLine();

        System.out.println("\nNombre completo: " + primerNombre[0] + " " + segundoNombre[0] + " " + primerApellido[0] + " " + segundoApellido[0]);

        teclado.close();
    }
}