import java.util.ArrayList;

public class SumaPositivosONegativos {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(-10);
        numeros.add(5);
        numeros.add(-5);
        numeros.add(2);

        long positivos = numeros.stream()
                .filter(numero -> numero > 0)
                .count();
        long negativos = numeros.stream()
                .filter(numero -> numero < 0)
                .count();

        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);

    }
}
