package Fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, termo1 = 1, termo2 = 1, proximoTermo = 0;

        System.out.println("Digite um numero:");
        num = input.nextInt();

        if(num == 1 || num == 2){
            System.out.printf("O" + num + "-esimo termo da ssequencia de fibonacci e igual a 1");
        }
        else{
            for(int i = 3; i<= num; i++){
                proximoTermo = termo1 + termo2;
                termo1 = termo2;
                termo2 = proximoTermo;
            }
            System.out.println("O" + num + "-esimo termo da sequencia de fibonacci e igual a" + proximoTermo);
        }
        input.close();
    }
}
