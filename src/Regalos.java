public class Regalos implements Comparable<Regalos> {
    private final int preferencia;
    private final int pesoRegalo;
    public Regalos(int preferencia, int pesoRegalo){
        this.preferencia = preferencia;
        this.pesoRegalo = pesoRegalo;
    }
    public int getPreferencia(){
        return this.preferencia;
    }
    public int getPesoRegalo(){
        return this.pesoRegalo;
    }

    public String toString(){
        return this.getPreferencia() + " " + this.getPesoRegalo();
    }
    public int compareTo (Regalos other){
        if (this.preferencia == other.getPreferencia()){
            return this.pesoRegalo - other.getPesoRegalo();
        }else{
            return other.getPreferencia() - this.preferencia;
        }
    }
}
