package Gato;
import javax.swing.JOptionPane;

public class Gato
{

	private String nome;
	//private String dataNasc;
	//private double peso;

	public Gato(String nome, String dataNasc, double peso)
	{
		this.nome = nome;	
		//this.dataNasc = dataNasc;
		//this.peso = peso;			
	}

	public void miar()
	{
		//System.out.println(this.nome + " miou!");
		JOptionPane.showMessageDialog(null,this.nome + " miou!" );
	}

	public void lamber()
	{
		//System.out.println(this.nome + " lambeu!");
		JOptionPane.showMessageDialog(null,this.nome + " lambeu!" );
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public String getNome()
	{
		return this.nome;
	}

}