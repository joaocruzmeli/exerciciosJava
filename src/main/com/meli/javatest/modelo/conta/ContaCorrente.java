package main.com.meli.javatest.modelo.conta;

import main.com.meli.javatest.interfaces.Tributavel;

public class ContaCorrente extends Conta implements Tributavel {

    @Override
    public void saca(double valor) {
        if (valor <= 0) {
            System.out.println("O valor para o saque deve ser maior que R$0.00!");
        } else if (saldo >= valor) {
            this.saldo = this.saldo - (valor + 0.10);
            System.out.println("Saque de R$" + valor +  " realizado com sucesso! ");
        } else {
            throw new IllegalArgumentException("Saldo insuficiente!");
        }
    }

    public String getTipo(){
        return "Conta Corrente";
    }

    @Override
    public double getValorImposto() {
        return this.getSaldo() * 0.01;
    }
}
