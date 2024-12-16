package estudos_solo.Cruds.crudConta.Crud_estacionamento;

import java.util.UUID;


public class Carro {

    private String nome;
    private int anoFabricacao;
    private UUID id;

    public Carro() {
        this.id = UUID.randomUUID(); // Gera um ID único automaticamente
    }

    public Carro(String nome, int anoFabricacao) {
        this.nome = nome;
        this.anoFabricacao = anoFabricacao;
        this.id = UUID.randomUUID(); // Gera um ID único automaticamente
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
}
