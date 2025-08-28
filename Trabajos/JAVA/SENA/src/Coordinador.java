import java.util.Scanner;
import java.util.Arrays;

public class Coordinador {
    static String coordinador = "";
    static int[] coordInstructores = new int[10]; // 1 si asignado, 0 si no

    public static void definirCoordinador(Scanner sc) {
        System.out.print("Nombre del coordinador: ");
        coordinador = sc.nextLine();
        System.out.println("Asigne instructores al coordinador (ingrese índices separados por espacio, -1 para terminar):");
        for (int i = 0; i < Instructor.insCount; i++)
            System.out.println(i + ". " + Instructor.instructores[i]);
        Arrays.fill(coordInstructores, 0);
        while (true) {
            int idx = sc.nextInt();
            if (idx == -1) break;
            if (idx >= 0 && idx < Instructor.insCount) coordInstructores[idx] = 1;
        }
        sc.nextLine();
        System.out.println("Coordinador e instructores asignados.");
    }
}