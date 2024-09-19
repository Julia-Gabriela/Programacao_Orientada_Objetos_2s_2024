package Quadrado;

import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o tamanho do lado do quadrado(entre 1 e 20):");
        int tamanho = input.nextInt();

        if (tamanho < 1 || tamanho > 20) {
            System.out.println("Tamanho invalido. O tamanho deve estar entre 1 e 20.");
        } else {
            for (int i = 0; i < tamanho; i++) {
                for (int j = 0; j < tamanho; j++) {
                    // Imprimir asterisco na borda ou espaço no interior
                    if (i == 0 || i == tamanho - 1 || j == 0 || j == tamanho - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
