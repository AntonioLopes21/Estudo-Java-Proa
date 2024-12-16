package estudos_solo.Cruds.crudConta;

public class ContaBancaria {

    private int numeroDaConta;
    private String titular;
    private double saldo;
    static double taxaOperacao = 0.10;

    public ContaBancaria () {}

    public ContaBancaria (String titular, int numeroDaConta, double saldo) {
        this.titular = titular;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }
    //
    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
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

    public static double getTaxaOperacao() {
        return taxaOperacao;
    }

    public static void setTaxaOperacao(double taxaOperacao) {
        ContaBancaria.taxaOperacao = taxaOperacao;
    }

    public void verificarSaldo() {
        System.out.println(this.saldo);
    }


    public void exibirMenu() {
        System.out.println("Qual operação você deseja realizar?");
        System.out.println("1. Depositar\n2. Sacar\n3. verificar Saldo\n4. exibir detalhes da conta\n5.Alterar taxa de operação\n6. sair");
    }

    public void depositarValor(double valor) {
        double taxa = valor * taxaOperacao;
        this.saldo += valor - taxa;
        System.out.println("Depósito de: " + valor + " realizado com sucesso.");
        System.out.println("Taxa aplicada: " + taxa);
        System.out.println("Saldo atual: " + String.format("R$ %.2f", this.saldo));
    }

    public void sacarValor(double valor) {
        double taxa = valor * taxaOperacao; // Calcula a taxa sobre o valor do saque
        if (valor + taxa > this.saldo) {
            System.out.println("Saldo insuficiente para a transação.");
            verificarSaldo();
        } else {
            this.saldo -= (valor + taxa); // Subtrai o saque e a taxa
            System.out.println("Saque realizado com sucesso.");
            System.out.println("Valor sacado: " + valor);
            System.out.println("Taxa aplicada: " + taxa);
            System.out.println("Saldo atual: " + String.format("R$ %.2f", this.saldo));
        }
    }

    public void exibirDetalhesConta() {
        System.out.println("Nome do titular:" + this.titular);
        System.out.println("Número da conta:" + this.numeroDaConta);
        System.out.println("Saldo:" + this.saldo);
    }

    public void alterarTaxaOperacao (double novaTaxa) {
        taxaOperacao = novaTaxa/100;
        System.out.println("Taxa de operação alterada!");
        System.out.println(taxaOperacao);
    }


}
