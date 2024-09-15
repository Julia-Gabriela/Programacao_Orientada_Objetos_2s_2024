package Date;

public class Date {
    private int mes, dia, ano;
    

    public Date (int dia, int mes, int ano){
        this.mes = mes;
        this.dia = dia;
        this.ano = ano;
    }

    public void setMes (int mes){
        this.mes = mes;
    }

    public int getMes (){
        return this.mes;
    }

    public void setDia(int dia){
        this.dia = dia;
    }

    public int getDia(){
        return this.dia;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public int getAno(){
        return this.ano;
    }

    public String displayDate(){
        return getDia() +"/"+ getMes() +"/"+ getAno();
    }

    
}
