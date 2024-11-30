package aula07;

import java.util.Scanner;

public class ContagemRegressiva {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor para iniciar a contagem regressiva:");
        int resposta = scan.nextInt();

        ContagemRegressiva contador = new ContagemRegressiva();
        contador.contagemRegressiva(resposta);
    }

    public void contagemRegressiva(int valor) {
        while(valor >=0) {
            System.out.println("Faltam " + valor + " segundos...");
            valor --;
        }
    }
}
