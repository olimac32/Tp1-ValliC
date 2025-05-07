package resol_ValliC;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Por favor, ingresa tu nombre: ");
        String nombre = teclado.nextLine();
        System.out.println("¡Hola " + nombre + "!");
        teclado.close();
    }
}