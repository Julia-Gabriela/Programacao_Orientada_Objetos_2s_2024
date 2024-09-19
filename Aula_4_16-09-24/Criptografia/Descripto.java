package Criptografia;

import java.util.Scanner;

public class Descripto {
    public static void main(String[] args) {
        
        int num;

        Scanner input = new Scanner(System.in);



        System.out.println("Digite um numero de quatro digitos:");
        num = input.nextInt();

        if(num < 1000 || num >9999){
            System.out.println("Numero invalido! Devem ter quatro digitos.");
            return;
        }

        int d1 = num/ 1000;          
        int d2 = (num/ 100) % 10;    
        int d3 = (num / 10) % 10;     
        int d4 = num % 10; 

        int temp = d1;
        d1 = d3;
        d3 = temp;

        temp = d2;
        d2 = d4;
        d4 = temp;

        // Descriptografa cada dígito
        d1 = (d1 - 7 + 10) % 10;
        d2 = (d2 - 7 + 10) % 10;
        d3 = (d3 - 7 + 10) % 10;
        d4 = (d4 - 7 + 10) % 10;

        // Reconstrua o número original
        int numeroOriginal = d1 * 1000 + d2 * 100 + d3 * 10 + d4;

        // Exibe o número original
        System.out.println("Número original: " + numeroOriginal);
    }
}
