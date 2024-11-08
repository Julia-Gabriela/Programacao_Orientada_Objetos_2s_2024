package Geometria;

abstract class Forma {
    public abstract String descrever();
}

abstract class Forma2D extends Forma {
    public abstract double calcularArea();
}

abstract class Forma3D extends Forma {
    public abstract double calcularArea();
    public abstract double calcularVolume();
}


class Circulo extends Forma2D {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public String descrever() {
        return "Círculo de raio " + raio;
    }
}

class Quadrado extends Forma2D {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public String descrever() {
        return "Quadrado de lado " + lado;
    }
}

class Esfera extends Forma3D {
    private double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return 4 * Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double calcularVolume() {
        return (4.0 / 3) * Math.PI * Math.pow(raio, 3);
    }

    @Override
    public String descrever() {
        return "Esfera de raio " + raio;
    }
}

class Cubo extends Forma3D {
    private double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return 6 * lado * lado;
    }

    @Override
    public double calcularVolume() {
        return Math.pow(lado, 3);
    }

    @Override
    public String descrever() {
        return "Cubo de lado " + lado;
    }
}
