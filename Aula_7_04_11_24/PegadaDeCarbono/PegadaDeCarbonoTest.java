package PegadaDeCarbono;

import java.util.ArrayList;

public class PegadaDeCarbonoTest {
    public static void main(String[] args) {
        ArrayList<CarbonoCalculavel> listaCarbono = new ArrayList<>();

        // Criação de instâncias das classes
        Edificio edificio = new Edificio(4500, 250);
        Carro carro = new Carro(900, 2.5);
        Bicicleta bicicleta = new Bicicleta(120);

        // Adiciona as instâncias na lista
        listaCarbono.add(edificio);
        listaCarbono.add(carro);
        listaCarbono.add(bicicleta);

        // Itera sobre a lista e exibe a pegada de carbono de cada item
        for (CarbonoCalculavel item : listaCarbono) {
            System.out.println(item.toString());
            System.out.printf("Pegada de Carbono: %.2f kg CO2%n", item.calcularPegadaDeCarbono());
            System.out.println();
        }
    }
}

