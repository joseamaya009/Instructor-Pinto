import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int[][] matriz2 = new int[3][3];
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz2[i][j] = random.nextInt(5) + 1;
                System.out.println(matriz2[i][j]);
            }
        }

        System.out.println("\nMatriz original:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }

        int[][] matrizInversa = new int[3][3];
        int idx = 0;
        for (int i = 2; i >= 0; i--) {
            for (int j = 2; j >= 0; j--) {
                matrizInversa[idx / 3][idx % 3] = matriz2[i][j];
                idx++;
            }
        }

        System.out.println("\nMatriz inversa:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizInversa[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nDigite un número a buscar por suma: ");
        int objetivo = teclado.nextInt();

        System.out.println("\nCombinaciones que suman " + objetivo + ":");
        boolean encontrado = false;
        for (int mask = 1; mask < (1 << 9); mask++) {
            int suma = 0;
            int count = 0;
            StringBuilder combinacion = new StringBuilder();
            for (int k = 0; k < 9; k++) {
                if ((mask & (1 << k)) != 0) {
                    int fila = k / 3;
                    int col = k % 3;
                    suma += matrizInversa[fila][col];
                    combinacion.append(matrizInversa[fila][col]).append(" ");
                    count++;
                }
            }
            if (suma == objetivo && count > 1) {
                System.out.println(combinacion.toString());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron combinaciones.");
        }
        teclado.close();
    }
}