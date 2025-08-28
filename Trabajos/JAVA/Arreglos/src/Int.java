import java.util.Arrays;
import java.util.Scanner;

public class Int {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int[] arreglo = new int[10];
        
        for (int x = 0; x < 10; x++) {
            System.out.println("Digite el valor " +(x + 1));
            arreglo[x] = teclado.nextInt();
        }

        Arrays.sort(arreglo);
        for (int i = 0; i < 10; i++) {
            System.out.print(arreglo[i]);
        }
        teclado.close();
    }
}