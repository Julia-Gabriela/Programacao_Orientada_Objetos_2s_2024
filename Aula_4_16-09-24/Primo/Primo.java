package Primo;

import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        
        System.out.print("Digite um numero: ");
        int num = entrada.nextInt();

        
        if (ehPrimo(num)) {
            System.out.println(num + " e primo");
        } else {
            System.out.println(num + " não e primo");
        }

    }

    
    public static boolean ehPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        else if (num == 2) {
            return true; // O número 2 é o único número primo par
        }
        else if (num % 2 == 0) {
            return false; // Números pares maiores que 2 não são primos
        }
        for (int i = 3; i <= num / 2; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
