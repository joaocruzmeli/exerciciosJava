package test;

import main.com.meli.javatest.conta.model.Conta;
import main.com.meli.javatest.data.Data;

public class TestaConta {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setNomeTitular("joao");
        conta.setAgencia("1234");
        conta.setNumero(1234);
        conta.setSaldo(5000);
        conta.setDataAbertura(new Data(1, 11, 2023));

        conta.saca(200);
        System.out.println(conta.getSaldo());

        conta.deposita(300);
        System.out.println(conta.getSaldo());

        conta.calculaRendimento();
    }
}
