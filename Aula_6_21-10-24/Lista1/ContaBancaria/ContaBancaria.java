package ContaBancaria;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Deposito de R$%.2f realizado com sucesso.%n", valor);
        } else {
            System.out.println("Valor de deposito invalido.");
        }
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar o saque.");
        } else if (valor <= 0) {
            System.out.println("Valor de saque invalido.");
        } else {
            saldo -= valor;
            System.out.printf("Saque de R$%.2f realizado com sucesso.%n", valor);
        }
    }
}

