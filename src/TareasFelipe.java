import java.util.ArrayList;
import java.util.List;

public class TareasFelipe {
    public static void main(String[] args) {

        List<Tareas> tareas = new ArrayList<>();
        tareas.add(new Tareas(1,6));
        tareas.add(new Tareas(1,4));
        tareas.add(new Tareas(2,4));
        tareas.add(new Tareas(3,5));
        tareas.stream().sorted().forEach(System.out::println);
    }
}
