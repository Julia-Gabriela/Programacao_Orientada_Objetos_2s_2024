package PegadaDeCarbono;


public interface CarbonoCalculavel {
    double calcularPegadaDeCarbono();
}

class Edificio implements CarbonoCalculavel {
    private double consumoEletricidade; 
    private double consumoGas;          

    public Edificio(double consumoEletricidade, double consumoGas) {
        this.consumoEletricidade = consumoEletricidade;
        this.consumoGas = consumoGas;
    }

    @Override
    public double calcularPegadaDeCarbono() {
        double emissaoEletricidade = consumoEletricidade * 0.5;
        double emissaoGas = consumoGas * 2.0;
        return emissaoEletricidade + emissaoGas;
    }

    @Override
    public String toString() {
        return String.format("Edifício com eletricidade: %.2f kWh e gás: %.2f m³", 
                             consumoEletricidade, consumoGas);
    }
}

class Carro implements CarbonoCalculavel {
    private double litrosCombustivel;   
    private double emissaoPorLitro;     

    public Carro(double litrosCombustivel, double emissaoPorLitro) {
        this.litrosCombustivel = litrosCombustivel;
        this.emissaoPorLitro = emissaoPorLitro;
    }

    @Override
    public double calcularPegadaDeCarbono() {
        return litrosCombustivel * emissaoPorLitro;
    }

    @Override
    public String toString() {
        return String.format("Carro com combustível: %.2f L e emissão: %.2f kg CO2/L", 
                             litrosCombustivel, emissaoPorLitro);
    }
}

class Bicicleta implements CarbonoCalculavel {
    private double distancia;

    public Bicicleta(double distancia) {
        this.distancia = distancia;
    }

    @Override
    public double calcularPegadaDeCarbono() {
        return distancia * 0.05; 
    }

    @Override
    public String toString() {
        return String.format("Bicicleta com quilometragem: %.2f km", distancia);
    }
}

