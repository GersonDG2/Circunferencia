import java.util.Scanner;

/**
 * fue creado para calcular el area de una circunferencia
 * @author Gerson Emilio Carrillo Martir
 * @since 24-08-02
 */

public class Circunferencia {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el radio de la circunferencia
        System.out.print("Ingrese el radio de la circunferencia: ");
        double radio = scanner.nextDouble();

        // Calcular el área de la circunferencia
        double area = calcularArea(radio);

        // Mostrar el área de la circunferencia
        System.out.println("El área de la circunferencia es: " + area);

        //Primer cambio para git
        System.err.println("Este es el primer cambio");

        // Cerrar el objeto Scanner
        scanner.close();
    }

    // Método para calcular el área de una circunferencia dado su radio
    public static double calcularArea(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }
}
