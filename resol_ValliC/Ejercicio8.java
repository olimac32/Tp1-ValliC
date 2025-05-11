package resol_ValliC;
import java.util.Scanner;

public class Ejercicio8 {
    public  void ejercicio8() {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Convertir de celsius a fahrenheit (1) o convertir de fahrenheit a celsius (2):");
        int num = teclado.nextInt();
        
        switch (num) {
            case 1:
                System.out.println("Ingrese la temperatura en celsius:");
                double num1 = teclado.nextDouble();
                double fahrenheit = (num1 * 1.8) + 32;
                System.out.println("La temperatura en fahrenheit es: " + fahrenheit);
                break;
            case 2:
                System.out.println("Ingrese la temperatura en fahrenheit:");
                double num2 = teclado.nextDouble();
                double celsius = (num2 - 32) / 1.8;
                System.out.println("La temperatura en celsius es: " + celsius);
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
        
        teclado.close();
    }
}
