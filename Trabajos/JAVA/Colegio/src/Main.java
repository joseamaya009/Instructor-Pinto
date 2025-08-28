import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {

        System.out.println("Ingrese el nombre del colegio: ");
        teclado.nextLine();

        System.out.println("¿Cuántos salones va a tener el colegio? ");
        int salones = teclado.nextInt();

        int[] grados = {1,2,3,4,5,6,7,8,9,10,11};
        int[] salonesGrados = new int[grados.length];
        int sumaSalones = 0;
        for (int i = 0; i < grados.length; i++) {
            System.out.println("¿Cuántos salones de grado " + grados[i] + "°? ");
            int cantidad = teclado.nextInt();
            salonesGrados[i] = cantidad;
            sumaSalones += cantidad;
        }

        if (sumaSalones != salones) {
            System.out.println("La suma de salones por grado no coincide con el total de salones. Saliendo...");
            return;
        }

        int totalEstudiantes = salones * 25;
        System.out.println("Total de estudiantes a matricular: " + totalEstudiantes);

        // Nombres y apellidos para generar aleatoriamente
        String[] nombres = {"Juan", "Ana", "Luis", "Sofía", "Carlos", "María", "Pedro", "Lucía", "Miguel", "Valentina"};
        String[] apellidos = {"Pérez", "Gómez", "Rodríguez", "López", "Martínez", "García", "Sánchez", "Ramírez", "Torres", "Castro"};
        Random random = new Random();

        Estudiante[][][] estudiantes = new Estudiante[grados.length][][];
        for (int i = 0; i < grados.length; i++) {
            estudiantes[i] = new Estudiante[salonesGrados[i]][25];
            for (int j = 0; j < salonesGrados[i]; j++) {
                for (int k = 0; k < 25; k++) {
                    String nombreCompleto = nombres[random.nextInt(nombres.length)] + " " +
                                           apellidos[random.nextInt(apellidos.length)];
                    estudiantes[i][j][k] = new Estudiante(nombreCompleto);
                }
            }
        }

        System.out.println("\nReporte de salones por grado:");
        for (int i = 0; i < grados.length; i++) {
            System.out.println("Grado " + grados[i] + "°: " + salonesGrados[i] + " salones");
        }

        System.out.println("\n¿De qué grado desea enlistar los estudiantes? (1-11): ");
        int gradoConsulta = teclado.nextInt();
        int indice = -1;
        for (int i = 0; i < grados.length; i++) {
            if (grados[i] == gradoConsulta) {
                indice = i;
                break;
            }
        }
        if (indice != -1) {
            System.out.println("\nEstudiantes de grado " + gradoConsulta + "°:");
            for (int j = 0; j < salonesGrados[indice]; j++) {
                for (int k = 0; k < 25; k++) {
                    System.out.println(estudiantes[indice][j][k].nombre + " - Salón " + (j + 1));
                }
            }
        } else {
            System.out.println("Grado no válido.");
        }
        }
    }
}