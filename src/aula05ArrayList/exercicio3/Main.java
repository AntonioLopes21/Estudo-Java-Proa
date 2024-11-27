package aula05ArrayList.exercicio3;

public class Main {

    public static void main(String[] args) {
        CalculadoraSequencial calculadora = new CalculadoraSequencial();

        calculadora.adicionarValores(10.00);
        calculadora.adicionarValores(12.00);
        calculadora.retornarLista();

        calculadora.somarValores();
        calculadora.multiplicarValores();
        System.out.println(calculadora.ehVazia());
    }
}
