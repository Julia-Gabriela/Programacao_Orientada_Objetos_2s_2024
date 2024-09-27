package JogoDaVelha;

import java.util.Scanner;

public class JogoDaVelha {
    private char[][] tabuleiro;
    private char jogadorAtual;

    public JogoDaVelha() {
        tabuleiro = new char[3][3];
        jogadorAtual = 'X'; // Jogador X começa
        inicializaTabuleiro();
    }

    private void inicializaTabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' '; // Espaço vazio
            }
        }
    }

    private void exibeTabuleiro() {
        System.out.println("   0   1   2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + tabuleiro[i][j] + " ");
            }
            System.out.println("|");
            System.out.println("  -----------");
        }
    }

    private boolean jogadaValida(int linha, int coluna) {
        return linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna] == ' ';
    }

    private boolean verificaVitoria() {
        // Verifica linhas, colunas e diagonais
        for (int i = 0; i < 3; i++) {
            if ((tabuleiro[i][0] == jogadorAtual && tabuleiro[i][1] == jogadorAtual && tabuleiro[i][2] == jogadorAtual) ||
                (tabuleiro[0][i] == jogadorAtual && tabuleiro[1][i] == jogadorAtual && tabuleiro[2][i] == jogadorAtual)) {
                return true;
            }
        }
        return (tabuleiro[0][0] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][2] == jogadorAtual) ||
               (tabuleiro[0][2] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][0] == jogadorAtual);
    }

    public void iniciarJogo() {
        Scanner scanner = new Scanner(System.in);
        int jogadas = 0;

        while (jogadas < 9) {
            exibeTabuleiro();
            System.out.println("Jogador " + jogadorAtual + ", digite linha e coluna (ex: 0 1): ");
            int linha = scanner.nextInt();
            int coluna = scanner.nextInt();

            if (jogadaValida(linha, coluna)) {
                tabuleiro[linha][coluna] = jogadorAtual;
                jogadas++;

                if (verificaVitoria()) {
                    exibeTabuleiro();
                    System.out.println("Jogador " + jogadorAtual + " venceu!");
                    return; // Encerra o jogo
                }

                // Alterna o jogador
                jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
            } else {
                System.out.println("Jogada invalida. Tente novamente.");
            }
            
        }
        
        exibeTabuleiro();
        System.out.println("Empate!");
    }

    public static void main(String[] args) {
        JogoDaVelha jogo = new JogoDaVelha();
        jogo.iniciarJogo();
    }
}

