package ESTUDOSSOLO.gerenciamentodetarefas;

import java.util.*;

public class GerenciadorTarefa {
    Scanner scan = new Scanner(System.in);
    List<Tarefa> tarefas = new ArrayList<>();

    //introduzindo dicionário através de tutorial
    //Map<String, String> dict = new HashMap<>();


    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
        System.out.println("Tarefa adicionada com sucesso!");
        System.out.println("ID da tarefa:"+ tarefa.getID());

    }

    public void listarTarefa() {

        if(tarefas.isEmpty()) {
            System.out.println("A lista de tarefas está vazia!");
        } else {
            int contadorTarefa = 1;
            for (Tarefa t : tarefas) {
                System.out.println("Tarefa Nº:" + (contadorTarefa ++) + " " + t);
            }
        }
    }

    public void listarTarefaPorId(int id) {
        boolean tarefaEncontrada = false;

        for(Tarefa t : tarefas) {
            if(t.getID() == id) {
                System.out.println("\n\nTarefa encontrada!");
                t.descricaoTarefa();
                tarefaEncontrada = true;
                break;
            }
        }

        if(!tarefaEncontrada) {
            System.out.println("Tarefa não encontrada.");
        }
    }

    public void removerTarefa(Tarefa task) {
        if(tarefas.contains(task)) {
            tarefas.remove(task);
            System.out.println("Tarefa removida com sucesso!");
        } else {
            System.out.println("A tarefa não existe");
        }
    }



}
