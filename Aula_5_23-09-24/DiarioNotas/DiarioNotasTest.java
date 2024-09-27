package DiarioNotas;

public class DiarioNotasTest {
    public static void main(String[] args) {
        // Criando um objeto da classe DiarioNotas
        DiarioNotas diario = new DiarioNotas("Ciencia da Computacao");

        // Atribuindo notas
        diario.adicionarNota(8);
        diario.adicionarNota(9);
        diario.adicionarNota(4);
        diario.adicionarNota(7);
        diario.adicionarNota(10);

        // Exibindo relatório completo
        diario.exibirRelatorio();
    }
}

