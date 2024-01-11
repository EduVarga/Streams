import java.util.ArrayList;
import java.util.List;
public class OrdenSalarios {
    public static void main(String[] args) {

        List<Human> personas = new ArrayList<>();
        personas.add(new Human("Jose", 1500));
        personas.add(new Human("Manuel", 1800));
        personas.add(new Human("Marta", 1650));

        personas.stream().sorted().forEach(System.out::println);

    }
}
