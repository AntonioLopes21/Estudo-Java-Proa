package aula05ArrayList.exercicio3;


import java.util.ArrayList;
import java.util.List;

public class CalculadoraSequencial {
    private List<Double> valores = new ArrayList<>();

    CalculadoraSequencial() {

    }

    public void adicionarValores(Double valor) {
        valores.add(valor);
        System.out.println("Valor inserido com sucesso!");
        retornarLista();

    }

    public int ehVazia() {
        if(valores.isEmpty()) {
            System.out.println("A lista está vazia!");
            return 1;
        }

        return 0;
    }

    public void retornarLista() {
        System.out.println(valores);
    }

    public Double somarValores() {
        Double soma = 0D;

        for(Double valor : valores) {
            soma += valor;
            System.out.println("Resultado da adição: "  +soma);
        }

        return soma;
    }

    public Double multiplicarValores() {
        Double multiplicacao = 1D;

        for(Double valor : valores) {
            multiplicacao *= valor;
            System.out.println("Resultado da multiplicação: " + multiplicacao);
        }

        return multiplicacao;
    }
}


