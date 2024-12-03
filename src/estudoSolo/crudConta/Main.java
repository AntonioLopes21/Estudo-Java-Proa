package estudoSolo.crudConta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ContaBancaria conta1 = new ContaBancaria("Paulo", 12343, 23.00);
        boolean resposta = true;



        do {
            System.out.println("1. Depositar\n2. Sacar\n3. verificar Saldo\n4. exibir detalhes da conta\n5. Alterar taxa do saque\n6. sair");
            int escolha = scan.nextInt();

            conta1.exibirMenu();
            switch (escolha) {
                case 1:
                    System.out.println("------------------------------");
                    System.out.println("Quanto você deseja depositar?");
                    double valor = scan.nextDouble();
                    conta1.depositarValor(valor);
                    System.out.println("------------------------------");
                    break;

                case 2:
                    System.out.println("------------------------------");
                    System.out.println("Quanto você deseja sacar?");
                    double saque = scan.nextDouble();
                    conta1.sacarValor(saque);
                    System.out.println("------------------------------");
                    break;

                case 3:
                    System.out.println("------------------------------");

                    System.out.println("Seu saldo:");
                    conta1.verificarSaldo();
                    System.out.println("------------------------------");

                break;

                case 4:
                    System.out.println("------------------------------");
                    System.out.println("Detalhes da sua conta:");
                    conta1.exibirDetalhesConta();
                    System.out.println("------------------------------");
                break;

                case 5:
                    System.out.println("Qual o valor da taxa de saque? em porcentagem");
                    double novaTaxa = scan.nextDouble();
                    conta1.alterarTaxaOperacao(novaTaxa);
                    break;

                case 6:
                    System.out.println("Obrigado e volte sempre!");
                    resposta = false;
                break;

                default:
                    System.out.println("------------------------------");
                    System.out.println("Opção inválida");
                    System.out.println("------------------------------");
                break;
            }


        } while (resposta);


    }
}
