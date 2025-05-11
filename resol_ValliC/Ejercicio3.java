package resol_ValliC;

import java.util.Scanner;

public class Ejercicio3 {
    public void ejercicio3() {
        System.out.println("ingrese un numero");
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(num*i);
        }
        teclado.close();
}
}