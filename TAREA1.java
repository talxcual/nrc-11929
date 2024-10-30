import java.util.Scanner;

public class TAREA1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array de nombres de los alumnos
        String[] alumnos = {"Alumno1", "Alumno2"};

        // Matriz para las notas (2 alumnos x 7 notas)
        double[][] notas = new double[2][7];

        // Ponderaciones
        double[] ponderaciones = {0.0375, 0.0375, 0.0375, 0.0375, 0.25, 0.25, 0.35};

        // Ingreso de notas
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Ingrese las notas para " + alumnos[i]);
            for (int j = 0; j < 4; j++) {
                System.out.print("Ejercicio " + (j + 1) + ": ");
                notas[i][j] = scanner.nextDouble();
            }
            for (int j = 4; j < 6; j++) {
                System.out.print("Cátedra " + (j - 3) + ": ");
                notas[i][j] = scanner.nextDouble();
            }
            System.out.print("Examen: ");
            notas[i][6] = scanner.nextDouble();
        }

        // Cálculo y muestra de la nota final
        for (int i = 0; i < alumnos.length; i++) {
            double notaFinal = 0;
            for (int j = 0; j < 7; j++) {
                notaFinal += notas[i][j] * ponderaciones[j];
            }
            System.out.println("La nota final de " + alumnos[i] + " es: " + notaFinal);
        }

        scanner.close();
    }
}
