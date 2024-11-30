package aula07;

import java.util.ArrayList;
import java.util.List;

//nunca executei o main dentro do da classe sem ser com a classe principal
//Não sei se é o boas práticas mas tenho certeza que não estou seguindo isso.
//estou só testando
class Executante {
    public static void main(String[] args) {
        Calculadora teste = new Calculadora();

        teste.subtrairValores(1D, 2D);
        teste.somarValores(2D, 3D);
        teste.dividirValores(5D, 5D);
        teste.multiplicarValores(2D, 5D);
    }
}

public class Calculadora {
    public Double valor1;
    public Double valor2;
    public List<Integer> numeros = new ArrayList<>();
    public String operacao;

    public Calculadora() {
    }

    public Calculadora(Double primeiroValor, Double segundoValor) {
        this.valor1 = primeiroValor;
        this.valor2 = segundoValor;
    }

    //para as respostas
    public void respostaCalculo (Double valor1, Double valor2) {
        if(operacao == "+") {
            System.out.println("Adição");
            somarValores(valor1, valor2);

        } else if(operacao == "-") {
            System.out.println("Subtração");
            subtrairValores(valor1, valor2);

        } else if(operacao == "/") {
            System.out.println("Divisão");
            dividirValores(valor1, valor2);

        } else if(operacao == "*") {
            System.out.println("Multiplicação");
            multiplicarValores(valor1, valor2);
        }
    }

    public void somarValores(Double v1, Double v2) {
        Double resultado = v1 + v2;

        System.out.println("A soma de " + v1 + " + " + v2 + " é "+ resultado);
    }

    public void subtrairValores(Double v1, Double v2) {
        Double resultado = v1 - v2;

        System.out.println("A subtração de " + v1 + " - " + v2 + " é "+ resultado);
    }

    public void multiplicarValores(Double v1, Double v2) {
        Double resultado = v1 * v2;

        System.out.println("A multiplicação de " + v1 + " x " + v2 + " é "+ resultado);
    }

    public void dividirValores(Double v1, Double v2) {
        Double resultado = v1 / v2;

        System.out.println("A subtração de " + v1 + " / " + v2 + " é "+ resultado);
    }



}




