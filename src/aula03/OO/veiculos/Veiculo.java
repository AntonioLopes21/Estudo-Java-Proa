package aula03.OO.veiculos;

public class Veiculo {
    private int anoFabricacao;
    private String marca;
    private String modelo;
    private int qtdPortas;


    public Veiculo() {

    }


    //atividade professora pâmela - construtor apenas com essas info
    public Veiculo(String modelo, int anoFabricacao) {
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    public Veiculo(String marca, String modelo, int anoFabricacao, int qtdPortas) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.qtdPortas = qtdPortas;

    }

    //para marca
    public String getMarca() {
        return marca;
    }

    void setMarca(String marca) {
        this.marca = marca;
    }

    //construtor para modelo
    public String getModelo() {
        return modelo;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    //getters e setters de qtd portas
    public int getQtdPortas() {
        return qtdPortas;
    }

    void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    void ondeAnda() {
        System.out.println("O veículo " + this.marca + " esta andando");
    }

    void exibirInfo() {
        System.out.println("Modelo: " + this.getModelo() + "\nano:" + this.getAnoFabricacao());
    }

 }
