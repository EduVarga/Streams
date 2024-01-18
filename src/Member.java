public class Member implements Comparable<Member>{
    private final String pais;
    private final int personas;
    public Member(String pais, int personas){
        this.pais = pais;
        this.personas = personas;
    }
    public String getPais(){
        return this.pais;
    }
    public int getPersonas(){
        return this.personas;
    }

    public String toString(){
        return this.getPais() + " - " + this.getPersonas();
    }
    public int compareTo(Member other){
        return this.personas - other.getPersonas();
    }
}
