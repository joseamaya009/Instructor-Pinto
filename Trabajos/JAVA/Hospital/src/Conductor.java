public class Conductor {
    private String nombre;
    private String apellido;
    private String celular;
    private Carro ambulancia;
    private int pacientesRecogidos = 0;
    private int kmRecorridos = 0;
    private String clinicasVisitadas = "";
    private boolean esFunebre = false;

    public Conductor(String nombre, String apellido, String celular) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    public void asignarAmbulancia(Carro carro) {
        this.ambulancia = carro;
    }

    public Carro getAmbulancia() {
        return ambulancia;
    }

    public void sumarPacientes(int cantidad) {
        this.pacientesRecogidos += cantidad;
    }

    public void sumarKm(int km) {
        this.kmRecorridos += km;
    }

    public int getPacientesRecogidos() {
        return pacientesRecogidos;
    }

    public int getKmRecorridos() {
        return kmRecorridos;
    }

    public void agregarClinica(String clinica) {
        if (!clinicasVisitadas.contains(clinica)) {
            if (!clinicasVisitadas.isEmpty()) clinicasVisitadas += ", ";
            clinicasVisitadas += clinica;
        }
    }

    public String getClinicasVisitadas() {
        return clinicasVisitadas;
    }

    public void setFunebre(boolean esFunebre) {
        this.esFunebre = esFunebre;
    }

    public boolean esFunebre() {
        return esFunebre;
    }

    public String getCelular() {
        return celular;
    }
}