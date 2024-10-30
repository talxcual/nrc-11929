public class MATRIZTAREA {
    public static void main(String[] args) {
        // Matriz bidimensional para almacenar las notas de dos alumnos (2 alumnos x 7 calificaciones)
        float[][] matrizNotas = new float[2][7];

        // Ejemplo de entrada de notas para dos alumnos
        matrizNotas[0][0] = 7.0f;   // Alumno 1, Ejercicio 1
        matrizNotas[0][1] = 6.5f;   // Alumno 1, Ejercicio 2
        matrizNotas[0][2] = 8.0f;   // Alumno 1, Ejercicio 3
        matrizNotas[0][3] = 5.5f;   // Alumno 1, Ejercicio 4
        matrizNotas[0][4] = 7.5f;   // Alumno 1, Cátedra 1
        matrizNotas[0][5] = 6.0f;   // Alumno 1, Cátedra 2
        matrizNotas[0][6] = 9.0f;   // Alumno 1, Examen

        matrizNotas[1][0] = 5.0f;   // Alumno 2, Ejercicio 1
        matrizNotas[1][1] = 7.5f;   // Alumno 2, Ejercicio 2
        matrizNotas[1][2] = 6.0f;   // Alumno 2, Ejercicio 3
        matrizNotas[1][3] = 7.0f;   // Alumno 2, Ejercicio 4
        matrizNotas[1][4] = 8.0f;   // Alumno 2, Cátedra 1
        matrizNotas[1][5] = 7.0f;   // Alumno 2, Cátedra 2
        matrizNotas[1][6] = 6.5f;   // Alumno 2, Examen

        // Ponderaciones
        float[] ponderaciones = {0.0375f, 0.0375f, 0.0375f, 0.0375f, 0.25f, 0.25f, 0.35f};

        // Mostrar notas y calcular promedios ponderados para cada alumno
        for (int i = 0; i < matrizNotas.length; i++) {
            System.out.println("Notas del Alumno " + (i + 1) + ":");
            for (int j = 0; j < matrizNotas[i].length; j++) {
                System.out.println("Nota " + (j + 1) + ": " + matrizNotas[i][j]);
            }

            // Calcular y mostrar el promedio ponderado
            float promedio = calcularPromedioPonderado(matrizNotas[i], ponderaciones);
            System.out.println("Promedio ponderado del Alumno " + (i + 1) + ": " + promedio + "\n");
        }
    }

    // Función para calcular el promedio ponderado de las notas
    public static float calcularPromedioPonderado(float[] notas, float[] ponderaciones) {
        float suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i] * ponderaciones[i];
        }
        return suma;
    }
}
