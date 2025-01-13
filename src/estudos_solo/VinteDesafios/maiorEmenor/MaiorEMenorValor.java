package estudos_solo.VinteDesafios.maiorEmenor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaiorEMenorValor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> valores = new ArrayList<>();

        for(int contador = 0; contador < 5; contador ++) {
            System.out.println("Digite um valor");
            int valor = scan.nextInt();
            valores.add(valor);
            scan.nextLine();
        }

        int i = 0;
        for(int valor : valores) {
            i++;
            System.out.println("valor Nº:" + i);
        }

        System.out.println("O maior valor da lista é:" + valores);
    }
}
