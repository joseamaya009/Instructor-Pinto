import java.util.Random;

public class Horario {
    static String[][] horariosInstructores = new String[10][5]; // [instructor][día]
    static String[][] horariosAprendices = new String[20][5]; // [aprendiz][día]

    public static void asignarHorarios() {
        Random rand = new Random();
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};
        for (int i = 0; i < Instructor.insCount; i++)
            for (int j = 0; j < dias.length; j++)
                horariosInstructores[i][j] = rand.nextBoolean() ? "Asignado" : "Libre";
        for (int i = 0; i < Aprendiz.aprCount; i++)
            for (int j = 0; j < dias.length; j++)
                horariosAprendices[i][j] = rand.nextBoolean() ? "Asignado" : "Libre";
        System.out.println("Horarios asignados aleatoriamente.");
    }
}