public class Clinica {
    private int id;
    private String nombre;
    private int distancia;

    public Clinica(int id, String nombre, int distancia) {
        this.id = id;
        this.nombre = nombre;
        this.distancia = distancia;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDistancia() {
        return distancia;
    }
}