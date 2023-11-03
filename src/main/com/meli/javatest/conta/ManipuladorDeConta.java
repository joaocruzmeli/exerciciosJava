package main.com.meli.javatest.conta;


import main.com.meli.javatest.input.Evento;
import main.com.meli.javatest.data.Data;

public class ManipuladorDeConta {
    private Conta conta;
    public Conta criarConta(Evento evento){
        this.conta = new Conta();
        this.conta.setNomeTitular("Joao");
        this.conta.setNumero(1234);
        this.conta.setAgencia("1234");
        this.conta.setSaldo(5000);
        Data data = new Data(1,11,2023);
        this.conta.setDataAbertura(data);
        return conta;
    }

    public void deposita(Evento evento){
        double valorDigitado = evento.getDouble();
        this.conta.saca(valorDigitado);
    }

    public void saca(Evento evento){
        double valorDigitado = evento.getDouble();
        this.conta.saca(valorDigitado);
    }


}
