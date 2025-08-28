import java.util.Scanner;

public class Ambiente {
    static String[] ambientes = new String[10];
    static boolean[] especializado = new boolean[10];
    static int ambCount = 0;
    public static String[] lineas = {"Software", "Mecánica", "Electrónica", "Administración", "Salud", "Diseño", "Construcción", "Agro", "Idiomas", "Turismo"};

    public static void definirAmbientes(Scanner sc) {
        if (ambCount < ambientes.length) {
            System.out.print("Nombre del ambiente: ");
            ambientes[ambCount] = sc.nextLine();
            System.out.print("¿Es especializado? (s/n): ");
            especializado[ambCount] = sc.nextLine().equalsIgnoreCase("s");
            ambCount++;
            System.out.println("Ambiente registrado.");
        } else {
            System.out.println("Límite de ambientes alcanzado.");
        }
    }
}