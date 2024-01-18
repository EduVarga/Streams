public class Loteria implements Comparable<Loteria>{
    private final int gastado;
    private final int ganado;
    public Loteria(int gastado, int ganado){
        this.gastado = gastado;
        this.ganado = ganado;
    }
    public int getGastado(){
        return this.gastado;
    }
    public int getGanado(){
        return this.ganado;
    }

    public String toString(){
        return this.getGastado() + " " + this.getGanado();
    }
    public int compareTo(Loteria other){
        return this.ganado - other.getGanado();
    }
}
