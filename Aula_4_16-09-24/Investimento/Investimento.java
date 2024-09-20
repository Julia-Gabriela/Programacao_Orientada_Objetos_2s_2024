package Investimento;

public class Investimento {
    public static void main(String[] args) {
        
        double principal = 1000.0;
        double taxaDeJuros = 0.05;
        int anos = 10;

        
        System.out.printf("%-4s %20s%n", "Ano", "Quantia em deposito");

       
        for (int n = 1; n <= anos; n++) {
            double quantia = principal * Math.pow(1 + taxaDeJuros, n);
            System.out.printf("%-4d %8.2f%n", n, quantia);
        }
    }
}