package aula03.OO.veiculos;

public class Aquaticos extends Veiculo{

    public String ambienteLocomocao;

    public Aquaticos() {

    }

    public Aquaticos(String marca, String modelo, int anoFabricacao, int qtdPortas,String ambienteLocomocao) {
        super(marca, modelo, anoFabricacao, qtdPortas);
        this.ambienteLocomocao = ambienteLocomocao;
    }

    public String getAmbienteLocomocao() {
        return ambienteLocomocao;
    }

    public void setAmbienteLocomocao(String ambienteLocomocao) {
        this.ambienteLocomocao = ambienteLocomocao;
    }


    @Override
    public void ondeAnda() {
        System.out.println("O veículo " + this.getMarca() + " está na água");
    }
}
