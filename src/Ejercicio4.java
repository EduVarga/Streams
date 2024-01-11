import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner inputValue = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        String cadena;

        do {
            cadena = inputValue.nextLine();
            lista.add(cadena);
        } while (!cadena.isEmpty());

        String cadenas = lista.stream()
                .reduce("", (a, b) -> a + b + "\n");

        System.out.println(cadenas);


    }
}
