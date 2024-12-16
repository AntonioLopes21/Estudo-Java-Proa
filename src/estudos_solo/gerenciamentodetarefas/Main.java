package estudos_solo.gerenciamentodetarefas;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.String.valueOf;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        GerenciadorTarefa task = new GerenciadorTarefa();

        Tarefa tarefa1 = new Tarefa("Lavar a casa", "No dia de sábado eu quero lavar a casa");
        Tarefa tarefa2 = new Tarefa("Lavar o carro", "Lavar o carro no dia de sábado");

        GerenciadorTarefa teste = new GerenciadorTarefa();
        teste.exibirMenu();
        scan.close();


        //try {
        //    teste.exibirMenu();
        //} catch (InputMismatchException e) {
        //    System.out.println("erro"  + e);
        //}

        //testes :;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
        // Adicionando tarefas
        //task.adicionarTarefa(tarefa1);
        //task.adicionarTarefa(tarefa2);

        // Listando tarefas
        //System.out.println("\nListando todas as tarefas:");
        //task.listarTarefa();

        // Buscando tarefa por ID
        //System.out.println("\nBuscando tarefa por ID:");
        //task.listarTarefaPorId(1);

        // Listando novamente
        //System.out.println("\nLista atualizada:");
        //task.listarTarefa();

        // Editando tarefa
        //System.out.println("\nEditando tarefa:");
        //task.editarTarefa(1);


        // Listando após remover
        //System.out.println("\nLista final:");
        //task.listarTarefa();

        // Removendo tarefa
       // System.out.println("\nRemovendo tarefa:");
       // task.removerTarefa(1);
        //testes :;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

        scan.close();
    }
}
