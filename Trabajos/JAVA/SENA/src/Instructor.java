import java.util.Scanner;

public class Instructor {
    static String[] instructores = new String[10];
    static int[] instructorLinea = new int[10];
    static int[] instructorAmbiente = new int[10];
    static int insCount = 0;

    public static void registrarInstructor(Scanner sc) {
        if (insCount < instructores.length) {
            System.out.print("Nombre del instructor: ");
            instructores[insCount] = sc.nextLine();
            System.out.println("Líneas disponibles:");
            for (int i = 0; i < Ambiente.lineas.length; i++)
                System.out.println(i + ". " + Ambiente.lineas[i]);
            System.out.print("Seleccione línea: ");
            instructorLinea[insCount] = sc.nextInt();
            sc.nextLine();
            System.out.println("Ambientes disponibles:");
            for (int i = 0; i < Ambiente.ambCount; i++)
                System.out.println(i + ". " + Ambiente.ambientes[i]);
            System.out.print("Seleccione ambiente: ");
            instructorAmbiente[insCount] = sc.nextInt();
            sc.nextLine();
            insCount++;
            System.out.println("Instructor registrado.");
        } else {
            System.out.println("Límite de instructores alcanzado.");
        }
    }
}