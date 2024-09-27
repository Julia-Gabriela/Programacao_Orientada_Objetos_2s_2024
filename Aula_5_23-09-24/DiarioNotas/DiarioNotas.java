package DiarioNotas;

import java.util.ArrayList;

public class DiarioNotas {
    private String nomeCurso;
    private ArrayList<Integer> notas;

    public DiarioNotas(String nomeCurso) {
        this.nomeCurso = nomeCurso;
        this.notas = new ArrayList<>();
    }

    public void adicionarNota(int nota) {
        notas.add(nota);
    }

   
    public int obterMaiorNota() {
        int maior = notas.get(0);
        for (int nota : notas) {
            if (nota > maior) {
                maior = nota;
            }
        }
        return maior;
    }


    public int obterMenorNota() {
        int menor = notas.get(0);
        for (int nota : notas) {
            if (nota < menor) {
                menor = nota;
            }
        }
        return menor;
    }

   
    public double calcularMedia() {
        int soma = 0;
        for (int nota : notas) {
            soma += nota;
        }
        return (double) soma / notas.size();
    }

    
    public void exibirGraficoBarras() {
        System.out.println("Distribuicao de notas no grafico de barras:");
        for (int nota : notas) {
            System.out.print(nota + ": ");
            for (int i = 0; i < nota; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void exibirRelatorio() {
        System.out.println("Relatorio do curso: " + nomeCurso);
        System.out.println("Maior nota: " + obterMaiorNota());
        System.out.println("Menor nota: " + obterMenorNota());
        System.out.println("Media das notas: " + calcularMedia());
        exibirGraficoBarras();
    }
}

