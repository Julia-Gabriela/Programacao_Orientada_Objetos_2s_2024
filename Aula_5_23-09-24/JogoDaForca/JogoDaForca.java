package JogoDaForca;

import java.util.ArrayList;
import java.util.Scanner;

public class JogoDaForca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String palavra = "programacao";
        int chances = 6;
        
        ArrayList<Character> letrasAdivinhadas = new ArrayList<>();
        
        while (chances > 0) {
            boolean palavraCompleta = true;
            for (int i = 0; i < palavra.length(); i++) {
                char letra = palavra.charAt(i);
                if (letrasAdivinhadas.contains(letra)) {
                    System.out.print(letra + " ");
                } else {
                    System.out.print("_ ");
                    palavraCompleta = false;
                }
            }
            
            if (palavraCompleta) {
                System.out.println("\nParabens! Voce adivinhou a palavra.");
                break;
            }
            
            System.out.print("\nDigite uma letra: ");
            char tentativa = scanner.next().toLowerCase().charAt(0);
            
            if (letrasAdivinhadas.contains(tentativa)) {
                System.out.println("Voce ja tentou essa letra.");
                continue;
            }
            
            letrasAdivinhadas.add(tentativa);
            
            if (palavra.indexOf(tentativa) == -1) {
                chances--;
                System.out.println("Letra errada! Voce tem " + chances + " chances restantes.");
            }
            
            if (chances == 0) {
                System.out.println("Voce perdeu! A palavra era: " + palavra);
            }
        }
        
        scanner.close();
    }
}
