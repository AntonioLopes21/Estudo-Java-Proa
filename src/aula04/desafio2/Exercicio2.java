package aula04.desafio2;

import java.util.ArrayList;
import java.util.List;

public class Exercicio2 {
    private List<Produto> quantidadeEstoque = new ArrayList<>();

    public static void main(String[] args) {

        Exercicio2 teste = new Exercicio2();

        Produto p1 = new Produto("ype", 10.20f);
        Produto p2 = new Produto("lava louças", 30.20f);


        teste.adicionarProduto(p1);
        teste.adicionarProduto(p2);
        teste.listarProduto();
        teste.removerProduto(p1);
        teste.listarProduto();


    }

    public void adicionarProduto(Produto obj) {
        quantidadeEstoque.add(obj);
        System.out.println("Produto adicionado com sucesso!");
    }

    public void removerProduto(Produto obj) {
        quantidadeEstoque.remove(obj);
        System.out.println("Produto removido com sucesso!");
    }

    public void listarProduto() {
        if(quantidadeEstoque.isEmpty()) {
            System.out.println("A lista está vazia");
        } else {
            for(Produto produto: quantidadeEstoque) {
                System.out.println("Produto: " + produto.getNome() + " Preço: " + produto.getPreco());
            }
        }
    }

    static class Produto {

        //variaveis
        private String nome;
        private float preco;


        //construtores
        public Produto() {

        }

        public Produto(String nome, float preco) {
            this.nome = nome;
            this.preco = preco;
        }


        //getters e setters - encapsulamento
        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }


        public float getPreco() {
            return preco;
        }

        public void setPreco(float preco) {
            this.preco = preco;
        }

        //métodos

    }
}


