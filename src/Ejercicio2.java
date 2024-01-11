import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {

        ArrayList<Person> personas = new ArrayList<>();
        Person persona = new Person("Pepe", "García", 1968);
        personas.add(persona);
        persona = new Person("María",  "García", 1998);
        personas.add(persona);
        persona = new Person("Juan", "Martínez", 1968);
        personas.add(persona);

        long empiezaPorA = personas.stream()
                .filter(person -> "AÁÀÄaáàä".indexOf(person.getLastName().charAt(0)) != -1)
                .count();

        System.out.println("Personas cuyo primer apellido comienza por 'A': " + empiezaPorA);

    }
}
