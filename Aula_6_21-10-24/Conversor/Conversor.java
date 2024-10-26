import java.util.Scanner;

public class Conversor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha a conversao:");
            System.out.println("1. Celsius para Fahrenheit");
            System.out.println("2. Fahrenheit para Celsius");
            System.out.println("3. Sair");

            try {
                System.out.print("Opção: ");
                int opcao = Integer.parseInt(scanner.nextLine());

                if (opcao == 1) {
                    System.out.print("Digite a temperatura em Celsius: ");
                    double celsius = Double.parseDouble(scanner.nextLine());
                    double fahrenheit = (celsius * 9/5) + 32;
                    System.out.printf("Temperatura em Fahrenheit: %.2f°F%n", fahrenheit);

                } else if (opcao == 2) {
                    System.out.print("Digite a temperatura em Fahrenheit: ");
                    double fahrenheit = Double.parseDouble(scanner.nextLine());
                    double celsius = (fahrenheit - 32) * 5/9;
                    System.out.printf("Temperatura em Celsius: %.2f°C%n", celsius);

                } else if (opcao == 3) {
                    System.out.println("Encerrando o programa.");
                    continuar = false;

                } else {
                    System.out.println("Opção inválida. Tente novamente.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Erro: valor numerico invalido. Tente novamente.");
            }
        }

        scanner.close();
    }
}
