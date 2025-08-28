import java.util.Scanner;

public class Calculadora {
    public static double a, b, resultado;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] arreglo = new double[10];

        System.out.println("Ingresa 10 números:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Número " + (i + 1));
            arreglo[i] = teclado.nextDouble();
        }

        boolean bandera = true;

        do {
            System.out.println("Selecciona la operación que deseas realizar:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            System.out.print("Ingresa el número de la operación que quieres hacer: ");
            int opcion = teclado.nextInt();

            if (opcion == 5) {
                bandera = false;
                System.out.println("Gracias por usar la calculadora. ¡Hasta luego!");
                break;
            }

            System.out.println("\nSelecciona dos números del arreglo para realizar la operación:");
            for (int i = 0; i < arreglo.length; i++) {
                System.out.println((i + 1) + arreglo[i]);
            }

            System.out.print("Ingresa el número correspondiente al primer valor: ");
            int indice1 = teclado.nextInt() - 1;

            System.out.print("Ingresa el número correspondiente al segundo valor: ");
            int indice2 = teclado.nextInt() - 1;

            if (indice1 < 0 || indice1 >= 10 || indice2 < 0 || indice2 >= arreglo.length) {
                System.out.println("Índices no válidos. Intenta de nuevo.");
                continue;
            }

            a = arreglo[indice1];
            b = arreglo[indice2];

            switch (opcion) {
                case 1:
                    suma();
                    break;
                case 2:
                    resta();
                    break;
                case 3:
                    multiplicacion();
                    break;
                case 4:
                    division();
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }

            System.out.println();
        } while (bandera);

        teclado.close();
    }

    public static void suma() {
        resultado = a + b;
        System.out.println("El resultado de la suma es: " + resultado);
    }

    public static void resta() {
        resultado = a - b;
        System.out.println("El resultado de la resta es: " + resultado);
    }

    public static void multiplicacion() {
        resultado = a * b;
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }

    public static void division() {
        if (b != 0) {
            resultado = a / b;
            System.out.println("El resultado de la división es: " + resultado);
        } else {
            System.out.println("Error: No se puede dividir entre 0.");
        }
    }
}