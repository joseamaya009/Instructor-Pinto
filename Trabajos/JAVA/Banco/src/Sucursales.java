import java.util.List;

public class Sucursales {
    String nombre;
    List<Trabajadores> trabajadores;
    List<Productos> productos;

    public Sucursales(String nombre, List<Trabajadores> trabajadores, List<Productos> productos) {
        this.nombre = nombre;
        this.trabajadores = trabajadores;
        this.productos = productos;
    }
}