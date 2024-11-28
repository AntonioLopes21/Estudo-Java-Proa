package ESTUDOSSOLO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContadorVogais {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> vogais = new ArrayList<>();
        vogais.add("a");
        vogais.add("e");
        vogais.add("i");
        vogais.add("o");
        vogais.add("u");


        String fraes = "Eu fui procurar dentro to tom e me perdi na ilusao";

        System.out.println("Digite uma palavra ou frase:");
        String frase = scan.nextLine();
        int contador = 0;


        for(String palavra : vogais) {
            System.out.println(palavra);

            if(frase.contains(palavra)) {
                contador +=1;
                System.out.println("A frase contém Nº:" + contador + " vogais");

            }
        }


        scan.close();
    }
}
