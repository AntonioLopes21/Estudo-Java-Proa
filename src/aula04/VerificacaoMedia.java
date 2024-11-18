package aula04;

public class VerificacaoMedia {
    public static void main(String[] args) {
        Aluno al1 = new Aluno("al1", 0, 6, 6);
        al1.calcularMedia();
    }
}

class Aluno {
    private String nome;
    private Float nota1;
    private Float nota2;
    private Float nota3;

    public Aluno() {

    }

    public Aluno(String nome, float nota1, float nota2, float nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }


    public String getNome() {
        return nome;
    }

    public Float getNota1() {
        return nota1;
    }

    public void setNota1(Float nota1) {
        this.nota1 = nota1;
    }

    public Float getNota2() {
        return nota2;
    }

    public void setNota2(Float nota2) {
        this.nota2 = nota2;
    }

    public Float getNota3() {
        return nota3;
    }

    public void setNota3(Float nota3) {
        this.nota3 = nota3;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    public void calcularMedia() {
        //resultado que está sendo usado em dois métodos
        float media = (nota1 + nota2 + nota3) /3;

        if(media < 4) {
            exibirStatus("foi reprovado", media);
        } else if(media >=4 && media <7) {
            exibirStatus("está em recuperação", media);
        } else {
            exibirStatus("foi aprovado", media);
        }

    }

    public void exibirStatus(String mensagem,float media) {
        System.out.println("\nN1:"+nota1+"\nN2:"+nota2+"\nN3:"+nota3);
        System.out.println("O aluno " + nome + " " + mensagem + " com média:"+ media);
    }

}
