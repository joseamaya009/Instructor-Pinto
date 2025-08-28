import java.util.*;

public class Main {
    public static ArrayList<Carro> carros = new ArrayList<>();
    public static ArrayList<Conductor> conductores = new ArrayList<>();
    public static ArrayList<Paciente> pacientes = new ArrayList<>();
    public static ArrayList<Clinica> clinicas = new ArrayList<>();
    public static Funeraria funeraria;
    public static Scanner teclado = new Scanner(System.in);
    public static Conductor conductorFunebre = null;
    public static Carro carroFunebre = new Carro(11, "Funebre");
    public static int pacientesNoRecogidos = 0;

    public static void main(String[] args) {
        inicializarDatos();
        mostrarMenu();
        teclado.close();
    }

    public static void inicializarDatos() {
        for (int i = 1; i <= 10; i++) {
            carros.add(new Carro(i, "Ambulancia"));
        }
        System.out.println("Ingrese los datos de los conductores:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Conductor " + i + ":");
            System.out.println("Nombres: ");
            String nombre = teclado.nextLine();
            System.out.println("Apellidos: ");
            String apellido = teclado.nextLine();
            System.out.println("Celular: ");
            String celular = teclado.nextLine();
            conductores.add(new Conductor(nombre, apellido, celular));
        }
        for (int i = 1; i <= 100; i++) {
            pacientes.add(new Paciente(i, "Paciente" + i));
        }
        clinicas.add(new Clinica(1, "Clinica 1", 55));
        clinicas.add(new Clinica(2, "Clinica 2", 35));
        clinicas.add(new Clinica(3, "Clinica 3", 45));
        funeraria = new Funeraria(1, "Funeraria", 15);
    }

    public static void mostrarMenu() {
        int opcion = 0;
        boolean conductoresAsignados = false;
        boolean pacientesRecogidos = false;
        boolean funebreAsignado = false;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Asignar conductores a ambulancias");
            System.out.println("2. Recoger pacientes");
            System.out.println("3. Reasignar conductor para carro fúnebre");
            System.out.println("4. Generar reporte");
            System.out.println("5. Salir");
            System.out.println("Seleccione una opción: ");

            if (teclado.hasNextInt()) {
                opcion = teclado.nextInt();
                teclado.nextLine();
            } else {
                System.out.println("Error, por favor ingrese un número.");
                teclado.nextLine();
                continue;
            }

            switch (opcion) {
                case 1:
                    if (!conductoresAsignados) {
                        asignarConductores();
                        conductoresAsignados = true;
                    } else {
                        System.out.println("Cada ambulancia ya tiene su conductor asignado.");
                    }
                    break;
                case 2:
                    if (conductoresAsignados && !pacientesRecogidos) {
                        recogerPacientes();
                        pacientesRecogidos = true;
                    } else if (!conductoresAsignados) {
                        System.out.println("Primero se deben asignar los conductores.");
                    } else {
                        System.out.println("Pacientes recogidos.");
                    }
                    break;
                case 3:
                    if (conductoresAsignados && !funebreAsignado) {
                        reasignarConductor();
                        funebreAsignado = true;
                    } else if (!conductoresAsignados) {
                        System.out.println("Primero se deben asignar los conductores.");
                    } else {
                        System.out.println("Conductor de carro fúnebre reasignado.");
                    }
                    break;
                case 4:
                    generarReporte();
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Error, intente nuevamente.");
            }
        } while (opcion != 5);
    }

    public static void asignarConductores() {
        for (int i = 0; i < conductores.size(); i++) {
            conductores.get(i).asignarAmbulancia(carros.get(i));
            System.out.println("Conductor: " + conductores.get(i).getNombreCompleto() +
                    " - Ambulancia " + carros.get(i).getId());
        }
    }

    public static void recogerPacientes() {
        int pacienteIndex = 0;
        for (Conductor conductor : conductores) {
            int km = 0;
            int recogidos = 0;
            while (recogidos < 8 && km < 400 && pacienteIndex < pacientes.size()) {
                Paciente paciente = pacientes.get(pacienteIndex);
                if (!paciente.isRecogido()) {
                    // Selecciona clínica aleatoria
                    Clinica clinica = clinicas.get(new Random().nextInt(clinicas.size()));
                    int viaje = clinica.getDistancia() * 2; // ida y vuelta
                    if (km + viaje > 400) break;
                    km += viaje;
                    recogidos++;
                    paciente.setRecogido(true);
                    conductor.sumarPacientes(1);
                    conductor.sumarKm(viaje);
                    conductor.agregarClinica(clinica.getNombre());
                }
                pacienteIndex++;
            }
        }
        // Contar pacientes no recogidos
        pacientesNoRecogidos = 0;
        for (Paciente p : pacientes) {
            if (!p.isRecogido()) pacientesNoRecogidos++;
        }
        System.out.println("Algunos pacientes fueron reogidos satisfactoriamente.");
        System.out.println("Pacientes no recogidos: " + pacientesNoRecogidos);
    }

    public static void reasignarConductor() {
        Random rand = new Random();
        int idx = rand.nextInt(conductores.size());
        conductorFunebre = conductores.get(idx);
        Carro ambulanciaLiberada = conductorFunebre.getAmbulancia();
        conductorFunebre.asignarAmbulancia(carroFunebre);
        conductorFunebre.setFunebre(true);
        System.out.println("Conductor: " + conductorFunebre.getNombreCompleto() + " ahora conduce el carro fúnebre.");
        System.out.println("La ambulancia " + ambulanciaLiberada.getId() + " quedó libre.");
    }

    public static void generarReporte() {
        System.out.println("\nReporte:");
        for (Conductor c : conductores) {
            System.out.println("Conductor: " + c.getNombreCompleto());
            System.out.println("Celular: " + c.getCelular());
            System.out.println("Vehículo: " + (c.esFunebre() ? "Funebre" : "Ambulancia #" + (c.getAmbulancia() != null ? c.getAmbulancia().getId() : "N/A")));
            System.out.println("Pacientes recogidos: " + c.getPacientesRecogidos());
            System.out.println("Clínicas visitadas: " + c.getClinicasVisitadas());
            System.out.println("Km recorridos: " + c.getKmRecorridos());
            System.out.println("   ");
        }
        System.out.println("Pacientes no recogidos: " + pacientesNoRecogidos);
    }
}