package Lista2.Rational;

public class Rational {
    private int numerador;
    private int denominador;

    // Construtor que inicializa o objeto com valores reduzidos
    public Rational(int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("Denominador nao pode ser zero.");
        }
        int gcd = calcularMdc(numerador, denominador);
        this.numerador = numerador / gcd;
        this.denominador = denominador / gcd;
        
        // Ajusta o sinal para manter o denominador positivo
        if (this.denominador < 0) {
            this.numerador = -this.numerador;
            this.denominador = -this.denominador;
        }
    }

    // Construtor sem argumentos (padrao 1/1)
    public Rational() {
        this(1, 1);
    }

    // Metodo para calcular o MDC (Maximo Divisor Comum)
    private static int calcularMdc(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calcularMdc(b, a % b);
    }

    // Metodo para somar duas fracoes
    public static Rational somar(Rational r1, Rational r2) {
        int novoNumerador = r1.numerador * r2.denominador + r2.numerador * r1.denominador;
        int novoDenominador = r1.denominador * r2.denominador;
        return new Rational(novoNumerador, novoDenominador);
    }

    // Metodo para subtrair duas fracoes
    public static Rational subtrair(Rational r1, Rational r2) {
        int novoNumerador = r1.numerador * r2.denominador - r2.numerador * r1.denominador;
        int novoDenominador = r1.denominador * r2.denominador;
        return new Rational(novoNumerador, novoDenominador);
    }

    // Metodo para multiplicar duas fracoes
    public static Rational multiplicar(Rational r1, Rational r2) {
        int novoNumerador = r1.numerador * r2.numerador;
        int novoDenominador = r1.denominador * r2.denominador;
        return new Rational(novoNumerador, novoDenominador);
    }

    // Metodo para dividir duas fracoes
    public static Rational dividir(Rational r1, Rational r2) {
        if (r2.numerador == 0) {
            throw new ArithmeticException("Divisao por zero.");
        }
        int novoNumerador = r1.numerador * r2.denominador;
        int novoDenominador = r1.denominador * r2.numerador;
        return new Rational(novoNumerador, novoDenominador);
    }

    // Metodo para retornar a representacao em String no formato a/b
    public String toString() {
        return numerador + "/" + denominador;
    }

    // Metodo para retornar a representacao em ponto flutuante
    public double toDouble() {
        return (double) numerador / denominador;
    }

    public static void main(String[] args) {
        // Testes
        Rational r1 = new Rational(1, 2);
        Rational r2 = new Rational(3, 4);

        System.out.println("Fracao 1: " + r1);
        System.out.println("Fracao 2: " + r2);

        Rational soma = Rational.somar(r1, r2);
        System.out.println("Soma: " + soma + " ou " + soma.toDouble());

        Rational subtracao = Rational.subtrair(r1, r2);
        System.out.println("Subtracao: " + subtracao + " ou " + subtracao.toDouble());

        Rational multiplicacao = Rational.multiplicar(r1, r2);
        System.out.println("Multiplicacao: " + multiplicacao + " ou " + multiplicacao.toDouble());

        Rational divisao = Rational.dividir(r1, r2);
        System.out.println("Divisao: " + divisao + " ou " + divisao.toDouble());
    }
}

