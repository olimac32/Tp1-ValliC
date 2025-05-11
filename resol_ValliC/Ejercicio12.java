package resol_ValliC;

public class Ejercicio12 {
    public void ejercicio12() {
    int vector_deordenado[] = {100, 8, 7, 6, 5, 4, 4, 10, 23, 0};
    int vector_ordenado[]=new int[vector_deordenado.length];
            // Copiar el arreglo original
            for (int i = 0; i < vector_deordenado.length; i++) {
                vector_ordenado[i] = vector_deordenado[i];
            }
            // Ordenar el arreglo
            for (int i = 0; i < vector_ordenado.length - 1; i++) {
                for (int j = 0; j < vector_ordenado.length - 1 - i; j++) {
                    if (vector_ordenado[j] > vector_ordenado[j + 1]) {
                        int temp = vector_ordenado[j];
                        vector_ordenado[j] = vector_ordenado[j + 1];
                        vector_ordenado[j + 1] = temp;
            }
        }
    }
    for (int i = 0; i < vector_ordenado.length; i++) {
        System.out.println(vector_ordenado[i]);
    }
}
}
