import java.util.*;

public class RegalosOrdenados {
    public static void main(String[] args) {

        List<Regalos> regalos = new ArrayList<>();

        regalos.add(new Regalos(80,2));
        regalos.add(new Regalos(100,12));
        regalos.add(new Regalos(100,1));

        regalos.stream().sorted().forEach(System.out::println);

    }
}
