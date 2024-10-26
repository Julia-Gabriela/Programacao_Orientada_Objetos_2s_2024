package Fatorial;

public class Fatorial {
    // Método recursivo para calcular o fatorial
    public static int calcularFatorial(int numero) throws NegativeNumberException {
        if (numero < 0) {
            throw new NegativeNumberException("Numero negativo: o fatorial nao pode ser calculado.");
        }
        if (numero == 0 || numero == 1) {
            return 1;
        }
        return numero * calcularFatorial(numero - 1);
    }
}

