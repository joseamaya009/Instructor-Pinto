import java.util.Scanner;

public class Ubicacion {
    static String[] regionales = new String[5];
    static String[] centros = new String[5];
    static String[] sedes = new String[5];
    static int ubicCount = 0;

    public static void registrarUbicacion(Scanner sc) {
        if (ubicCount < regionales.length) {
            System.out.print("Ingrese Regional: ");
            regionales[ubicCount] = sc.nextLine();
            System.out.print("Ingrese Centro: ");
            centros[ubicCount] = sc.nextLine();
            System.out.print("Ingrese Sede: ");
            sedes[ubicCount] = sc.nextLine();
            ubicCount++;
            System.out.println("Ubicación registrada.");
        } else {
            System.out.println("Límite de ubicaciones alcanzado.");
        }
    }
}