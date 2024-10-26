package Fatorial2;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo para calcular o fatorial: ");
        int numero = scanner.nextInt();

        // Verifica se o número é não negativo
        assert numero >= 0 : "Erro: O número deve ser não negativo.";

        System.out.println("Fatorial de " + numero + " é: " + calcularFatorial(numero));

        scanner.close();
    }

    // Método para calcular o fatorial de um número
    public static long calcularFatorial(int numero) {
        long fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}

