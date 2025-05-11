package resol_ValliC;

import java.util.Scanner;

public class Ejercicio10 {
    private String contraseña;
    public void ejercicio10() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese contraseña para verificar seguridad");
        this.contraseña = teclado.nextLine();
        if (esSeguro()) {
            System.out.println("La contraseña es segura");
        }
        teclado.close();
    }
    private boolean esSeguro() {
        // Verificar espacios
        if (contraseña.contains(" ")) {
            System.out.println("Error: No se permiten espacios");
            return false;
        }
        // Verificar longitud mínima
        if (contraseña.length() < 8) {
            System.out.println("Error: La contraseña debe tener al menos 8 caracteres");
            return false;
        }
        int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;
        // Contar caracteres
        for (int i = 0; i < contraseña.length(); i++) {
            char caracter = contraseña.charAt(i);
            if (caracter >= 'A' && caracter <= 'Z') {
                mayusculas++;
            } else if (caracter >= 'a' && caracter <= 'z') {
                minusculas++;
            } else if (caracter >= '0' && caracter <= '9') {
                numeros++;
            }
        }
        // Verificar requisitos mínimos
        if (mayusculas < 2) {
            System.out.println("Error: La contraseña debe tener al menos 2 mayúsculas");
            return false;
        }
        if (minusculas < 3) {
            System.out.println("Error: La contraseña debe tener al menos 3 minúsculas");
            return false;
        }
        if (numeros < 2) {
            System.out.println("Error: La contraseña debe tener al menos 2 números");
            return false;
        }
        return true;
    }

}

