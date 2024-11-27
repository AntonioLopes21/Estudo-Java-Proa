package aula05ArrayList.exercicio2;

public class Main {
    public static void main(String[] args) {
        Curso cursoProgramacao = new Curso("DevEmDobro", 500.00);
        cursoProgramacao.alterarPreco(240.00);

        cursoProgramacao.adicionarAluno("Paulin da ZO");
        cursoProgramacao.adicionarAluno("Tonin Tornado");
        cursoProgramacao.adicionarDisciplina("Poo");
        cursoProgramacao.adicionarDisciplina("Estrutura de dados");

        cursoProgramacao.exibirInformacoes();

        cursoProgramacao.removerAluno("Paulin da ZO");
        cursoProgramacao.exibirInformacoes();



    }
}
