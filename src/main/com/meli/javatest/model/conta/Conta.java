package main.com.meli.javatest.model.conta;

import main.com.meli.javatest.exception.ValorInvalidoException;
import main.com.meli.javatest.model.data.Data;

public abstract class Conta {
    private String nomeTitular;
    private int numero;
    private String agencia;
    protected double saldo;
    private Data dataAbertura;
    private int identificador;
    private static int contador = 0;

    public Conta() {
        contador += 1;
        this.identificador = contador;
    }

    public Conta(String nomeTitular){
        contador += 1;
        this.identificador = contador;
        this.nomeTitular = nomeTitular;
    }

    public void saca(double valor) {
        if (valor <= 0) {
            System.out.println("O valor para o saque deve ser maior que R$0.00!");
        } else if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor +  " realizado com sucesso! ");
        } else {
            throw new IllegalArgumentException("Saldo insuficiente!");
        }
    }

    public void deposita(double valor){
        if (valor > 0 ){
            this.saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
        }
        else {
            throw new ValorInvalidoException(valor);
        }
    }

    public void transfere(double valor, Conta conta){
        this.saca(valor);
        conta.deposita(valor);
    }

    public double calculaRendimento(){
        return this.saldo * 0.1;
    }

    public String recuperarDadosParaImpressao(){
        String dados = "\nTitular: " + this.nomeTitular;
        dados += "\nNúmero: " + this.numero;
        dados += "\nAgência: " + this.agencia;
        dados += "\nSaldo R$: " + this.saldo;
        dados += "\nData de abertura: " + this.dataAbertura.retornaFormatada();
        dados += "\nTipo da Conta: " + this.getTipo();
        return dados;
    }

    public abstract String getTipo();

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Data getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Data dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public int getIdentificador() {
        return identificador;
    }
}
