package VerificadorDeParenteses;

import java.util.Scanner;
import java.util.Stack;

public class VerificadorDeParenteses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma expressao com parenteses: ");
        String expressao = scanner.nextLine();

        if (verificarParenteses(expressao)) {
            System.out.println("OK");
        } else {
            System.out.println("Erro");
        }

        scanner.close();
    }

    public static boolean verificarParenteses(String expressao) {
        Stack<Character> pilha = new Stack<>();

        for (char c : expressao.toCharArray()) {
            if (c == '(') {
                pilha.push(c); 
            } else if (c == ')') {
                if (pilha.isEmpty() || pilha.pop() != '(') {
                    return false; 
                }
            }
        }

        return pilha.isEmpty(); 
    }
}
