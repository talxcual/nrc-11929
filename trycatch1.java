import java.util.Scanner;

public class trycatch1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            try {
                System.out.print("Ingrese el número del día de la semana (1-7): ");
                int diasemana = scanner.nextInt();
                String dia;

                switch (diasemana) {
                    case 1:
                        dia = "Lunes";
                        break;
                    case 2:
                        dia = "Martes";
                        break;
                    case 3:
                        dia = "Miércoles";
                        break;
                    case 4:
                        dia = "Jueves";
                        break;
                    case 5:
                        dia = "Viernes";
                        break;
                    case 6:
                        dia = "Sábado";
                        break;
                    case 7:
                        dia = "Domingo";
                        break;
                    default:
                        dia = "?";
                        break;
                }

                System.out.println("Número del día: " + diasemana);
                System.out.println("Día de la semana: " + dia);

            } catch (Exception e) {
                System.out.println("Error: entrada no válida. Por favor ingrese un número entre 1 y 7.");
                scanner.next(); 
            }

            System.out.print("¿Desea ingresar otro día? (si/no): ");
            String respuesta = scanner.next().toLowerCase();  

            
            if (!respuesta.equals("si")) {
                continuar = false;
            }
        }

        scanner.close();  
    }
}
