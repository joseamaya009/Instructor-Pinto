public class Carro {
    private int id;
    private String tipo; // "Ambulancia" o "Funebre"

    public Carro(int id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }
}