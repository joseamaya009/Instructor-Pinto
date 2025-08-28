import java.util.Arrays;
import java.util.Scanner;

public class Nombres {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String[] arreglo = new String[10];
        
        for (int x = 0; x < 10; x++) {
            System.out.println("Escriba el nombre " + (x + 1));
            arreglo[x] = teclado.nextLine();
        }

        Arrays.sort(arreglo);
        for (int i = 0; i < 10; i++) {
            System.out.print(arreglo[i]);
        }
        teclado.close();
    }
}