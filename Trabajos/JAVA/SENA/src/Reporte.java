import java.util.Scanner;

public class Reporte {
    public static void mostrarReportes(Scanner sc) {
        System.out.println("\n--- Reportes ---");
        System.out.println("1. Instructores por línea");
        System.out.println("2. Aprendices por línea");
        System.out.println("3. Ambientes por especialidad");
        System.out.println("4. Horarios de instructores");
        System.out.println("5. Horarios de aprendices");
        System.out.println("0. Volver");
        System.out.print("Seleccione: ");
        int op = sc.nextInt();
        sc.nextLine();
        switch (op) {
            case 1:
                for (int l = 0; l < Ambiente.lineas.length; l++) {
                    System.out.println("Línea: " + Ambiente.lineas[l]);
                    for (int i = 0; i < Instructor.insCount; i++)
                        if (Instructor.instructorLinea[i] == l)
                            System.out.println(" - " + Instructor.instructores[i]);
                }
                break;
            case 2:
                for (int l = 0; l < Ambiente.lineas.length; l++) {
                    System.out.println("Línea: " + Ambiente.lineas[l]);
                    for (int i = 0; i < Aprendiz.aprCount; i++)
                        if (Aprendiz.aprendizLinea[i] == l)
                            System.out.println(" - " + Aprendiz.aprendices[i]);
                }
                break;
            case 3:
                System.out.println("Ambientes especializados:");
                for (int i = 0; i < Ambiente.ambCount; i++)
                    if (Ambiente.especializado[i])
                        System.out.println(" - " + Ambiente.ambientes[i]);
                System.out.println("Ambientes no especializados:");
                for (int i = 0; i < Ambiente.ambCount; i++)
                    if (!Ambiente.especializado[i])
                        System.out.println(" - " + Ambiente.ambientes[i]);
                break;
            case 4:
                String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};
                for (int i = 0; i < Instructor.insCount; i++) {
                    System.out.println("Instructor: " + Instructor.instructores[i]);
                    for (int j = 0; j < dias.length; j++)
                        System.out.println("  " + dias[j] + ": " + Horario.horariosInstructores[i][j]);
                }
                break;
            case 5:
                String[] diasA = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};
                for (int i = 0; i < Aprendiz.aprCount; i++) {
                    System.out.println("Aprendiz: " + Aprendiz.aprendices[i]);
                    for (int j = 0; j < diasA.length; j++)
                        System.out.println("  " + diasA[j] + ": " + Horario.horariosAprendices[i][j]);
                }
                break;
            case 0:
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }
}