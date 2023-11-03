package test;

import main.com.meli.javatest.model.conta.Conta;
import main.com.meli.javatest.model.conta.ContaPoupanca;

public class TestaDeposito {
    public static void main(String[] args) {
        Conta cp = new ContaPoupanca();
        try {
            cp.deposita(-100);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
