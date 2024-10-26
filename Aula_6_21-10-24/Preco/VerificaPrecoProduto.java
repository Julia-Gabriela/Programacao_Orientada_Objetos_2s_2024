package Preco;

import java.util.Scanner;

public class VerificaPrecoProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preco do produto: R$");
        double preco = scanner.nextDouble();

        // Verifica se o preço é maior que zero
        assert preco > 0 : "Erro: O preco do produto deve ser maior que zero.";

        System.out.printf("Preço valido: R$%.2f%n", preco);
        scanner.close();
    }
}

