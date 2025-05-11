package resol_ValliC;
import java.util.Scanner;

public class Ejercicio1 {
    public void ejercicio1() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Por favor, ingresa tu nombre: ");
        String nombre = teclado.nextLine();
        System.out.println("¡Hola " + nombre + "!");
        teclado.close();
    }
}