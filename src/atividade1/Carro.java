package atividade1;

public class Carro {
    private String modelo;
    private int ano;
    private String cor;


    public Carro () {

    }

    public Carro(String modelo, String cor, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }


    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }


//métodos
    public void apresentarCarro() {
        System.out.println("Apresentando o carro:");
        System.out.println("Carro de Modelo: " + this.modelo + " \nCarro de cor: " + this.cor + " \ncarro do ano: " + this.ano);

    }

}
