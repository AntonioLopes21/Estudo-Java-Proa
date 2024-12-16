package estudos_solo.Cruds.crudConta.Crud_estacionamento;


import java.util.List;
import java.util.Scanner;

public class RegistroVeiculo {


    Scanner registro = new Scanner(System.in);

    private List<Carro> carros;

    public void RegistrarVeiculo() {
        Carro carro = new Carro();

        System.out.println("Digite o nome do seu veículo");
        String nomeVeiculo = registro.nextLine();


    }
}
