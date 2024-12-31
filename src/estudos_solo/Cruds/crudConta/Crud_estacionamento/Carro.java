package estudos_solo.Cruds.crudConta.Crud_estacionamento;
import java.util.UUID;

public class Carro {

    private long parteConvertidaUUID;
    private String nome;
    private int anoFabricacao;
    private UUID id;
    private String placa;

    public Carro() {
        this.id = UUID.randomUUID();
        this.parteConvertidaUUID = id.getMostSignificantBits(); // Converte e armazena a parte significativa
    }

    public Carro(String nome, int anoFabricacao) {
        this.nome = nome;
        this.anoFabricacao = anoFabricacao;
        this.id = UUID.randomUUID(); // Gera um UUID único
        this.parteConvertidaUUID = Math.abs(id.getMostSignificantBits()); // Converte e armazena a parte significativa
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public long getParteConvertidaUUID() {
        return parteConvertidaUUID;
    }

    public void setParteConvertidaUUID(long parteConvertidaUUID) {
        this.parteConvertidaUUID = parteConvertidaUUID;
    }

    public void exibirInformacoesCarro() {
        System.out.format("Nome do veículo: %s\nano do veículo: %d\nPlaca de Número: %s\n", nome, anoFabricacao, placa + "\nID:" + getParteConvertidaUUID());
    }
}
