import java.util.Scanner;

public class instructor {
    public static double a, b, resultado;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
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

            System.out.print("Ingresa el valor del primer número: ");
            a = teclado.nextDouble();

            System.out.print("Ingresa el valor del segundo número: ");
            b = teclado.nextDouble();

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