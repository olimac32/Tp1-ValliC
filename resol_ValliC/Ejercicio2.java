package resol_ValliC;
import java.util.Scanner;

public class Ejercicio2 {
    public void ejercicio2() {
        System.out.println("ingres un numero");
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        if (num % 2 == 0) {
            System.out.println("el numero es par");
        }else{
            System.out.println("el numero es impar");
        }
        teclado.close();
    }
}
