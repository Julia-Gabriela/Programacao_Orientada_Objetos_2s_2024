package Notas;

import java.util.Scanner;

public class NotasAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas notas voce deseja inserir? ");
        int quantidadeNotas = scanner.nextInt();

        double[] notas = new double[quantidadeNotas];

        for (int i = 0; i < quantidadeNotas; i++) {
            System.out.printf("Digite a nota %d: ", i + 1);
            notas[i] = scanner.nextDouble();

            // Verifica se a nota está no intervalo de 0 a 10
            assert notas[i] >= 0 && notas[i] <= 10 : "Erro: A nota deve estar entre 0 e 10.";
        }

        System.out.println("Notas inseridas com sucesso.");
        scanner.close();
    }
}

