package MenorNum;

import java.util.Scanner;

public class MenorNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Quantos numeros deseja comparar? ");
        int quantidade = input.nextInt();

      
        System.out.print("Digite o numero 1: ");
        int menor = input.nextInt();

       
        for (int i = 2; i <= quantidade; i++) {
            System.out.print("Digite o numero " + i + ": ");
            int numero = input.nextInt();

            if (numero < menor) {
                menor = numero;
            }
        }

        // Exibe o menor número encontrado
        System.out.println("O menor numero e: " + menor);
        input.close();
    }
}