public class Funeraria {
    private int id;
    private String nombre;
    private int distancia;

    public Funeraria(int id, String nombre, int distancia) {
        this.id = id;
        this.nombre = nombre;
        this.distancia = distancia;
    }

    public int getDistancia() {
        return distancia;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }
}