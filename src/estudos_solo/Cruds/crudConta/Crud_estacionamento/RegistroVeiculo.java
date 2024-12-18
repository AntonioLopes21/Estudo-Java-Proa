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

        System.out.println("Adicionando veículo...");

        System.out.println("Digite o nome do veículo...");
        String nomeVeiculo = dadoColetado.nextLine();
        novoCarro.setNome(nomeVeiculo);

        System.out.println("Digite o ano de fabricação...");
        int anoFabr = dadoColetado.nextInt();
        dadoColetado.nextLine();
        novoCarro.setAnoFabricacao(anoFabr);

        carros.add(novoCarro);

        System.out.println("Carro adicionado com sucesso!");
    }

    public void removerVeiculo(UUID id) {
        Carro carroParaRemover = null;

        for(Carro carro : carros) {
            if(carro.getId().equals(id)) {
                carroParaRemover = carro;
                break;
            }
        }

        if (carroParaRemover != null) {
            carros.remove(carroParaRemover);
            System.out.println("Carro removido com sucesso!");
        } else {
            System.out.println("Carro com ID " + id + " não encontrado.");
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
                System.out.println("Carro Nº:" + contador + " " + veiculo);
                System.out.println("==================================");
                contador++;
            }
        }

    }
}
