package Geometria;

public class GeometriaTest {
    public static void main(String[] args) {
        Forma[] formas = new Forma[4];
        formas[0] = new Circulo(5.0);
        formas[1] = new Quadrado(4.0);
        formas[2] = new Esfera(3.0);
        formas[3] = new Cubo(2.0);

        for (Forma forma : formas) {
            System.out.println(forma.descrever());

            if (forma instanceof Forma2D) {
                Forma2D formaBidimensional = (Forma2D) forma;
                System.out.println("Área: " + formaBidimensional.calcularArea());
            } else if (forma instanceof Forma3D) {
                Forma3D formaTridimensional = (Forma3D) forma;
                System.out.println("Área de superfície: " + formaTridimensional.calcularArea());
                System.out.println("Volume: " + formaTridimensional.calcularVolume());
            }
            System.out.println();
        }
    }
}

