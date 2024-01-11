public class Human implements Comparable<Human>{
    private String nombre;
    private int salario;

    public Human(String nombre, int salario){
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getSalario(){
        return this.salario;
    }

    public String toString(){
        return this.getNombre() + " - " + this.getSalario() + "€";
    }

    public int compareTo(Human other){
        return other.getSalario() - this.salario;
    }
}
