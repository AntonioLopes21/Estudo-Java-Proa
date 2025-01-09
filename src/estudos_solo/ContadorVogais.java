package estudos_solo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContadorVogais {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Character> vogais = new ArrayList<>();
        vogais.add('a');
        vogais.add('e');
        vogais.add('i');
        vogais.add('o');
        vogais.add('u');

        //para testes
        //String frases = "Eu fui procurar dentro to tom e me perdi na ilusao";

        System.out.println("Digite uma palavra ou frase:");
        String frase = scan.nextLine().toLowerCase();
        int contador = 0;

        if(frase.length() == 0) {
            System.out.println("A frase está vazia!");
        } else {

            for(char letras : frase.toCharArray()) {

                if (vogais.contains(letras)) {
                    contador ++;
                }

            }
        }
        System.out.println("A frase contém " +contador + " vogais");



        scan.close();
    }
}
