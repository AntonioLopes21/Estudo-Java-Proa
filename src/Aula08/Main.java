package Aula08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean decisao = true;

        System.out.println("Bem vindo ao banco X");

        System.out.println("qual o seu tipo de conta?\n1. corrente\n2. poupança");
        int tipoConta = scan.nextInt();

        if(tipoConta == 1) {
            Conta p1 = new ContaCorrente("Antônio Corrente", 0.0D, 1000);

            do {
                System.out.println("Conta corrente");
                System.out.println("1. depositar\n2. sacar\n3. imprimir extrato.\n4. sair");
                int resposta = scan.nextInt();

                switch (resposta) {
                    case 1:
                        System.out.println("Quanto você deseja depositar?");
                        double valorDeposito = scan.nextDouble();
                        p1.depositar(valorDeposito);
                    break;

                    case 2:
                        System.out.println("Quanto você deseja sacar?");
                        double valorSaque = scan.nextDouble();
                        p1.sacar(valorSaque);
                    break;

                    case 3:
                        System.out.println("Imprimir extrato:");
                        p1.imprimirExtrato();
                    break;

                    case 4:
                        System.out.println("Sair");
                        decisao = false;
                }


            } while (decisao);

        } else if(tipoConta == 2) {
            ContaPoupanca p2 = new ContaPoupanca("Antonio Poupança", 0.0D, 0.02);

            do {
                System.out.println("Conta Poupança");
                System.out.println("1. depositar\n2. sacar\n3. imprimir extrato.\n4. aplicar rendimento\n5. sair");
                int resposta = scan.nextInt();

                switch (resposta) {
                    case 1:
                        System.out.println("Quanto você deseja depositar?");
                        double valorDeposito = scan.nextDouble();
                        p2.depositar(valorDeposito);
                        break;

                    case 2:
                        System.out.println("Quanto você deseja sacar?");
                        double valorSaque = scan.nextDouble();
                        p2.sacar(valorSaque);
                        break;

                    case 3:
                        System.out.println("Imprimir extrato:");
                        p2.imprimirExtrato();
                        break;

                    case 4:
                        System.out.println("Aplicar rendimento");
                        p2.aplicarRendimento();
                    break;

                    case 5:
                        System.out.println("Obrigado por utilizar o sistema!");
                        decisao = false;
                    break;
                }


            } while (decisao);
        }
    }

}
