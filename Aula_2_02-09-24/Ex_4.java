import java.util.Scanner;


public class Ex_4 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int segundo;

        System.out.println("escreva os segundos:");
        segundo = input.nextInt();
        

        int minuto = segundo / 60;
        int hora = minuto / 60;
        int dia = hora / 24;

        System.out.printf("segundos: %d\n", segundo);
        System.out.printf("minutos: %d\n", minuto);
        System.out.printf("horas: %d\n", hora);
        System.out.printf("dias: %d\n", dia);
    }
}