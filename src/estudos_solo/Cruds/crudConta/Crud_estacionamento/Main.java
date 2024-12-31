package estudos_solo.Cruds.crudConta.Crud_estacionamento;

import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Scanner dadoColetado = new Scanner(System.in);
        int opcao;
        RegistroVeiculo teste = new RegistroVeiculo();

        do{
            System.out.println("Bem vindo ao estacionamento");
            System.out.println("O que você deseja fazer?\n1. Adicionar veículo\n2. remover veículo\n3.listar veículos\n4. Editar veículos\n5. Buscar por id\n6. Sair");
            opcao = dadoColetado.nextInt();
            dadoColetado.nextLine();


            switch(opcao) {

                case 1:
                    System.out.println("\n\n\n");
                    teste.RegistrarVeiculo();
                break;

                case 2:
                    System.out.println("\n\n\n");
                    System.out.println("Digite o id do veículo:");
                    long idVerificacao = dadoColetado.nextLong();
                    teste.removerVeiculo(idVerificacao);
                    break;

                case 3:
                    System.out.println("\n\n\nLista de veículos:");
                    teste.listarVeiculo();
                break;

                case 4:
                    System.out.println("\n\n\n");
                    System.out.println("Digite o id do veículo:");
                    long idCarro = dadoColetado.nextLong();
                    teste.editarVeiculo(idCarro);
                break;

                case 5:
                    System.out.println("\n\n\n");
                    System.out.println("Busca por id:");
                    System.out.println("Digite o id do veiculo:");
                    long idVeiculo = dadoColetado.nextLong();
                    teste.buscarPorId(idVeiculo);
                    break;

                case 6:
                    System.out.println("Obrigado pela preferência e volte sempre!");
                break;

                default:
                    System.out.println("Opção inválida, digite um número de 1 a 5");
                break;
            }


        } while (opcao != 6);
        System.out.println("Fim do programa.");
    }
}
