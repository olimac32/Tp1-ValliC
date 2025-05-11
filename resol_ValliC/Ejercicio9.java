package resol_ValliC;

public class Ejercicio9 {
    public  void ejercicio9() {
        String text = "Hola mundo\nEsto es un\tejem plo";
        int count = text.split("\\s+|\\n|\\t").length;
        System.out.println("Número de palabras: " + count);
    }
}
