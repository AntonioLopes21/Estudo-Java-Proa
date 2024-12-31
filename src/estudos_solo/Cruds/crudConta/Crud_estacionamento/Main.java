package estudos_solo.Cruds.crudConta.Crud_estacionamento;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        int opcao;
        Scanner dadoColetado = new Scanner(System.in);

        Map<RegistroVeiculo, TicketEstacionamento> ticketCadastrado = new HashMap<>();

        RegistroVeiculo veiculo = new RegistroVeiculo();
        TicketEstacionamento ticket = new TicketEstacionamento();

        do{
            System.out.println("Bem vindo ao estacionamento");
            System.out.println("O que você deseja fazer?\n1. Adicionar veículo\n2. remover veículo\n3.listar veículos\n4. Editar veículos\n5. Buscar por id\n6. Sair");
            opcao = dadoColetado.nextInt();
            dadoColetado.nextLine();


            switch(opcao) {

                case 1:
                    System.out.println("\n\n\n");
                    veiculo.RegistrarVeiculo();
                    System.out.println("Ticket registrado com sucesso.");
                    ticket.exibirTicketECarro();
                    ticketCadastrado.put(veiculo, ticket);
                break;

                case 2:
                    System.out.println("\n\n\n");
                    System.out.println("Digite o id do veículo:");
                    long idVerificacao = dadoColetado.nextLong();
                    veiculo.removerVeiculo(idVerificacao);

                    ticketCadastrado.remove(veiculo);
                    ticket.retiradaDeVeiculo();
                    break;

                case 3:
                    System.out.println("\n\n\nLista de veículos:");
                    veiculo.listarVeiculo();
                break;

                case 4:
                    System.out.println("\n\n\n");
                    System.out.println("Digite o id do veículo:");
                    long idCarro = dadoColetado.nextLong();
                    veiculo.editarVeiculo(idCarro);
                break;

                case 5:
                    System.out.println("\n\n\n");
                    System.out.println("Busca por id:");
                    System.out.println("Digite o id do veiculo:");
                    long idVeiculo = dadoColetado.nextLong();
                    veiculo.buscarPorId(idVeiculo);
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
