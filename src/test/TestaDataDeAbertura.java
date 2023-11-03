package test;

import main.com.meli.javatest.conta.Conta;
import main.com.meli.javatest.data.Data;

public class TestaDataDeAbertura {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setNomeTitular("Joao");
        conta.setAgencia("1234");
        conta.setNumero(1234);
        conta.setSaldo(5000);

        Data data = new Data(1,11, 2023);
        conta.setDataAbertura(data);

        System.out.println(conta.calculaRendimento());

        System.out.println(conta.recuperarDadosParaImpressao());
    }
}
