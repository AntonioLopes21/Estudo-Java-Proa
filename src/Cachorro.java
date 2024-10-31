public class Cachorro {

    //atributos
    private int idade;
    private String nome;
    public Double peso;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    //construtores

    public Cachorro() {

    }

    public Cachorro(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }




    //getter e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    //métodos
    public void latir() {
        System.out.println(nome + "está latindo");
    }

    public void mostrarInformacoes() {
        System.out.println("Nome " + nome);
        System.out.println("Idade " + idade);
    }


}


