package IntervaloNum;

import java.util.Scanner;

public class NumeroIntervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero entre 1 e 100: ");
        int numero = scanner.nextInt();

        // Verifica se o número está dentro do intervalo de 1 a 100
        assert numero >= 1 && numero <= 100 : "Erro: O numero deve estar entre 1 e 100.";

        System.out.println("Numero valido: " + numero);

        scanner.close();
    }
}


