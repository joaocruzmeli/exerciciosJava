package test;

import main.com.meli.javatest.conta.Conta;
import main.com.meli.javatest.conta.ContaCorrente;
import main.com.meli.javatest.conta.ContaPoupanca;
import main.com.meli.javatest.input.Evento;
import main.com.meli.javatest.conta.ManipuladorDeConta;

public class TestaContas {
    public static void main(String[] args) {
        Evento evento = new Evento();

        ManipuladorDeConta manipuladorDeConta1 = new ManipuladorDeConta();
        Conta c1 = manipuladorDeConta1.criarConta(evento);

        ManipuladorDeConta manipuladorDeConta2 = new ManipuladorDeConta();
        Conta c2 = manipuladorDeConta2.criarConta(evento);

        manipuladorDeConta1.deposita(evento);
        manipuladorDeConta2.deposita(evento);

        System.out.println(c1.getSaldo());
        System.out.println(c2.getSaldo());

        manipuladorDeConta1.saca(evento);
        manipuladorDeConta2.saca(evento);

        System.out.println(c1.getSaldo());
        System.out.println(c2.getSaldo());

        manipuladorDeConta1.transfere(evento);

        System.out.println(c1.getSaldo());
        System.out.println(c2.getSaldo());

        System.out.println(c1.recuperarDadosParaImpressao());
        System.out.println(c2.recuperarDadosParaImpressao());

    }
}
