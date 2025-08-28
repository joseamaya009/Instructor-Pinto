import java.util.ArrayList;
import java.util.List;

public class Salon {
int grado;
int numeroSalon;
List<Estudiante> estudiantes = new ArrayList<>();

public Salon(int grado, int numeroSalon) {
    this.grado = grado;
    this.numeroSalon = numeroSalon;
}

public int getNumeroSalon() {
    return numeroSalon;
}

public List<Estudiante> getEstudiantes() {
    return estudiantes;
}

public int getGrado() {
    return grado;
}
}