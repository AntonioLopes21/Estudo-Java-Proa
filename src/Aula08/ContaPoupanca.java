package Aula08;

public class ContaPoupanca extends Conta{
    private double rendimento = 0.02;

    public ContaPoupanca () {

    }

    public ContaPoupanca(String titular, double saldo, double rendimento) {
        super(titular, saldo);
        this.rendimento = rendimento;
    }


    public void aplicarRendimento() {
        double novoSaldo = saldo + (saldo * rendimento);
        saldo = novoSaldo;
        System.out.println("Você aplicou rendimento de: " + rendimento + "R$:"+novoSaldo);

        String resposta = "Rendimento aplicado:" + rendimento + " que gerou no valor de R$:" + novoSaldo;
        extrato.add(resposta);
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }
}
