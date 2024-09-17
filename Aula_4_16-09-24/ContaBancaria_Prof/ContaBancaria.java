package ContaBancaria_Prof;

public class ContaBancaria
{

	private double saldo;
	private int numero;
	private double limite;
	private static int numContas = 0;

	
	public ContaBancaria(int numero, double saldo, double limite)
	{
		this.saldo = saldo;
		this.numero = numero;
		this.limite = limite;

		numContas++;
				
	}

	public void setNumero(int numero)
	{
		this.numero = numero;
	}
	
	public int getNumero()
	{
		return this.numero;
	}

	public void setSaldo(double saldo)
	{
		this.saldo = saldo;
	}

	public double getSaldo()
	{
		return this.saldo;
	}

	public void setLimite(double limite)
	{
		this.limite = limite;
	}

	public double getLimite()
	{
		return this.limite;
	}

	public void deposito(double valor)
	{
		if (valor >0)
			this.saldo += valor;
		else
			System.out.println("Deposito inválido!");
	}

	public void saca(double valor)
	{
		if (valor < this.saldo+this.limite)
			this.saldo -= valor;
		else
			System.out.println("Saldo insuficiente!");
	}

	public static int getNumContas()
	{
		return numContas;
	}

}