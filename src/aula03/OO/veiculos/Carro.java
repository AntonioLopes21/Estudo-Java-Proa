package aula03.OO.veiculos;

public class Carro extends Veiculo {

    public Carro(String modelo, int anoFabricacao) {
        super(modelo, anoFabricacao);
    }

    void exibirInfo() {
        System.out.println("Modelo: " + this.getModelo() + "\nano:" + this.getAnoFabricacao() + "\nPreço: R$150.000,00");
    }

}
