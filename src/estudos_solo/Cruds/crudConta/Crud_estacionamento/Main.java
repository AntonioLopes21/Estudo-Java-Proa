package estudos_solo.Cruds.crudConta.Crud_estacionamento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner dadoColetado = new Scanner(System.in);
        boolean resposta = true;

        do{
            System.out.println("Bem vindo ao estacionamento");
            System.out.println("O que você deseja fazer?\n1. Adicionar veículo\n2. remover veículo\n3.listar veículos\n4. Editar veículos\n5. Sair");
            int opcao = dadoColetado.nextInt();
            dadoColetado.nextLine();


            switch(opcao) {

                case 1:
                    //criando o objeto Carro para manipulação
                    Carro novoCarro = new Carro();

                    System.out.println("Adicionando veículo...");

                    System.out.println("Digite o nome do veículo...");
                    String nomeVeiculo = dadoColetado.nextLine();
                    novoCarro.setNome(nomeVeiculo);

                    System.out.println("Digite o ano de fabricação...");
                    int anoFabr = dadoColetado.nextInt();
                    dadoColetado.nextLine();
                    novoCarro.setAnoFabricacao(anoFabr);
                    break;

                case 2:
                    System.out.println("O que você deseja fazer?\n1. Adicionar veículo\n2. remover veículo\n3.listar veículos\n4. Editar veículos\n5. Sair");
                break;

                case 3:
                    System.out.println("O que você deseja fazer?\n1. Adicionar veículo\n2. remover veículo\n3.listar veículos\n4. Editar veículos\n5. Sair");
                break;

                case 4:
                    System.out.println("O que você deseja fazer?\n1. Adicionar veículo\n2. remover veículo\n3.listar veículos\n4. Editar veículos\n5. Sair");
                break;

                case 5:
                    System.out.println("O que você deseja fazer?\n1. Adicionar veículo\n2. remover veículo\n3.listar veículos\n4. Editar veículos\n5. Sair");
                break;

                default:
                    System.out.println("O que você deseja fazer?\n1. Adicionar veículo\n2. remover veículo\n3.listar veículos\n4. Editar veículos\n5. Sair");
                break;
            }


        } while (resposta != true);

    }
}
