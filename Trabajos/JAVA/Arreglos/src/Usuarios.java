import java.util.Scanner;

public class Usuarios {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String[] nombre = new String[4];
        String[] tipoIdentificacion = new String[4];
        String[] identificacion = new String[4];
        String[] rh = new String[4];
        String[] telefono = new String[4];
        String[] correo = new String[4];
        String[] direccion = new String[4];
        String[] cargo = new String[4];

        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese la información de la persona " + (i + 1));
            System.out.println("Nombre completo: ");
            nombre[i] = teclado.nextLine();
            System.out.println("Tipo de identificación: ");
            tipoIdentificacion[i] = teclado.nextLine();
            System.out.println("Número de identificación: ");
            identificacion[i] = teclado.nextLine();
            System.out.println("RH: ");
            rh[i] = teclado.nextLine();
            System.out.println("Teléfono: ");
            telefono[i] = teclado.nextLine();
            System.out.println("Correo electrónico: ");
            correo[i] = teclado.nextLine();
            System.out.println("Dirección de residencia: ");
            direccion[i] = teclado.nextLine();
            System.out.println("Cargo: ");
            cargo[i] = teclado.nextLine();
            System.out.println();
        }

        System.out.println("Número de la persona para ver su información:");
        int opcion = teclado.nextInt();

        switch (opcion) {
            case 1 -> imprimirInformacion(0, nombre, tipoIdentificacion, identificacion, rh, telefono, correo, direccion, cargo);
            case 2 -> imprimirInformacion(1, nombre, tipoIdentificacion, identificacion, rh, telefono, correo, direccion, cargo);
            case 3 -> imprimirInformacion(2, nombre, tipoIdentificacion, identificacion, rh, telefono, correo, direccion, cargo);
            case 4 -> imprimirInformacion(3, nombre, tipoIdentificacion, identificacion, rh, telefono, correo, direccion, cargo);
            default -> System.out.println("Opción no válida.");
        }

        teclado.close();
    }

    public static void imprimirInformacion(int indice, String[] nombre, String[] tipoIdentificacion, String[] identificacion, String[] rh, String[] telefono, String[] correo, String[] direccion, String[] cargo) {
        System.out.println("\nInformación de la persona seleccionada:");
        System.out.println("Nombre completo: " + nombre[indice]);
        System.out.println("Tipo de identificación: " + tipoIdentificacion[indice]);
        System.out.println("Número de identificación: " + identificacion[indice]);
        System.out.println("RH: " + rh[indice]);
        System.out.println("Teléfono: " + telefono[indice]);
        System.out.println("Correo electrónico: " + correo[indice]);
        System.out.println("Dirección de residencia: " + direccion[indice]);
        System.out.println("Cargo: " + cargo[indice]);
    }
}