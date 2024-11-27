package aula05ArrayList.exercicio1;

public class Main {
    public static void main(String[] args) {
        ReceitaBolo boloDeMurango = new ReceitaBolo("Bolo de Murangu", 50.34D);


        boloDeMurango.adicionar_ingredientes("Farinha");
        boloDeMurango.adicionar_ingredientes("Ovos");
        boloDeMurango.exibir_detalhes();
    }
}
