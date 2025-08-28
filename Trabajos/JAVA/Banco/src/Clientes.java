import java.util.List;

public class Clientes {
    String nombre;
    List<Productos> productos;
    boolean convencido;

    public Clientes(String nombre, List<Productos> productos, boolean convencido) {
        this.nombre = nombre;
        this.productos = productos;
        this.convencido = convencido;
    }
}