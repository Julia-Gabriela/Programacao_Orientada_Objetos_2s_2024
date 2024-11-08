package Zoo;

// Classe abstrata para animais
abstract class Animal {
    protected String nome;
    protected int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public abstract void emitirSom();
}

// Classe para animais do tipo Mamífero
abstract class Mamifero extends Animal {
    protected String corPelagem;

    public Mamifero(String nome, int idade, String corPelagem) {
        super(nome, idade);
        this.corPelagem = corPelagem;
    }
}

// Classe para animais do tipo Ave
abstract class Ave extends Animal {
    protected double envergaduraAsas;

    public Ave(String nome, int idade, double envergaduraAsas) {
        super(nome, idade);
        this.envergaduraAsas = envergaduraAsas;
    }
}

// Interface que define comportamento de natação
interface Nadador {
    void nadar();
}

// Interface que define comportamento de voo
interface Voador {
    void voar();
}

// Classe Elefante que estende Mamifero
class Elefante extends Mamifero {
    public Elefante(String nome, int idade, String corPelagem) {
        super(nome, idade, corPelagem);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " emite um som de tromba!");
    }
}

// Classe Tigre que estende Mamifero
class Tigre extends Mamifero {
    public Tigre(String nome, int idade, String corPelagem) {
        super(nome, idade, corPelagem);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " ruge ferozmente!");
    }
}

// Classe Pinguim que estende Ave e implementa Nadador
class Pinguim extends Ave implements Nadador {
    public Pinguim(String nome, int idade, double envergaduraAsas) {
        super(nome, idade, envergaduraAsas);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " emite um som peculiar de pinguim!");
    }

    @Override
    public void nadar() {
        System.out.println(nome + " está nadando com agilidade!");
    }
}

// Classe Aguia que estende Ave e implementa Voador
class Aguia extends Ave implements Voador {
    public Aguia(String nome, int idade, double envergaduraAsas) {
        super(nome, idade, envergaduraAsas);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " emite um grito agudo!");
    }

    @Override
    public void voar() {
        System.out.println(nome + " está voando alto no céu!");
    }
}
