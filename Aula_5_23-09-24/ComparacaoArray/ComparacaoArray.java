package ComparacaoArray;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ComparacaoArray {

    public static void main(String[] args) {
        // Gera numeros aleatorios
        Random random = new Random();
        int[] numerosArray = new int[30000];
        int[] numerosLinked = new int[30000];
        
        // Preenche os arrays com numeros aleatorios
        for (int i = 0; i < 30000; i++) {
            int randomNumber = random.nextInt(100000);
            numerosArray[i] = randomNumber;
            numerosLinked[i] = randomNumber;
        }

        // Testando com ArrayList
        List<Integer> arrayList = new ArrayList<>();
        long inicioInsercaoArrayList = System.currentTimeMillis();
        for (int num : numerosArray) {
            arrayList.add(0, num);  // Adiciona na primeira posicao
        }
        long fimInsercaoArrayList = System.currentTimeMillis();
        System.out.println("Tempo de insercao na primeira posicao na ArrayList: " + (fimInsercaoArrayList - inicioInsercaoArrayList) + " ms");

        long inicioPercorreArrayList = System.currentTimeMillis();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i);  // Percorrendo usando get(indice)
        }
        long fimPercorreArrayList = System.currentTimeMillis();
        System.out.println("Tempo de percurso com get(indice) na ArrayList: " + (fimPercorreArrayList - inicioPercorreArrayList) + " ms");

        // Testando com LinkedList
        List<Integer> linkedList = new LinkedList<>();
        long inicioInsercaoLinkedList = System.currentTimeMillis();
        for (int num : numerosLinked) {
            linkedList.add(0, num);  // Adiciona na primeira posicao
        }
        long fimInsercaoLinkedList = System.currentTimeMillis();
        System.out.println("Tempo de insercao na primeira posicao na LinkedList: " + (fimInsercaoLinkedList - inicioInsercaoLinkedList) + " ms");

        long inicioPercorreLinkedList = System.currentTimeMillis();
        for (int i = 0; i < linkedList.size(); i++) {
            linkedList.get(i);  // Percorrendo usando get(indice)
        }
        long fimPercorreLinkedList = System.currentTimeMillis();
        System.out.println("Tempo de percurso com get(indice) na LinkedList: " + (fimPercorreLinkedList - inicioPercorreLinkedList) + " ms");
    }
}

