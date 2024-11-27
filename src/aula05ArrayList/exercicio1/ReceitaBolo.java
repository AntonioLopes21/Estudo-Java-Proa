package aula05ArrayList.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class ReceitaBolo {
    private String nome;
    private Double preco;
    private List<String>ingredientes = new ArrayList<>();

    public ReceitaBolo() {}

    public ReceitaBolo(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;

    }


    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> autores) {
        this.ingredientes = ingredientes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    //métodos
    public Double alterar_preco(double preco) {
        if(preco < 0) {
            System.out.println("O produto não pode ter preço negativo\nPreço inválido: ");
        }

        if(preco == 0) {
            System.out.println("o produto está de graça!!! preço: ");
        } else {
            System.out.println("Preço: ");
        }

        return preco;
    }
    //
    public void exibir_detalhes() {
        System.out.println(this.nome);
        System.out.println("Ingredientes:\n" + ingredientes);
    }
    //
    public void adicionar_ingredientes(String produto) {
        ingredientes.add(produto);
    }


}
