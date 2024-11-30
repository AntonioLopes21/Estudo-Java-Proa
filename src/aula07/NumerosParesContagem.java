package aula07;

import java.util.ArrayList;
import java.util.List;

public class NumerosParesContagem {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(9);
        numeros.add(10);


        NumerosParesContagem contagem = new NumerosParesContagem();


        contagem.contarNumerosPares(numeros);
    }

    public int contarNumerosPares(List<Integer> numeros) {
        int contadorPares = 0;


        for(int num : numeros) {
            if (num %2 == 0) {
                contadorPares += num;
            }

        }

        System.out.println("A soma de todos os pares é: " + contadorPares);
        return  contadorPares;
    }


}
