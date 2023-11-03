package test;

import main.com.meli.javatest.conta.Conta;
import main.com.meli.javatest.data.Data;
import main.com.meli.javatest.input.Evento;
import main.com.meli.javatest.conta.ManipuladorDeConta;

public class TestaContas {
    public static void main(String[] args) {
        ManipuladorDeConta manipuladorDeConta = new ManipuladorDeConta();
        Evento evento = new Evento(300);

        Conta conta = manipuladorDeConta.criarConta(evento);
        Data data = new Data(1, 11, 2012);

        System.out.println(conta.recuperarDadosParaImpressao());

    }
}
