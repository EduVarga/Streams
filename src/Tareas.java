public class Tareas implements Comparable<Tareas>{
    private final int prioridad;
    private final int duracion;
    public Tareas(int prioridad, int duracion){
        this.prioridad = prioridad;
        this.duracion = duracion;
    }
    public int getPrioridad(){
        return this.prioridad;
    }
    public int getDuracion(){
        return this.duracion;
    }

    public String toString(){
        return this.prioridad + " " + this.getDuracion();
    }
    public int compareTo (Tareas other){
        if (this.prioridad == other.getPrioridad()){
            return this.duracion - other.getDuracion();
        }else{
            return other.getPrioridad() - this.prioridad;
        }
    }
}
