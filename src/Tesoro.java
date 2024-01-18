public class Tesoro implements Comparable<Tesoro>{
    private final String nombre;
    private final int valor;
    private final int peso;
    public Tesoro(String nombre, int valor, int peso){
        this.nombre = nombre;
        this.valor = valor;
        this.peso = peso;
    }
    public String  getNombre(){
        return this.nombre;
    }
    public int getValor(){
        return this.valor;
    }
    public int getPeso(){
        return this.peso;
    }

    public String toString(){
        return this.getNombre();
    }
    public int compareTo (Tesoro other){
        if (this.valor == other.getValor()){
            return this.peso - other.getPeso();
        }else{
            return other.getValor() - this.valor;
        }
    }
}
