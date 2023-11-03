package main.com.meli.javatest.model.seguro;

import main.com.meli.javatest.interfaces.Tributavel;

public class SeguroDeVida implements Tributavel {
    private double valor;
    private String titular;
    private int numeroApolice;


    @Override
    public double getValorImposto() {
        return 42 + this.valor * 0.02;
    }

    public String recuperarDadosParaImpressao(){
        String dados = "\nTitular: " + this.titular;
        dados += "\nNúmero da Apolice: " + this.numeroApolice;
        dados += "\nValor do seguro: " + this.valor;
        dados += "\nTipo de Seguro: " + this.getTipo();
        return dados;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroApolice() {
        return numeroApolice;
    }

    public void setNumeroApolice(int numeroApolice) {
        this.numeroApolice = numeroApolice;
    }

    public String getTipo(){
        return "Seguro de Vida";
    }
}
