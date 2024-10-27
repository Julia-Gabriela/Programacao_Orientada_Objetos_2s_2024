package Lista2.JogoDaVelha;

import java.util.Scanner;

public class TicTacToe {
    private enum CellValue { X, O, EMPTY }
    private final CellValue[][] board;
    private boolean isXTurn;

    // Construtor inicializa o tabuleiro com EMPTY e define X como o primeiro a jogar
    public TicTacToe() {
        board = new CellValue[3][3];
        isXTurn = true;
        initializeBoard();
    }

    // Inicializa o tabuleiro com celulas vazias
    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = CellValue.EMPTY;
            }
        }
    }

    // Exibe o tabuleiro no console
    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] == CellValue.EMPTY ? "-" : board[i][j]);
                if (j < 2) System.out.print(" | ");
            }
            System.out.println();
        }
    }

    // Metodo para realizar uma jogada
    public boolean makeMove(int row, int col) {
        if (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != CellValue.EMPTY) {
            System.out.println("Movimento invalido. Tente novamente.");
            return false;
        }

        board[row][col] = isXTurn ? CellValue.X : CellValue.O;
        isXTurn = !isXTurn; // Alterna turno
        return true;
    }

    // Verifica se ha uma vitoria
    public boolean checkWin() {
        for (int i = 0; i < 3; i++) {
            // Verifica linhas e colunas
            if (board[i][0] != CellValue.EMPTY && board[i][0] == board[i][1] && board[i][1] == board[i][2])
                return true;
            if (board[0][i] != CellValue.EMPTY && board[0][i] == board[1][i] && board[1][i] == board[2][i])
                return true;
        }
        // Verifica diagonais
        if (board[0][0] != CellValue.EMPTY && board[0][0] == board[1][1] && board[1][1] == board[2][2])
            return true;
        if (board[0][2] != CellValue.EMPTY && board[0][2] == board[1][1] && board[1][1] == board[2][0])
            return true;

        return false;
    }

    // Verifica se ha empate
    public boolean checkDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == CellValue.EMPTY) return false;
            }
        }
        return true;
    }

    // Retorna o jogador atual
    public String currentPlayer() {
        return isXTurn ? "X" : "O";
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Jogo da Velha!");
        game.printBoard();

        while (true) {
            System.out.printf("Jogador %s, faca sua jogada (linha e coluna): ", game.currentPlayer());
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (game.makeMove(row, col)) {
                game.printBoard();

                if (game.checkWin()) {
                    System.out.printf("Parabens! O jogador %s venceu!%n", game.currentPlayer().equals("X") ? "O" : "X");
                    break;
                } else if (game.checkDraw()) {
                    System.out.println("Empate! O jogo terminou sem vencedores.");
                    break;
                }
            }
        }
        scanner.close();
    }
}

