package CaixaDialogo;

// Imprimindo múltiplas linhas na caixa de diálogo
import javax.swing.JOptionPane;

public class Dialogo {
    public static void main(String[] args) {
        // pede para o usuário inserir o nome
        String nome = JOptionPane.showInputDialog("Qual seu nome? ");
        // exibe a mensagem para cumprimentar o usuário
        JOptionPane.showMessageDialog(null, "Bem Vindo ao Java, " + nome);

        String num1 = JOptionPane.showInputDialog("Digite um numero inteiro? ");

        String num2 = JOptionPane.showInputDialog("Digite um numero inteiro? ");
        //concatena o num1 e o num2 e depois com o texto
        JOptionPane.showMessageDialog(null, "Soma sem converter " + (num1+num2));

        //converte em inteiro 
        int num1Convertido = Integer.parseInt(num1);
        int num2Convertido = Integer.parseInt(num2);
        
        //faz a soma e concatena com o texto
        JOptionPane.showMessageDialog(null, "Soma apos converter " + (num1Convertido+num2Convertido));
    
    }
}