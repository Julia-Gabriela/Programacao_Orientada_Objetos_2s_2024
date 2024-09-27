package TempoArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class TempoArrayList {

    public static void main(String[] args) {
        // Gera numeros aleatorios
        Random random = new Random();
        int[] numeros = new int[30000];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100000);
        }

        // Testando com ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        long inicioInsercaoArrayList = System.currentTimeMillis();
        for (int num : numeros) {
            arrayList.add(num);
        }
        long fimInsercaoArrayList = System.currentTimeMillis();
        System.out.println("Tempo de insercao na ArrayList: " + (fimInsercaoArrayList - inicioInsercaoArrayList) + " ms");

        long inicioBuscaArrayList = System.currentTimeMillis();
        for (int num : numeros) {
            arrayList.contains(num);
        }
        long fimBuscaArrayList = System.currentTimeMillis();
        System.out.println("Tempo de busca na ArrayList: " + (fimBuscaArrayList - inicioBuscaArrayList) + " ms");

        // Testando com HashSet
        HashSet<Integer> hashSet = new HashSet<>();
        long inicioInsercaoHashSet = System.currentTimeMillis();
        for (int num : numeros) {
            hashSet.add(num);
        }
        long fimInsercaoHashSet = System.currentTimeMillis();
        System.out.println("Tempo de insercao no HashSet: " + (fimInsercaoHashSet - inicioInsercaoHashSet) + " ms");

        long inicioBuscaHashSet = System.currentTimeMillis();
        for (int num : numeros) {
            hashSet.contains(num);
        }
        long fimBuscaHashSet = System.currentTimeMillis();
        System.out.println("Tempo de busca no HashSet: " + (fimBuscaHashSet - inicioBuscaHashSet) + " ms");
    }
}
