package Criptografia;
import java.util.Scanner;

public class Cripto {
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

        d1 = (d1 + 7) % 10;
        d2 = (d2 + 7) % 10;
        d3 = (d3 + 7) % 10;
        d4 = (d4 + 7) % 10;

        

        int criptografado = d3 * 1000 + d4 * 100 + d1 * 10 + d2;

        System.out.println("Numero criptografado: " + criptografado);
        
        
       
    }

}
