package estudos_solo.Cruds.crudConta.Crud_estacionamento;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class RegistroVeiculo {

    private double taxaDeEstacionamento = 5.0;
    private List<Carro> carros = new ArrayList<>();
    Scanner dadoColetado = new Scanner(System.in);


    public void RegistrarVeiculo() {
        //criando o objeto Carro para manipulação
        Carro novoCarro = new Carro();
        boolean placaVazia = true;
        boolean nomeVazio = true;
        boolean anoVazio = true;

        System.out.println("Adicionando veículo...");

        do {
            System.out.println("Digite o nome do veículo...");
            String nomeVeiculo = dadoColetado.nextLine();
            novoCarro.setNome(nomeVeiculo);
            nomeVazio = false;
            System.out.println("nome inserido");
        } while (nomeVazio == true);

        do {
            System.out.println("Digite o ano de fabricação...");
            int anoFabr = dadoColetado.nextInt();
            dadoColetado.nextLine();
            novoCarro.setAnoFabricacao(anoFabr);

            if(novoCarro.getAnoFabricacao() < 1990 || novoCarro.getAnoFabricacao() > 2025) {
                System.out.println("o ano é inválido, digite um ano entre 1990 e 2025");
            } else {
                placaVazia = false;
                System.out.println("ano inserido");
            }

        } while(placaVazia == true);


        do {
            System.out.println("Digite a placa do veículo: 3 letras e 4 números:");
            String plaquinha = dadoColetado.nextLine();
            novoCarro.setPlaca(plaquinha);
            placaVazia = false;
            System.out.println("placa inserida");
        } while(placaVazia == true);


        carros.add(novoCarro);

        System.out.println("Carro adicionado com sucesso!");
    }

    public void removerVeiculo(long id) {

        for(Carro carro : carros) {

            if(carro.getParteConvertidaUUID() == id) {
                System.out.println("Carro removido com sucesso");
                carros.remove(carro);
                break;
            } else {
                System.out.println("Veículo não encontrado!");
            }
        }

    }

    public void listarVeiculo() {

        if(carros.isEmpty()) {
            System.out.println("A lista está vazia!");
        } else {

            int contador = 0;
            for(Carro veiculo : carros) {
                contador = 1;

                System.out.println("==================================");
                veiculo.exibirInformacoesCarro();
                System.out.println("==================================");
                contador++;
            }
        }

    }

    public void editarVeiculo(long id) {
        for (Carro carro : carros) {
            if(carro.getParteConvertidaUUID() == id) {
                System.out.println("Editando veículo:");

                System.out.println("Digite o novo nome do veículo:");
                String novoNome = dadoColetado.nextLine();
                carro.setNome(novoNome);

                System.out.println("Digite a nova placa do veículo:");
                String novaPlaca = dadoColetado.nextLine();
                carro.setPlaca(novaPlaca);

                System.out.println("Digite o ano do veículo:");
                int novoAno = dadoColetado.nextInt(); dadoColetado.nextLine();
                if(novoAno > 2025 || novoAno < 1990) {
                    do {
                        System.out.println("Digite valores entre 1990 e 2025");
                        novoAno = dadoColetado.nextInt(); dadoColetado.nextLine();
                    } while (novoAno <1990 || novoAno > 2025);
                }
                carro.setAnoFabricacao(novoAno);
            }
        }
    }

    public void buscarPorId(long id) {
        for (Carro carro : carros) {
            if(carro.getParteConvertidaUUID() == id) {
                System.out.println("Carro encontrado!" + "\n");
                carro.exibirInformacoesCarro();
            }
        }
    }
}
