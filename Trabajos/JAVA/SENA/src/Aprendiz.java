import java.util.Scanner;

public class Aprendiz {
    static String[] aprendices = new String[20];
    static int[] aprendizLinea = new int[20];
    static int[] aprendizAmbiente = new int[20];
    static int aprCount = 0;

    public static void registrarAprendiz(Scanner sc) {
        if (aprCount < aprendices.length) {
            System.out.print("Nombre del aprendiz: ");
            aprendices[aprCount] = sc.nextLine();
            System.out.println("Líneas disponibles:");
            for (int i = 0; i < Ambiente.lineas.length; i++)
                System.out.println(i + ". " + Ambiente.lineas[i]);
            System.out.print("Seleccione línea: ");
            aprendizLinea[aprCount] = sc.nextInt();
            sc.nextLine();
            System.out.println("Ambientes disponibles:");
            for (int i = 0; i < Ambiente.ambCount; i++)
                System.out.println(i + ". " + Ambiente.ambientes[i]);
            System.out.print("Seleccione ambiente: ");
            aprendizAmbiente[aprCount] = sc.nextInt();
            sc.nextLine();
            aprCount++;
            System.out.println("Aprendiz registrado.");
        } else {
            System.out.println("Límite de aprendices alcanzado.");
        }
    }
}