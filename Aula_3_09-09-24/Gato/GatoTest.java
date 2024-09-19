package Gato;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class GatoTest
{
	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);

		Gato gatoDeBotas = new Gato("José", "07/09/2010", 0.5);
		System.out.printf("O nome do seu gato é: %s\n", gatoDeBotas.getNome());
		gatoDeBotas.miar();
		gatoDeBotas.lamber();

		//System.out.println("Qual nome do seu gato: ");
		//String texto = entrada.nextLine();

		String texto = JOptionPane.showInputDialog(null, "Qual nome do seu gato: ");

		gatoDeBotas.setNome(texto);
		System.out.printf("O nome do seu gato é: %s\n", gatoDeBotas.getNome());
		gatoDeBotas.miar();
		gatoDeBotas.lamber();
		
		entrada.close();
	}

}