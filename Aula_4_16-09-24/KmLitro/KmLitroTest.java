package KmLitro;

import java.util.Scanner;

public class KmLitroTest {
    public static void main(String[] args) {
        int km = 0, litros = 0;
        double consumoViagem, totalKm = 0, totalLitros = 0;
        char continuar = 'S';
        double consumoMedioTotal;

        Scanner input = new Scanner(System.in);

        while (continuar == 'S' || continuar == 's') {

            System.out.println("Digite os quilometros pecorridos");
            km = input.nextInt();

            System.out.println("Digite os litros consumidos");
            litros = input.nextInt();

           

            if (litros != 0) {
                consumoViagem = km / litros;
                System.out.printf("Consumo nesta viagem: %.2f Km/L\n", consumoViagem);

                totalKm += km;
                totalLitros += litros;

                System.out.println("Deseja inserir outra viagem?(S/N)");
                continuar = input.next().charAt(0);

            } else {
                System.out.println("O valor dos litros consumidos nao pode ser 0");
            }

        }

        System.out.printf("\nQuilometragem total: %.2f km", totalKm);
        System.out.printf("\nLitros consumidos: %.2f km", totalLitros);

        if (totalLitros != 0) {
            consumoMedioTotal = totalKm / totalLitros;
            System.out.printf("\nConsumo medio total: %.2f km/l", consumoMedioTotal);
        }
        input.close();
    }
}
