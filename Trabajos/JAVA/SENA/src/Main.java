import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1. Registrar ubicación");
            System.out.println("2. Definir ambientes");
            System.out.println("3. Asignar ambientes a líneas");
            System.out.println("4. Registrar aprendices");
            System.out.println("5. Registrar instructores");
            System.out.println("6. Asignar horarios");
            System.out.println("7. Definir coordinador y asignar instructores");
            System.out.println("8. Reportes");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            while (!sc.hasNextInt()) {
                System.out.print("Ingrese un número válido: ");
                sc.next();
            }
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1: Ubicacion.registrarUbicacion(sc); break;
                case 2: Ambiente.definirAmbientes(sc); break;
                case 3: Asignacion.asignarAmbienteLinea(sc); break;
                case 4: Aprendiz.registrarAprendiz(sc); break;
                case 5: Instructor.registrarInstructor(sc); break;
                case 6: Horario.asignarHorarios(); break;
                case 7: Coordinador.definirCoordinador(sc); break;
                case 8: Reporte.mostrarReportes(sc); break;
                case 0: System.out.println("Saliendo..."); break;
                default: System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
        sc.close();
    }
}