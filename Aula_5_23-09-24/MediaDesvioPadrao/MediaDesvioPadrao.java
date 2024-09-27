package MediaDesvioPadrao;

import java.util.Scanner;

public class MediaDesvioPadrao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura da quantidade de numeros
        System.out.print("Digite a quantidade de numeros: ");
        int n = scanner.nextInt();

        // Verifica se a quantidade de numeros e maior que zero
        if (n <= 0) {
            System.out.println("A quantidade de numeros deve ser maior que zero.");
            return;
        }

        // Array para armazenar os numeros
        double[] numeros = new double[n];

        // Leitura dos numeros
        double soma = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
            soma += numeros[i]; // Soma todos os numeros
        }

        // Calculo da media
        double media = soma / n;
        System.out.println("Media: " + media);

        // Calculo do desvio padrao
        double somaQuadrados = 0;
        for (int i = 0; i < n; i++) {
            somaQuadrados += Math.pow(numeros[i] - media, 2);
        }
        double desvioPadrao = Math.sqrt(somaQuadrados / n);
        System.out.println("Desvio padrao: " + desvioPadrao);

        scanner.close();
    }
}
