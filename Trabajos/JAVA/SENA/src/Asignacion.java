import java.util.Scanner;

public class Asignacion {
    static int[][] ambienteLinea = new int[10][10]; // [ambiente][línea]

    public static void asignarAmbienteLinea(Scanner sc) {
        if (Ambiente.ambCount == 0) {
            System.out.println("Primero registre ambientes.");
            return;
        }
        System.out.println("Ambientes disponibles:");
        for (int i = 0; i < Ambiente.ambCount; i++)
            System.out.println(i + ". " + Ambiente.ambientes[i]);
        System.out.print("Seleccione ambiente: ");
        int amb = sc.nextInt();
        sc.nextLine();
        System.out.println("Líneas disponibles:");
        for (int i = 0; i < Ambiente.lineas.length; i++)
            System.out.println(i + ". " + Ambiente.lineas[i]);
        System.out.print("Seleccione línea: ");
        int lin = sc.nextInt();
        sc.nextLine();
        ambienteLinea[amb][lin] = 1;
        System.out.println("Ambiente asignado a línea.");
    }
}