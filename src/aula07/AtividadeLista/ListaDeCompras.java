package aula07.AtividadeLista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDeCompras {
    public List<String> lista = new ArrayList<>();
    public int qtdDeItens;

    public ListaDeCompras() {
    }

    void adicionarItem(String item) {
        if(lista.contains(item)) {
            System.out.println("o item já existe na lista!\n\n\n");
        } else {
            lista.add(item);
            qtdDeItens ++;
            System.out.println("O item foi adicionado com sucesso!\n\n\n");
        }

    }

    void removerItem(String item) {
        if(lista.contains(item)) {
            lista.remove(item);
            qtdDeItens --;
            System.out.println("Item removido com sucesso!\n\n\n");
        } else {
            System.out.println("Esse item não existe na lista\n\n\n");
        }
    }

    void listar() {
        if(lista.isEmpty()) {
            System.out.println("A lista está vazia\n\n\n");
        } else {
            System.out.println("Lista de itens:\n"+lista);
            System.out.println(qtdDeItens + " itens na lista\n\n\n");
        }
    }


    //funciona
    void exibirMenu() {
        System.out.println("O que você deseja fazer na sua lista de compras?");
        System.out.println("1. adicionar item\n2. remover item\n3.listar itens\n4. sair");
    }


    public static void main(String[] args) {
        boolean resposta = true;
        Scanner scan = new Scanner(System.in);

        ListaDeCompras teste = new ListaDeCompras();



        System.out.println("Bem vindo a sua lista de compras. Pressione qualquer tecla para prosseguir:\n");



        while (resposta){
            teste.exibirMenu();
            System.out.println("O que você deseja fazer?");
            int escolha = scan.nextInt();

            switch (escolha) {
                case 1 :
                    System.out.println("Digite o item que deseja selecionar:");
                    String item = scan.next();
                    teste.adicionarItem(item);
                break;

                case 2 :
                    System.out.println("Digite o item que deseja remover:");
                    String rem = scan.next();
                    teste.removerItem(rem);
                    break;

                case 3 :
                    System.out.println("Sua lista está assim:");
                    teste.listar();

                    break;

                case 4 :
                    System.out.println("Muito obrigado pela preferência!");
                    resposta = false;
                break;

                default:
                    System.out.println("Opção inválida. Escolha um número de 1 a 4");
                break;
            }

        }
        scan.close();
    }

}
