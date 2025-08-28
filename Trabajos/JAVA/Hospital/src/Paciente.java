public class Paciente {
    private int id;
    private String nombre;
    private boolean recogido = false;

    public Paciente(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public boolean isRecogido() {
        return recogido;
    }

    public void setRecogido(boolean recogido) {
        this.recogido = recogido;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }
}