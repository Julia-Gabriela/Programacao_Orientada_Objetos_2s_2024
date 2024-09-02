
import java.util.Scanner;

public class ex_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String num;

        // Solicita ao usuário que insira um número de cinco dígitos
        System.out.println("Digite um numero de cinco digitos: ");
        num = input.nextLine();

        if (num.length() != 5) {
            System.out.println("O número deve ter exatamente cinco dígitos.");
        } else {
            // Separa e imprime os dígitos com três espaços entre eles
            for (int i = 0; i < num.length(); i++) {
                System.out.print(num.charAt(i));
                if (i < num.length() - 1) {
                    System.out.print("   ");
                }
            }

        }
    }
}
