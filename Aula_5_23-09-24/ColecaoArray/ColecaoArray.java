package ColecaoArray;

public class ColecaoArray {

    public static void main(String[] args) {

        int[] numeros = { 12, -2, 4, 8, 29, 45, 78, 36, -17, 2, 12, 8, 3, 3, -52 };

        int maiorNumero = numeros[0];
        int menorNumero = numeros[0];
        int somaNumerosNegativos = 0;
        int somaTotal = 0;
        int ocorrenciasPrimeiroNumero = 0;
        int primeiroNumero = numeros[0];
        int quantidadeElementos = numeros.length;

        System.out.println("Numeros pares no array:");
        for (int numero : numeros) {

            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
            if (numero < menorNumero) {
                menorNumero = numero;
            }

            if (numero < 0) {
                somaNumerosNegativos += numero;
            }

            if (numero == primeiroNumero) {
                ocorrenciasPrimeiroNumero++;
            }

            somaTotal += numero;

            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        }

        double mediaNumeros = (double) somaTotal / quantidadeElementos;

        System.out.println("\nMaior numero no array: " + maiorNumero);
        System.out.println("Menor numero no array: " + menorNumero);
        System.out.println(
                "Numero de ocorrencias do primeiro numero (" + primeiroNumero + "): " + ocorrenciasPrimeiroNumero);
        System.out.println("Media dos numeros no array: " + mediaNumeros);
        System.out.println("Soma dos numeros negativos no array: " + somaNumerosNegativos);
    }
}
