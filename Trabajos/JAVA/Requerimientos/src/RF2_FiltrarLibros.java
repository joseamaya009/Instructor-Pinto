import java.util.List;
import java.util.Scanner;
import your.package.name.Libro; // Replace 'your.package.name' with the actual package of the Libro class

class RF2_FiltrarLibros {
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("🔍 Ingrese título, autor o ISBN a buscar: ");
        String filtro = sc.nextLine().toLowerCase();

        List<Libro> libros = RF1.getLibros();
        boolean encontrado = false;

        for (Libro libro : libros) {
            if (libro.titulo.toLowerCase().contains(filtro) ||
                libro.autor.toLowerCase().contains(filtro) ||
                libro.isbn.toLowerCase().contains(filtro)) {
                System.out.println(libro);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró ningún libro con ese criterio.");
        }
    }
}