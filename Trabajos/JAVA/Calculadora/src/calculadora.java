import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Qué operación quieres realizar?");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("Ingresa el número de la operación a realizar: ");
        int opcion = teclado.nextInt();

        System.out.println("Ingresa el primer número: ");
        double num1 = teclado.nextDouble();

        System.out.println("Ingresa el segundo número: ");
        double num2 = teclado.nextDouble();

        switch (opcion) {
            case 1:
                System.out.println("El resultado de la suma es: " + (num1 + num2));
                break;

            case 2:
                System.out.println("El resultado de la resta es: " + (num1 - num2));
                break;

            case 3:
                System.out.println("El resultado de la multiplicación es: " + (num1 * num2));
                break;

            case 4:
                if (num2 != 0) {
                    System.out.println("El resultado de la división es: " + (num1 / num2));
                } else {
                    System.out.println("Error: No se puede dividir entre 0.");
                }
                break;

            default:
                System.out.println("Opción no válida.");
                break;
        }

        teclado.close();
    }
}