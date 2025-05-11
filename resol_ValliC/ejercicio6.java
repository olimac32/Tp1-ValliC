package resol_ValliC;
import java.util.Scanner;

public class Ejercicio6 {
    public void ejercicio6() {
        Scanner teclado = new Scanner(System.in);
        
        double num = Math.round(Math.random()*100);
        System.out.println(num);
        System.out.println("ingrese un numero");
        double num2 =  teclado.nextDouble();
        do{
            if (num2 == num) {
                System.out.println("ganaste");
                break;
            }else{
                if (num2>num) {
                    System.out.println("el numero es mas chico");
                    
                }else{
                    System.out.println("el numero es mas grande");
                }
            }
            num2 =  teclado.nextDouble();
        }while(num!=num2);
        teclado.close();
    }
}

