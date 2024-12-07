package ESTUDOSSOLO.gerenciamentodetarefas;

import java.util.*;

public class GerenciadorTarefa {
    Scanner scan = new Scanner(System.in);
    List<Tarefa> tarefas = new ArrayList<>();
    //introduzindo dicionário através de tutorial
    //Map<String, String> dict = new HashMap<>();


    public void adicionarTarefa(Tarefa tarefa) {
        System.out.println("Digite o nome da tarefa:");
        tarefa = new Tarefa();

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
                t.descricaoTarefa();
                System.out.println("----------------------");
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

    public void removerTarefa(int id) {
        for (Tarefa t : tarefas) {
            boolean ehReal = false;
            if(t.getID() == id) {
                tarefas.remove(t);
                System.out.println("Tarefa removida com sucesso!");
                ehReal = true;
                break;
            }

            if(!ehReal) {
                System.out.println("A tarefa não existe.");
            }
        }
    }

    public void editarTarefa(int id) {
        boolean achouOId = false;


        for(Tarefa task : tarefas) {
            //fazendo a verificação do id para identificar a tarefa
            if(task.getID() == id) {
                System.out.println("Digite o novo título:");
                String novoTitulo = scan.nextLine();
                task.setTitulo(novoTitulo);

                System.out.println("Agora digite a nova descrição:");
                String novaDescricao = scan.nextLine();
                task.setDescricao(novaDescricao);

                System.out.println("Agora digite o status da tarefa:\n1.Pendente\n2.Em andamento\n3.Finalizada");
                String novoStatus = scan.nextLine();

                if(novoStatus.equals("1")) {
                    novoStatus = "Pendente";
                    task.setStatus(novoStatus);
                } else if(novoStatus.equals("2")) {
                    novoStatus = "Em andamento";
                    task.setStatus(novoStatus);
                } else if(novoStatus.equals("3")) {
                    novoStatus = "Finalizada";
                    task.setStatus(novoStatus);
                } else {
                    System.out.println("Opção inválida para status... Novo status nulo");
                    task.setStatus(null);
                }
                achouOId = true;
                break;
            }
        }

        if(!achouOId){
            System.out.println("Tarefa não encontrada!");
        }

    }


    //MÉTODO PARA EXIBIR MENU
    public void exibirMenu() {
        Tarefa tarefa = new Tarefa();
        boolean quebradorDeFluxo = true;



        do {
            int opcao;
            System.out.println("Bem vindo a sua TO-DO LIST:\nO que você deseja fazer?\n1. Adicionar tarefa\n2. Remover tarefa\n3. Listar tarefas\n4. Listar tarefa por id\n5.Editar tarefa por id\n6. Sair do programa\n");
            opcao = scan.nextInt();


            switch (opcao) {
                case 1:
                    System.out.println("Adicionando tarefa:");
                    System.out.println("Digite o nome do título da tarefa");
                    String tituloTarefa = scan.nextLine();
                    //criando duas instâncias
                    GerenciadorTarefa tarefinha = new GerenciadorTarefa();
                    Tarefa novaTarefa = new Tarefa(tituloTarefa);
                    tarefinha.adicionarTarefa(novaTarefa);
                break;

                case 2:
                    System.out.println("Removendo tarefa:");
                    System.out.println("Digite o id da tarefa:");
                    int id = scan.nextInt();
                    removerTarefa(id);
                break;

                case 3:
                    System.out.println("Lista de tarefas:");
                    listarTarefa();
                break;

                case 4:
                    System.out.println("Digite o id da tarefa que você deseja buscar:");
                    int idd = scan.nextInt();
                    listarTarefaPorId(idd);
                break;

                case 5:
                    System.out.println("Editar tarefa: Digite o id da tarefa que você deseja editar:");
                    int iddd = scan.nextInt();
                    editarTarefa(iddd);
                break;

                case 6:
                    System.out.println("Saindo...");
                    quebradorDeFluxo = false;
                break;

            }


        } while (quebradorDeFluxo != false);

        System.out.println("OBRIGADO POR UTILIZAR O PROGRAMA!");
    }



}
