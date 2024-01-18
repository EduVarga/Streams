import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoteriaJusta {
    public static void main(String[] args) {

        Scanner inputValue = new Scanner(System.in);
        String entrada;
        List<Loteria> loterias = new ArrayList<>();
        List<Integer> sumas = new ArrayList<>();

        do {
            entrada = inputValue.nextLine();
            if (entrada.contains(" ")){
                String [] datos = entrada.split(" ");
                int gastado = Integer.parseInt(datos[0]);
                int ganado = Integer.parseInt(datos[1]);
                loterias.add(new Loteria(gastado,ganado));
            }else{
                loterias.add(new Loteria(-1,-1));
            }
        }while (!entrada.isEmpty());

        int sumagastado = 0;
        int sumaganado = 0;
        int operacion = 0;

        for (Loteria loteria : loterias) {
            if ((loteria.getGastado() != -1) && (loteria.getGanado() != -1)) {
                sumagastado += loteria.getGastado();
                sumaganado += loteria.getGanado();
                operacion = sumagastado - sumaganado;
            } else {
                sumas.add(operacion);
                operacion = 0;
                sumagastado = 0;
                sumaganado = 0;
            }
        }

        sumas.remove(sumas.get(0));

        /* resultado de la resta entre lo gastado y lo ganado
        System.out.println(sumas); */

        int numeroMenor = sumas.get(0);

        for (Integer suma : sumas) {
            if (suma < numeroMenor) {
                numeroMenor = suma;
            }
        }

        for (Integer suma : sumas) {
            if (suma == numeroMenor) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }
}
