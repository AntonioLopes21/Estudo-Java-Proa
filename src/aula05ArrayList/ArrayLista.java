package aula05ArrayList;

import aula04.desafio1.Livro;

import java.util.ArrayList;
import java.util.List;

public class ArrayLista {

    public static void main(String[] args) {
        ArrayList<String> times = new ArrayList<String>();

        //times.add("São Paulo");
        //times.get(0);
        //System.out.println(times);
        //times.size();
        //times.clear();
        //System.out.println(times);

        LivroLista livro = new LivroLista("Aprendendo Java", 2024);

        livro.adicionarAutor("Paulin");
        livro.adicionarAutor("Eráclitos");
        livro.adicionarCapitulo("O medo de paulin - Introdução");
        livro.adicionarCapitulo("Eraclito - Agradecimentos");

        livro.exibirInformacoes();

    }

}


class LivroLista {
    private String titulo;
    private int anoPublicacao;
    private List<String> autores;
    private List<String> caps;

    public LivroLista() {

    }

    public LivroLista(String titulo, int anoPublicacao) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.autores = new ArrayList<String>();
        this.caps = new ArrayList<String>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<String> getCaps() {
        return caps;
    }

    public void setCaps(List<String> caps) {
        this.caps = caps;
    }

    public List<String> getAutores() {
        return autores;
    }

    public void setAutores(List<String> autores) {
        this.autores = autores;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    // Métodos para adicionar capítulos
    public void adicionarCapitulo(String capitulo) {
        if (capitulo != null && !capitulo.isEmpty()) {
            caps.add(capitulo);
        } else {
            System.out.println("O capítulo não pode ser vazio.");
        }
    }


    // Métodos para adicionar autores
    public void adicionarAutor(String autor) {
        if (autor != null && !autor.isEmpty()) {
            autores.add(autor);
        } else {
            System.out.println("O autor não pode ser vazio.");
        }
    }
    // Método para exibir informações do livro
    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Ano de Publicação: " + anoPublicacao);
        System.out.println("Autores: " + String.join(", ", autores));
        System.out.println("Capítulos: " + String.join(", ", caps));
    }
}