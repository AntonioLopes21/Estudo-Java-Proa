package Aula08;

import java.util.List;

public class ContaCorrente extends Conta{
    private double limiteCredito = 1000;


    public ContaCorrente() {

    }

    public ContaCorrente(String titular, double saldo, double limiteCredito)  {
        super(titular, saldo);
        this.limiteCredito = limiteCredito;
    }

    @Override
    public void sacar(double valorSaque) {
        if(valorSaque <= saldo) {
            String operacao = "Valor do saque:R$" + valorSaque;
            saldo -= valorSaque;
            extrato.add(operacao);
        }
        if(valorSaque > saldo && valorSaque <= (limiteCredito + saldo)) {
            System.out.println("Saque realizado com o crédito especial R$:" + (valorSaque - saldo));
            String operacao = "Saque com crédito especial:R$" + valorSaque;

            saldo = saldo - valorSaque;
            limiteCredito = limiteCredito - (valorSaque + saldo);

            System.out.println("result:" + (valorSaque));
            System.out.println("Limite:" + (valorSaque - (saldo + limiteCredito)));
            extrato.add(operacao);

        } else {
            System.out.println("Valor insuficiente sdsad");
        }
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
}
