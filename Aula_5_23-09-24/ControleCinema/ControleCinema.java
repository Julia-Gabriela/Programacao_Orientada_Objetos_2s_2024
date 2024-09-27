package ControleCinema;

import java.util.Scanner;

public class ControleCinema {
    public static void main(String[] args) {
        int[] lugares_vagos = {10, 2, 1, 3, 0}; 
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite o numero da sala (1 a 5) ou 0 para sair: ");
            int sala = scanner.nextInt();

            if (sala == 0) {
                System.out.println("Saindo do sistema.");
                break; 
            }

            if (sala < 1 || sala > 5) {
                System.out.println("Numero da sala invalido. Tente novamente.");
                continue; 
            }

            System.out.print("Digite a quantidade de lugares solicitados: ");
            int lugares_solicitados = scanner.nextInt();

            
            if (lugares_vagos[sala - 1] >= lugares_solicitados) {
                lugares_vagos[sala - 1] -= lugares_solicitados; 
                System.out.println("Bilhetes vendidos! Lugares restantes na sala " + sala + ": " + lugares_vagos[sala - 1]);
            } else {
                System.out.println("Nao ha lugares suficientes na sala " + sala + ". Disponiveis: " + lugares_vagos[sala - 1]);
            }
        }

        scanner.close(); 
    }
}

