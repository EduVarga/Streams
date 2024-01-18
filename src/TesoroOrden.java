import java.util.ArrayList;
import java.util.List;

public class TesoroOrden {
    public static void main(String[] args) {

        List<Tesoro> tesoros = new ArrayList<>();
        tesoros.add(new Tesoro("flecha",5,1));
        tesoros.add(new Tesoro("sandalias",10,2));
        tesoros.add(new Tesoro("sarcofago",1000,1000));
        tesoros.add(new Tesoro("mascara",1000,10));
        tesoros.add(new Tesoro("arco",10,2));
        tesoros.stream().sorted().forEach(System.out::println);
    }
}
