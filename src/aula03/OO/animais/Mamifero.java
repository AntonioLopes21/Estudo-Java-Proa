package aula03.OO.animais;

public class Mamifero extends Animal {

    public int qtdPeitos;

    public Mamifero(String nome, int idade, int qtdPeitos) {
        super(nome, idade);
        this.qtdPeitos = qtdPeitos;
    }

    @Override
    public void emitirSom() {
        System.out.println("Mamífero emitiu um som");
    }

 }
