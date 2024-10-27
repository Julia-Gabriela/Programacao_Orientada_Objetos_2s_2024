package OrdemCrescente;

import java.util.Scanner;

public class OrdemCrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo numero: ");
        int numero2 = scanner.nextInt();

        System.out.print("Digite o terceiro numero: ");
        int numero3 = scanner.nextInt();

        // Verifica se os números estão em ordem crescente
        assert numero1 < numero2 && numero2 < numero3 : "Erro: Os numeros devem estar em ordem crescente.";

        System.out.println("Os numeros estão em ordem crescente: " + numero1 + ", " + numero2 + ", " + numero3);
        scanner.close();
    }
}

