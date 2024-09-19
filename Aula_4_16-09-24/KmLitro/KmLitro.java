package KmLitro;

public class KmLitro {
    
    private int km, litros;

    

    public KmLitro(int km, int litros){
        this.km = km;
        this.litros = litros;
    }

    public void setKm(int km){
        this.km = km;
    }

    public int getKm(){
        return this.km;
    }

    public void setLitros(int litros){
        this.litros = litros;
    }

    public int getLitros(){
        return this.litros;
    }

}
