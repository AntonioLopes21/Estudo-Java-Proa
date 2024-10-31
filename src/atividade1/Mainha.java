package atividade1;

public class Mainha {
    public static void main(String[] args) {

        Carro carrin = new Carro("Miata", "branco", 1990);
        System.out.println(carrin.getModelo());
        System.out.println(carrin.getAno());
        System.out.println(carrin.getCor() + "\n\n\n\n");

        carrin.apresentarCarro();
    }

}
