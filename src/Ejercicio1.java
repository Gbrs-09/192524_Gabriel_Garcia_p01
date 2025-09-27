
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar entrada de a y b
        System.out.print("a = ");
        double a = sc.nextDouble();

        System.out.print("b = ");
        double b = sc.nextDouble();

        // Verificar que funcione
        if (a > b) {
            double suma = a + b;
            double diferencia = a - b;
            System.out.println("Suma: " + suma);
            System.out.println("Diferencia: " + diferencia);
        } else {
            double producto = a * b;
            System.out.println("Producto: " + producto);

            if (b == 0) {
                System.out.println("Division no definida (b es 0)");
            } else {
                double division = a / b;
                System.out.println("Division (a/b): " + division);
            }
        }

        sc.close();
    }
}

 
