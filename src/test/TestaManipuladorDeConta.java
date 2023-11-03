package test;

import main.com.meli.javatest.conta.Conta;
import main.com.meli.javatest.data.Data;
import main.com.meli.javatest.input.Evento;
import main.com.meli.javatest.conta.ManipuladorDeConta;

public class TestaManipuladorDeConta {
    public static void main(String[] args) {
        ManipuladorDeConta manipuladorDeConta = new ManipuladorDeConta();
        Evento evento = new Evento();

        Conta conta = manipuladorDeConta.criarConta(evento);

        System.out.println(conta.recuperarDadosParaImpressao());

    }
}
