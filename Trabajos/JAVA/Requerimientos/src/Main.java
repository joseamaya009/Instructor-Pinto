import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== Menú Biblioteca =====");
            System.out.println("1. Registrar libro");
            System.out.println("2. Filtrar listado de libros");
            System.out.println("3. Registrar datos de los lectores");
            System.out.println("4. Filtrar lista lectores registrados");
            System.out.println("5. Registrar un préstamo de un libro");
            System.out.println("6. Listar préstamos");
            System.out.println("7. Devolver libro");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch(opcion) {
                case 1:
                    RF1.ejecutar();
                    break;
                case 2:
                    RF2_FiltrarLibros.ejecutar();
                    break;
                case 3:
                    RF3_RegistrarLector.ejecutar();
                    break;
                case 4:
                    RF4_FiltrarLectores.ejecutar();
                    break;
                case 5:
                    RF5_RegistrarPrestamo.ejecutar();
                    break;
                case 6:
                    RF6_ListarPrestamos.ejecutar();
                    break;
                case 7:
                    RF7_DevolverLibro.ejecutar();
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while(opcion != 0);

        sc.close();
    }
}