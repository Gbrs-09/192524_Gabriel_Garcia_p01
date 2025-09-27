import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa la nota 1:");
        double nota1 = sc.nextDouble();
        System.out.println("Ingresa la nota 2:");
        double nota2 = sc.nextDouble();
        System.out.println("Ingresa la nota 3:");
        double nota3 = sc.nextDouble();

        // Validar que las notas estén en el rango [0.0, 5.0]
        if (nota1 && nota2 && nota3 < 0) {
            System.out.println("Nota invalida");
            return;  // Termina el programa
        }

        double promedio = (nota1 + nota2 + nota3) / 3;
        System.out.printf("Promedio: %.2f%n", promedio);

        if (promedio >= 4.5) {
            System.out.println("Estado: Promocionado");
        } else if (promedio >= 4.0) {
            System.out.println("Estado: Regular");
        } else (promedio <= 4.0){
            System.out.println("Estado: Reprobado");
        }
    }
    }