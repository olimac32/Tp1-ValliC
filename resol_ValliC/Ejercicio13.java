package resol_ValliC;

import java.util.Scanner;

public class Ejercicio13 {
    public void ejercicio13() {
    String alumnos[]= new String[3];
    int notas[][]=new int[3][3];
    Scanner teclado = new Scanner(System.in);
    for (int i = 0; i < alumnos.length; i++) {
        System.out.println("ingrese nombre del alumno");
        alumnos[i]=teclado.nextLine();
        for (int j = 0; j < notas.length; j++) {
            System.out.println("ingrese nota "+ (j+1) +" del alumno");
            notas[i][j]=teclado.nextInt();
        }
        teclado.nextLine();
    }
    for (int i = 0; i < alumnos.length; i++) {
        System.out.println("el alumno "+alumnos[i]+" tiene las siguientes notas:");
        for (int j = 0; j < notas.length; j++) {
            System.out.println("nota"+ j+1 +"del alumno"+alumnos[i]+":"+notas[i][j]);
        }
        System.out.println("el promedio del alumno"+alumnos[i]+"es:"+(notas[i][0]+notas[i][1]+notas[i][2])/3);
    }
    teclado.close();
}
}


