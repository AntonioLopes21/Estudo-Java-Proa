package aula04.desafio1;

import java.util.ArrayList;
import java.util.List;

class AlugarLivro {
    List<String> listaLivros = new ArrayList<>();

    Livro iracema = new Livro("Iracema", "Machado de Assis", "23/10/24", true);

}

public class Livro {
    private String titulo;
    private String autor;
    private String anoPublicacao;
    private boolean isDisponivel;
    
    public Livro () {
    }

    public Livro (String titulo, String autor, String anoPublicacao, boolean isDisponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.isDisponivel = true;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isDisponivel() {
        return isDisponivel;
    }

    public void setDisponivel(boolean disponivel) {
        isDisponivel = disponivel;
    }

    public String getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(String anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    //métodos
    public void emprestarLivro() {
        if(isDisponivel) {
            isDisponivel = false;
            System.out.println("O livro: " + titulo + " foi emprestado com sucesso!");
        } else {
            System.out.println("O livro: " + titulo + " já está emprestado e não pôde ser encontrado no momento.");
        }
    }

    public void devolverLivro() {
        isDisponivel = true;
        System.out.println("O livro: " + getTitulo() + " foi devolvido com sucesso");
    }

    public void listarLivro() {

    }


}
