package ProdutoImpar;

public class ProdutoImpar {
    public static void main(String[] args) {
        int mult = 1;

        for(int i = 1; i <= 15; i += 2 ){
            mult *= i;
        }
        System.out.printf("O produto dos numeros impares de 1 a 15 e igual a %d", mult);
    }
    
}
