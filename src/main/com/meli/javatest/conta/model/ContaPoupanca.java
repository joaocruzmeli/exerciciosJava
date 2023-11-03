package main.com.meli.javatest.conta.model;

public class ContaPoupanca extends Conta{
    public String getTipo() {
        return super.getTipo() + " Poupança";
    }
}
