package ContaBancaria;

public class ContaBancaria{

    private String nome;
    private int numConta;
    private int agencia;
    private double saldo;

    public ContaBancaria(String nome, int numConta, int agencia, double saldo){
        this.nome = nome;
        this.numConta = numConta;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    //metodo set de nome (altera o nome)
    public void setNome(String nome){
        // this = acessa a propriedade daquela classe
        this.nome = nome;
    }
    
    //metodo get de nome (retorna/mostra o nome)
    public String getNome(){
        return this.nome;
    }

    public void setNumConta (int numConta){
        this.numConta = numConta;
    }

    public int getNumConta (){
        return this.numConta;
    }

    public void setAgencia (int agencia){
        this.agencia = agencia;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void depositar(double valor){
        double valorDeposito = getSaldo() + valor;
        this.setSaldo(valorDeposito);
    }

    public void sacar(double valor){
        double valorRestante = getSaldo() - valor;
        this.setSaldo(valorRestante);
    }


}