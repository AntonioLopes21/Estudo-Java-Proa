package ESTUDOSSOLO.gerenciamentodetarefas;

import java.util.Scanner;

import static java.lang.String.valueOf;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        GerenciadorTarefa task = new GerenciadorTarefa();

        Tarefa tarefa = new Tarefa("Lavar a casa", "No dia de sábado eu quero lavar a casa");
        Tarefa tarefa2 = new Tarefa("Lavar o carro", "Lavar o carro no dia de sábado");

        //espera receber um objeto
        task.adicionarTarefa(tarefa);
        //System.out.println(tarefa+"\n\n\n");

        //tarefa.descricaoTarefa();

       // task.listarTarefa();
        task.adicionarTarefa(tarefa2);
        task.listarTarefaPorId(1);

        task.listarTarefa();




    }
}
