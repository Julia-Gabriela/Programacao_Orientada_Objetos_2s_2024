package Date;
import javax.swing.JOptionPane;

public class DateTest {
    
    public static void main(String[] args) {

    String dia = JOptionPane.showInputDialog("Digite o dia? ");
    String mes = JOptionPane.showInputDialog("Digite o mes? ");
    String ano = JOptionPane.showInputDialog("Digite o ano? ");

    int diaConvertido = Integer.parseInt(dia);
    int mesConvertido = Integer.parseInt(mes);
    int anoConvertido = Integer.parseInt(ano);

    Date data = new Date (diaConvertido, mesConvertido, anoConvertido);

    JOptionPane.showMessageDialog(null, data.displayDate());
}
}
