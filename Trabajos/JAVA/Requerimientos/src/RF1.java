import java.util.*;

public class RF1 {
    static Set<String> isbnRegistrados = new HashSet<>();

    public static void ejecutar() {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Ingrese el ISBN del libro: ");
            String isbn = sc.nextLine();

            if (isbnRegistrados.contains(isbn)) {
                System.out.println("Error: ISBN ya registrado.");
                return;
            }

            System.out.print("Ingrese el título: ");
            String titulo = sc.nextLine();
            System.out.print("Ingrese el autor: ");
            String autor = sc.nextLine();
            System.out.print("Ingrese el género: ");
            String genero = sc.nextLine();
            System.out.print("Ingrese la fecha de publicación (YYYY-MM-DD): ");
            String fecha = sc.nextLine();

            if (isbn.isEmpty() || titulo.isEmpty() || autor.isEmpty() || genero.isEmpty() || fecha.isEmpty()) {
                System.out.println("Error: Valores incorrectos.");
                return;
            }

            isbnRegistrados.add(isbn);
            System.out.println("El libro se registró correctamente.");
        }
    }
}
