package resol_ValliC;
import java.util.Scanner;
public class Ejercicio7 {
    public void ejercicio7() {
    Scanner teclado = new Scanner (System.in);
    System.out.println("ingrese 1 para suma, 2 para resta, 3 para multiplicacion, 4 para division");
    int num = teclado.nextInt();
    int num1;
    int num2;
    switch (num) {
        case 1:
            System.out.println("Suma");
            System.out.println("ingrese el primer numero");
            num1 = teclado.nextInt();
            System.out.println("ingrese el segundo numero");
            num2 = teclado.nextInt();
            int suma = num1 + num2;
            System.out.println("la suma es: "+suma);
            teclado.close();
            break;
        case 2:
            System.out.println("Resta");
            System.out.println("ingrese el primer numero");
            num1 = teclado.nextInt();
            System.out.println("ingrese el segundo numero");
            num2 = teclado.nextInt();
            int resta = num1 - num2;
            System.out.println("la resta es: "+resta);
            teclado.close();
            break;
        case 3:
            System.out.println("Multiplicacion");
            System.out.println("ingrese el primer numero");
            num1 = teclado.nextInt();
            System.out.println("ingrese el segundo numero");
            num2 = teclado.nextInt();
            int multiplicacion = num1 * num2;
            System.out.println("la multiplicacion es: "+multiplicacion);
            teclado.close();
            break;
        case 4:
            System.out.println("Division");
            System.out.println("ingrese el primer numero");
            num1 = teclado.nextInt();
            System.out.println("ingrese el segundo numero");
            num2 = teclado.nextInt();
            int division = num1 / num2;
            System.out.println("la division es: "+division);
            teclado.close();
            break;
    
        default:
            System.out.println("opcion no valida");
            teclado.close();
            break;
    }
    }
    
    
}
