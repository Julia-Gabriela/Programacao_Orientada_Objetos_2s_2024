package LimiteCredito;

public class Limite {
    private int numConta, saldoInicial, despesas, totalCredito, limiteCredito;
   

    public void limiteCredito(int numConta, int saldoInicial, int despesas, int totalCredito, int limiteCredito){
        this.numConta = numConta;
        this.saldoInicial = saldoInicial;
        this.despesas = despesas;
        this.totalCredito = totalCredito;
        this.limiteCredito = limiteCredito;

      
    }

    public void setNumConta(int numConta){
        this.numConta = numConta;
    }
    
    public int getNumConta(){
        return this.numConta;
    }

    public void setSaldoInicial(int saldoInicial){
        this.saldoInicial = saldoInicial;
    }

    public int getSaldoInicial(){
        return this.saldoInicial;
    }

    public void setDespesas(int despesas){
        this.despesas = despesas;
    }
    public int getDespesas(){
        return this.despesas;
    }

    public void setTotalCredito(int totalCredito){
        this.totalCredito = totalCredito;
    }
    public int getTotalCredito(){
        return this.totalCredito;
    }
    public int getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(int limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
    public int calcularNovoSaldo() {
        return saldoInicial + despesas - totalCredito;
    }

    public boolean limiteExcedido() {
        return calcularNovoSaldo() > limiteCredito;
    }


}
