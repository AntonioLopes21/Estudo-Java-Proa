package estudos_solo.Cruds.crudConta.Crud_estacionamento;

import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Scanner dadoColetado = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("Bem vindo ao estacionamento");
            System.out.println("O que você deseja fazer?\n1. Adicionar veículo\n2. remover veículo\n3.listar veículos\n4. Editar veículos\n5. Sair");
            opcao = dadoColetado.nextInt();
            dadoColetado.nextLine();

            RegistroVeiculo teste = new RegistroVeiculo();

            switch(opcao) {

                case 1:
                    teste.RegistrarVeiculo();
                break;

                case 2:
                    System.out.println("Digite o id do veículo estacionado");
                    String idVeiculo = dadoColetado.nextLine();

                    try {
                        UUID idCarro = UUID.fromString(idVeiculo); // Converte a String para UUID
                        teste.removerVeiculo(idCarro); // Chama o método corretamente
                    } catch (IllegalArgumentException e) {
                        System.out.println("ID inválido. Certifique-se de inserir um UUID válido.");
                    }
                break;

                case 3:
                    System.out.println("Lista de veículos:");
                    teste.listarVeiculo();
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


        } while (opcao != 5);

    }
}
