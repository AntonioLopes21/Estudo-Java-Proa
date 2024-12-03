package estudoSolo.crudConta.tratamentoExcessoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcessaoIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int idade = 0;


        try {
                System.out.println("digite a sua idade:");
                idade = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Excessão disparada: Digite uma idade válída. String não é número. " + e);
            return;
        }

        if (idade < 0) {
            System.out.println("A idade não pode ser negativa.");
        } else {
            if (idade < 18) {
                System.out.println("Você não é maior de idade.");
            } else {
                System.out.println("Você é maior de idade.");
            }
        }


    }
}
