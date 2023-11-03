package main.com.meli.javatest.conta;


import main.com.meli.javatest.input.Evento;
import main.com.meli.javatest.data.Data;

import java.time.LocalDate;

public class ManipuladorDeConta {
    private Conta conta;
    public Conta criarConta(Evento evento){
        String tipo = evento.getString("tipo");
        if (tipo.equalsIgnoreCase("Corrente")) {
            this.conta = new ContaCorrente();
        } else if (tipo.equalsIgnoreCase("Poupança")) {
            this.conta = new ContaPoupanca();
        }
        this.conta.setNomeTitular(evento.getString("titular"));
        this.conta.setAgencia(evento.getString("agencia"));
        this.conta.setNumero(evento.getInt("numero"));
        this.conta.setSaldo(0);
        Data data = new Data(LocalDate.now().getDayOfMonth(), LocalDate.now().getMonthValue(), LocalDate.now().getYear());
        this.conta.setDataAbertura(data);
        return conta;
    }

    public void deposita(Evento evento){
        double valorDigitado = evento.getDouble("valorOperacao");
        this.conta.deposita(valorDigitado);
    }

    public void saca(Evento evento){
        double valorDigitado = evento.getDouble("valorOperacao");
        this.conta.saca(valorDigitado);
    }
}
