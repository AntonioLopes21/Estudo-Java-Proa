package Aula08;

import java.util.ArrayList;
import java.util.List;

public class Conta {
    private String titular;
    protected double saldo = 0;
    protected List<String> extrato = new ArrayList<>();


    //CONSTRUTORES
    public Conta () {
    }


    public Conta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public Conta(String titular, double saldo, List<String> extrato) {
        this.titular = titular;
        this.saldo = saldo;
        this.extrato = extrato = new ArrayList<>();
    }



    //GETTERS AND SETTERS
    public List<String> getExtrato() {
        return extrato;
    }

    public void setExtrato(List<String> extrato) {
        this.extrato = extrato;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //MÉTODOS

    public void depositar(double valor) {
        saldo += valor;

        String operacao ="Depósito de:R$" + saldo;
        System.out.println("Depósito realizado com sucesso!");
        extrato.add(operacao);
    }

    public void sacar(double valorSaque) {

        if(valorSaque <= saldo) {
            saldo -= valorSaque;
            System.out.println("Saque realizado com sucesso!");
            String operacao = "Saque de:R$" + valorSaque;
            extrato.add(operacao);
        } else {
            System.out.println("Valor insuficiente para saque\nSaldo atual:" + this.saldo);
        }
    }

    public void verificarSaldo() {
        System.out.println("Saldo:" + this.saldo);
    }

    public void imprimirExtrato() {
        if(extrato.isEmpty()) {
            System.out.println("Conta de: "+titular);
            System.out.println("Você ainda não tem histórico de transferências ou saques.");
        }

        System.out.println("Conta de: "+titular);
        System.out.println("Extrato:");
        for(String operacao : extrato) {
            System.out.println(operacao);
        }
    }


}


