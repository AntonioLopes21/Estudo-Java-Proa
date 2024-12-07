package ESTUDOSSOLO.gerenciamentodetarefas;

public class Tarefa {
    private static int contadorId = 1;
    private int id;
    private String titulo;
    private String descricao;
    private String status;

    //construtores
    public Tarefa(){

    }

    public Tarefa(String titulo, String descricao) {
        this.id = contadorId++;
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = "pendente";
    }

    public static int getContadorId() {
        return contadorId;
    }

    public static void setContadorId(int contadorId) {
        Tarefa.contadorId = contadorId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    //métodos
    public void descricaoTarefa() {
        System.out.println("Id:"+ getID() + "\nTítulo:"+getTitulo() + "\nDescrição:"+getDescricao() +"\nStatus:" + getStatus());
    }
}
