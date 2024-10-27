package Lista2.Date;

public class Date {
    private int dia;
    private int mes;
    private int ano;

    private static final String[] NOMES_MESES = {
        "Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho",
        "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
    };

    private static final int[] DIAS_POR_MES = {
        31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    // Construtor para o formato mm/dd/yyyy
    public Date(int mes, int dia, int ano) {
        this.mes = mes;
        this.dia = dia;
        this.ano = ano;
    }

    // Construtor para o formato "nome do mes dia, ano"
    public Date(String nomeMes, int dia, int ano) {
        this.mes = encontrarMes(nomeMes);
        this.dia = dia;
        this.ano = ano;
    }

    // Construtor para o formato DDD YYYY
    public Date(int diasDoAno, int ano) {
        this.ano = ano;
        int diasAcumulados = 0;
        this.mes = 1;

        for (int i = 0; i < DIAS_POR_MES.length; i++) {
            int diasMes = DIAS_POR_MES[i];
            if (isAnoBissexto(ano) && i == 1) {
                diasMes = 29;
            }
            if (diasDoAno <= diasAcumulados + diasMes) {
                this.mes = i + 1;
                this.dia = diasDoAno - diasAcumulados;
                break;
            }
            diasAcumulados += diasMes;
        }
    }

    // Metodo para encontrar o numero do mes pelo nome
    private int encontrarMes(String nomeMes) {
        for (int i = 0; i < NOMES_MESES.length; i++) {
            if (NOMES_MESES[i].equalsIgnoreCase(nomeMes)) {
                return i + 1;
            }
        }
        return 1; // Retorna Janeiro por padrao se o mes nao for encontrado
    }

    // Metodo para verificar se o ano e bissexto
    private boolean isAnoBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    // Metodo para exibir no formato mm/dd/yyyy
    public String formatarPadrao() {
        return String.format("%02d/%02d/%d", mes, dia, ano);
    }

    // Metodo para exibir no formato "nome do mes dia, ano"
    public String formatarCompleto() {
        return String.format("%s %d, %d", NOMES_MESES[mes - 1], dia, ano);
    }

    // Metodo para exibir no formato DDD YYYY
    public String formatarDiaDoAno() {
        int diaDoAno = dia;
        for (int i = 0; i < mes - 1; i++) {
            diaDoAno += DIAS_POR_MES[i];
            if (i == 1 && isAnoBissexto(ano)) {
                diaDoAno += 1;
            }
        }
        return String.format("%03d %d", diaDoAno, ano);
    }

    public static void main(String[] args) {
        // Testes com diferentes construtores e formatos de data
        Date data1 = new Date(6, 12, 1992);
        Date data2 = new Date("Junho", 12, 1992);
        Date data3 = new Date(164, 1992);

        System.out.println("Formato mm/dd/yyyy:");
        System.out.println(data1.formatarPadrao());

        System.out.println("Formato 'nome do mes dia, ano':");
        System.out.println(data2.formatarCompleto());

        System.out.println("Formato DDD YYYY:");
        System.out.println(data3.formatarDiaDoAno());
    }
}
