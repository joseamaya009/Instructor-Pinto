import java.util.*;

public class Banco {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            String nombreBanco;
            // Nombre del banco
            System.out.println("Ingrese el nombre del banco: ");
            nombreBanco = teclado.nextLine();

            // Ciudades y sucursales por ciudad
            System.out.println("Cantidad de ciudades a registrar: ");
            int numCiudades = teclado.nextInt();
            teclado.nextLine();
            List<Ciudades> ciudades = new ArrayList<>();
            Random random = new Random();

            for (int i = 0; i < numCiudades; i++) {
                System.out.println("Nombre de la ciudad " + (i + 1) + ": ");
                String nombreCiudad = teclado.nextLine();
                int sucursalesEnCiudad = 1 + random.nextInt(10);
                ciudades.add(new Ciudades(nombreCiudad, sucursalesEnCiudad));
            }

            // Productos predefinidos
            String[] productosDisponibles = {
                "Cuenta de ahorros",
                "Cuenta corriente",
                "CDT",
                "Tarjeta de crédito",
                "Préstamo de libranza",
                "Préstamo libre inversión",
                "Préstamo hipotecario"
            };

            // Sucursales
            System.out.print("¿Cuántas sucursales tiene el banco? ");
            int numSucursales = teclado.nextInt();
            teclado.nextLine();
            List<Sucursales> sucursales = new ArrayList<>();
            for (int i = 0; i < numSucursales; i++) {
                System.out.print("Nombre de la sucursal #" + (i + 1) + ": ");
                String nombreSucursal = teclado.nextLine();

                System.out.print("¿Cuántos trabajadores tiene la sucursal? ");
                int numTrabajadores = teclado.nextInt();
                teclado.nextLine();
                List<Trabajadores> trabajadores = new ArrayList<>();
                for (int j = 0; j < numTrabajadores; j++) {
                    System.out.print("Nombre del trabajador #" + (j + 1) + ": ");
                    trabajadores.add(new Trabajadores(teclado.nextLine()));
                }

                System.out.print("¿Cuántos productos tendrá la sucursal? ");
                int numProductos = teclado.nextInt();
                teclado.nextLine();
                List<Productos> productos = new ArrayList<>();
                List<Integer> indicesUsados = new ArrayList<>();
                for (int j = 0; j < numProductos; j++) {
                    int idx;
                    // Evitar repetir productos si hay menos productos que los disponibles
                    do {
                        idx = random.nextInt(productosDisponibles.length);
                    } while (indicesUsados.contains(idx) && indicesUsados.size() < productosDisponibles.length);
                    indicesUsados.add(idx);
                    productos.add(new Productos(productosDisponibles[idx]));
                }

                sucursales.add(new Sucursales(nombreSucursal, trabajadores, productos));
            }

            // Campañas
            List<Campañas> campanas = new ArrayList<>();
            campanas.add(new Campañas("Menos intereses en compras de carteras"));
            while (true) {
                System.out.print("¿Desea crear una nueva campaña? (s/n): ");
                String resp = teclado.nextLine();
                if (resp.equalsIgnoreCase("s")) {
                    System.out.print("Nombre de la nueva campaña: ");
                    campanas.add(new Campañas(teclado.nextLine()));
                } else {
                    break;
                }
            }

            // Clientes
            System.out.print("¿Cuántos clientes desea registrar? ");
            int numClientes = teclado.nextInt();
            teclado.nextLine();
            List<Clientes> clientes = new ArrayList<>();
            for (int i = 0; i < numClientes; i++) {
                System.out.print("Nombre del cliente #" + (i + 1) + ": ");
                String nombreCliente = teclado.nextLine();

                System.out.print("¿Cuántos productos tiene este cliente? ");
                int numProdCliente = teclado.nextInt();
                teclado.nextLine();
                List<Productos> prodCliente = new ArrayList<>();
                for (int j = 0; j < numProdCliente; j++) {
                    // Asignar productos aleatorios al cliente
                    int idx = random.nextInt(productosDisponibles.length);
                    prodCliente.add(new Productos(productosDisponibles[idx]));
                }

                System.out.print("¿Se dejó convencer por alguna campaña? (s/n): ");
                boolean convencido = teclado.nextLine().equalsIgnoreCase("s");
                clientes.add(new Clientes(nombreCliente, prodCliente, convencido));
            }

            // Listados
            System.out.println("\n--- Campañas activas ---");
            for (Campañas c : campanas) System.out.println("- " + c.nombre);

            System.out.println("\n--- Total de sucursales: " + sucursales.size() + " ---");

            System.out.println("\n--- Productos por sucursal ---");
            for (Sucursales s : sucursales) {
                System.out.println("Sucursal: " + s.nombre);
                for (Productos p : s.productos) System.out.println("  - " + p.nombre);
            }

            System.out.println("\n--- Productos generales del banco ---");
            Set<String> productosBanco = new HashSet<>();
            for (Sucursales s : sucursales)
                for (Productos p : s.productos)
                    productosBanco.add(p.nombre);
            for (String prod : productosBanco) System.out.println("- " + prod);

            System.out.println("\n--- Clientes y campañas ---");
            for (Clientes cl : clientes) {
                System.out.println("Cliente: " + cl.nombre);
                System.out.print("Productos: ");
                for (Productos p : cl.productos) System.out.print(p.nombre + ", ");
                System.out.println("\n¿Convencido por campaña?: " + (cl.convencido ? "Sí" : "No"));
            }

            System.out.println("\n--- Ciudades y cantidad de sucursales ---");
            for (Ciudades c : ciudades)
                System.out.println(c.nombre + ": " + c.cantidadSucursales + " sucursales");

            // Mostrar el nombre del banco
            System.out.println("\nNombre del banco: " + nombreBanco);
        }
    }
}

// Clase Campañas fuera del main para evitar problemas de alcance
class Campañas {
    String nombre;
    public Campañas(String nombre) {
        this.nombre = nombre;
    }
}