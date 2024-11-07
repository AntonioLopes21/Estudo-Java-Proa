package aula03.OO.animais;

public class Ave extends Animal {
    public int qtdPenas;
    public double tamanhoBico;

    public Ave(String nome, int idade, double tamanhoBico, int qtdPenas) {
        super(nome, idade);
        this.tamanhoBico = tamanhoBico;
        this.qtdPenas = qtdPenas;
    }

    public void voar() {
        System.out.println("A ave está voando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Ave emitiu um som");
    }
}
