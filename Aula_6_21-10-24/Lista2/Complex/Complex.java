package Lista2.Complex;

public class Complex {
    private double parteReal;
    private double parteImaginaria;

    // Construtor que inicializa com valores fornecidos
    public Complex(double parteReal, double parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }

    // Construtor sem argumento, inicializa com valores padrao (0, 0)
    public Complex() {
        this(0.0, 0.0);
    }

    // Metodo para somar dois numeros complexos
    public Complex somar(Complex outro) {
        double novaParteReal = this.parteReal + outro.parteReal;
        double novaParteImaginaria = this.parteImaginaria + outro.parteImaginaria;
        return new Complex(novaParteReal, novaParteImaginaria);
    }

    // Metodo para subtrair dois numeros complexos
    public Complex subtrair(Complex outro) {
        double novaParteReal = this.parteReal - outro.parteReal;
        double novaParteImaginaria = this.parteImaginaria - outro.parteImaginaria;
        return new Complex(novaParteReal, novaParteImaginaria);
    }

    // Metodo para exibir o numero complexo no formato (parteReal, parteImaginaria)
    public void imprimir() {
        System.out.printf("(%.2f, %.2f)%n", parteReal, parteImaginaria);
    }

    public static void main(String[] args) {
        Complex num1 = new Complex(3.5, 2.5);
        Complex num2 = new Complex(1.5, 4.0);

        System.out.print("Numero 1: ");
        num1.imprimir();

        System.out.print("Numero 2: ");
        num2.imprimir();

        Complex soma = num1.somar(num2);
        System.out.print("Soma: ");
        soma.imprimir();

        Complex subtracao = num1.subtrair(num2);
        System.out.print("Subtracao: ");
        subtracao.imprimir();
    }
}

