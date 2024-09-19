package LimiteCredito;

import java.util.Scanner;

public class LimiteTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Limite cliente = new Limite();

        System.out.println("===================================");
        System.out.print("Numero da conta: \n");
        cliente.setNumConta(input.nextInt());

        System.out.print("Saldo no inicio do mes: \n");
        cliente.setSaldoInicial(input.nextInt());

        System.out.print("Total de todos os itens cobrados: \n");
        cliente.setDespesas(input.nextInt());

        System.out.print("Total de craeditos aplicados: \n");
        cliente.setTotalCredito(input.nextInt());

        System.out.print("Limite de credito autorizado: \n");
        cliente.setLimiteCredito(input.nextInt());

        System.out.println("===================================");
        System.out.println("Numero da conta: \n" + cliente.getNumConta());

        System.out.println("Novo Saldo: \n" + cliente.calcularNovoSaldo());
        System.out.println("===================================");
        if (cliente.limiteExcedido()) {
            System.out.println("Limite de credito excedido\n");
            System.out.println("===================================");
        } else {
            System.out.println("Limite de credito dentro dos parametros");
        }
        input.close();
    }

}
