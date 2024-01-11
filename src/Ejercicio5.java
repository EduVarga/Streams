import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner inputValue = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        int numero;

        do {
            numero = inputValue.nextInt();
            lista.add(numero);
        }while (numero>0);

        List<Integer> entre1y5 = lista.stream()
                .filter(num -> (num <= 5) && (num >= 1))
                .collect(Collectors.toList());

        System.out.println(entre1y5);

    }
}
