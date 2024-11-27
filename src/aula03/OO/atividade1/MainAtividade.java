package aula03.OO.atividade1;

public class MainAtividade {
    public static void main(String[] args) {

        Carro carrin = new Carro("Miata", "branco", 1990);
        System.out.println(carrin.getModelo());
        System.out.println(carrin.getAno());
        System.out.println(carrin.getCor() + "\n\n\n\n");

        carrin.apresentarCarro();

        Carro car = new Carro("Hayabusa", "Preto", 2023);
        car.apresentarCarro();
    }

}
