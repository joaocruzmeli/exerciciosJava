package test;

import main.com.meli.javatest.conta.model.Conta;
import main.com.meli.javatest.conta.model.ContaCorrente;
import main.com.meli.javatest.conta.model.ContaPoupanca;

public class TestaTipoConta {
    public static void main(String[] args) {
        //Conta c = new Conta();
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();

        //Conta c2 = new Conta();
        Conta cc2 = new ContaCorrente();
        Conta cp2 = new ContaPoupanca();
    }
}
