import org.w3c.dom.ls.LSOutput;


public class Main {
    public static void main(String[] args) {


        Cachorro chupeta = new Cachorro("Corretivo", 21, 5.70);
        Cachorro doguinho = new Cachorro();
        doguinho.setNome("Paulo");
        doguinho.setIdade(21);
        doguinho.peso = 2.50;

        System.out.println(doguinho.getNome());
        System.out.println(doguinho.getNome() + " tem " + doguinho.getIdade() + " anos");
        System.out.println(doguinho.getIdade() + " pesa " + doguinho.peso + " quilos");
    }


}