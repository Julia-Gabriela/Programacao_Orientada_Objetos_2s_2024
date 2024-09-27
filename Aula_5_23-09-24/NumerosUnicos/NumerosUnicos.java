package NumerosUnicos;

import java.util.Scanner;

public class NumerosUnicos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numerosUnicos = new int[5];  
        int contador = 0;  

        while (contador < 5) {
            System.out.print("Insira um numero entre 10 e 100: ");
            int numero = scanner.nextInt();

           
            if (numero < 10 || numero > 100) {
                System.out.println("Numero fora do intervalo. Tente novamente.");
                continue;
            }

           
            boolean duplicado = false;
            for (int i = 0; i < contador; i++) {
                if (numerosUnicos[i] == numero) {
                    duplicado = true;
                    break;
                }
            }

            
            if (!duplicado) {
                numerosUnicos[contador] = numero;
                contador++;
                
                
                System.out.print("Numeros unicos inseridos: ");
                for (int i = 0; i < contador; i++) {
                    System.out.print(numerosUnicos[i] + " ");
                }
                System.out.println();
            } else {
                System.out.println("Numero duplicado. Nao sera adicionado.");
            }
        }

        scanner.close();
    }
}

