import java.util.Random;
import java.util.Scanner;

public class Corregido {

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int[][] matrizInvertida = new int[3][3];
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int suma=0;

        System.out.println("Matriz generada:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = random.nextInt(5) + 1;
                System.out.print(matriz[i][j] + " ");
                suma += matriz[i][j]; 
            }
            System.out.println();
        }

        int fila = 0;
        int col = 0;
        for (int i = 2; i >= 0; i--) {
            for (int j = 2; j >= 0; j--) {
                matrizInvertida[fila][col] = matriz[i][j];
                col++;
                if (col == 3) {
                    col = 0;
                    fila++;
                }
            }
        }

        System.out.println("\nMatriz invertida:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizInvertida[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nSuma de todos los elementos de la matriz: " + suma);

        System.out.println("\nDigite un número para buscar combinaciones que sumadas den ese valor: ");
        int objetivo = sc.nextInt();

        System.out.println("\nCombinaciones encontradas:");
        boolean hayResultados = false;
        int[] elementos = new int[9];
        int index = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                elementos[index++] = matrizInvertida[i][j];
            }
        }

        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                int suma2 = elementos[i] + elementos[j];
                if (suma2 == objetivo) {
                    System.out.println(elementos[i] + " + " + elementos[j]);
                    hayResultados = true;
                }
                for (int k = j + 1; k < 9; k++) {
                    int suma3 = elementos[i] + elementos[j] + elementos[k];
                    if (suma3 == objetivo) {
                        System.out.println(elementos[i] + " + " + elementos[j] + " + " + elementos[k]);
                        hayResultados = true;
                    }
                    for (int l = k + 1; l < 9; l++) {
                        int suma4 = elementos[i] + elementos[j] + elementos[k] + elementos[l];
                        if (suma4 == objetivo) {
                            System.out.println(elementos[i] + " + " + elementos[j] + " + " + elementos[k] + " + " + elementos[l]);
                            hayResultados = true;
                        }
                    }
                }
            }
        }

        if (!hayResultados) {
            System.out.println("No se encontraron combinaciones.");
        }

        sc.close();
    }
}