package ContaBancaria;
import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        
        String nome;
        int numConta, agencia;
        

        Scanner input = new Scanner(System.in);
        
        System.out.println("===================================\n");

        System.out.println("Digite seu nome\n");
        nome = input.nextLine();
        System.out.println("Digite o numero da conta\n");
        numConta = input.nextInt();
        System.out.println("Digite o numero da agencia(Sem digitos)\n");
        agencia = input.nextInt();
        
        System.out.println("===================================\n");

        ContaBancaria conta = new ContaBancaria(nome, numConta, agencia, 0);
        
        int opcao = 0;

        while(opcao !=3){
            System.out.printf("Bem vindo(a) %s!!!\n", conta.getNome());
            System.out.println("===================================\n");
            System.out.printf("Numero da conta: %d\n", conta.getNumConta());
            System.out.printf("Agencia: %d\n", conta.getAgencia());
            System.out.printf("Saldo: %.2f\n", conta.getSaldo());
            System.out.println("===================================\n");
            System.out.println("Digite a opcao desejada\n");
            System.out.println("===================================\n");
            System.out.println("1 - Desposito\n");
            System.out.println("2 - Saque\n");
            System.out.println("3 - sair\n");
            opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("===================================\n");
                    System.out.println("Digite o valor que deseja depositar\n");
                    conta.depositar(input.nextDouble());

                    System.out.printf("Saldo: %.2f\n", conta.getSaldo());
                    break;
            
                case 2:
                    System.out.println("===================================\n");
                    System.out.println("Digite o valor que deseja sacar\n");
                    conta.sacar(input.nextDouble());

                    System.out.printf("Saldo: %.2f\n", conta.getSaldo());
                    break;
                default:
                    System.out.println("Obrigado!!!\n Seu dinheiro e nossa alegria!!\n");

                    break;
            }
        }
        input.close();
    }
}
