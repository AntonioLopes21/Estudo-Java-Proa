package aula03.OO.animais;

public class Animal {

    private String nome;
    private String cor;
    private int idade;


    public Animal() {

    }

    public Animal(String nome, String cor, int idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }


    public void emitirSom() {
        System.out.println("Animal fazendo som");
    }


}
