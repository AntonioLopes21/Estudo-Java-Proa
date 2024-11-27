package aula05ArrayList.exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private Double preco;
    private List<String> disciplinaLista = new ArrayList<>();
    private List<String> alunoLista = new ArrayList<>();

    public Curso () {}

    public Curso(String Nome, Double Preco) {
        this.nome = Nome;
        this.preco = Preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getAluno() {
        return alunoLista;
    }

    public void setAluno(List<String> aluno) {
        this.alunoLista = aluno;
    }

    public List<String> getDisciplina() {
        return disciplinaLista;
    }

    public void setDisciplina(List<String> disciplina) {
        this.disciplinaLista = disciplina;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }


    //metodos
    public void alterarPreco(Double novoPreco) {
        this.preco = novoPreco;
    }

    public void exibirInformacoes() {
        System.out.println("Nome:" + getNome());
        System.out.println("Preço:" + getPreco());
        System.out.println("Grade curricular:"+ disciplinaLista +"\n"+"Lista de alunos:" + alunoLista);
    }

    public void adicionarDisciplina(String novaDisciplina) {
        disciplinaLista.add(novaDisciplina);
    }

    public void adicionarAluno(String novoAluno) {
        alunoLista.add(novoAluno);
    }

    public void removerAluno(String alunoDeletado) {

        if(alunoLista.contains(alunoDeletado)) {
            alunoLista.remove(alunoDeletado.toLowerCase());
            System.out.println("O aluno foi removido com sucesso");
        } else {
            System.out.println("O aluno não existe na lista");
        }
    }

    public void quantidadeAlunos () {
        System.out.println("Número de alunos matriculados: " +alunoLista.size());
    }

 }
