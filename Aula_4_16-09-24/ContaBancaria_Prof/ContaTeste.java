package ContaBancaria_Prof;

import java.util.Scanner;

public class ContaTeste
{

	public static void main(String[] args)
	{
		double saldo, limite, valor;
		int numero;
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Qual número da conta: ");
		numero = entrada.nextInt();

		System.out.println("Qual valor do saldo: ");
		saldo = entrada.nextDouble();

		System.out.println("Quanto de limite: ");
		limite = entrada.nextDouble();

		ContaBancaria conta1 = new ContaBancaria(numero, saldo, limite);
		//ContaBancaria conta2 = new ContaBancaria(12346, 1000, 100);
		//ContaBancaria conta3 = new ContaBancaria(12347, 500, 1000);

		System.out.printf("O número de contas desse banco é %d\n", ContaBancaria.getNumContas());

		System.out.printf("A conta de %d foi criada com saldo de R$%.2f e limite de R$%.2f\n", conta1.getNumero(), conta1.getSaldo(), conta1.getLimite());

		int ope;

		while(true)
		{	
			
			System.out.println("Você quer 1-depositar ou 2-sacar: ");
			ope = entrada.nextInt();

			if (ope ==1)
			{
				System.out.println("Qual valor do depósito: ");
				valor = entrada.nextDouble();
			
				conta1.deposito(valor);
			}
			else if (ope ==2) 
			{
				System.out.println("Qual valor do saque: ");
				valor = entrada.nextDouble();
			
				conta1.saca(valor);
			}else
			{
				break;
			}
		}

		System.out.printf("A conta de %d foi criada com saldo de R$%.2f e limite de R$%.2f\n", conta1.getNumero(), conta1.getSaldo(), conta1.getLimite());
	}

}