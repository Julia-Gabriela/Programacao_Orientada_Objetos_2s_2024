package OrdemCrescente;

import java.util.Scanner;

public class OrdemCrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int numero3 = scanner.nextInt();

        // Verifica se os números estão em ordem crescente
        assert numero1 < numero2 && numero2 < numero3 : "Erro: Os números devem estar em ordem crescente.";

        System.out.println("Os números estão em ordem crescente: " + numero1 + ", " + numero2 + ", " + numero3);
        scanner.close();
    }
}

