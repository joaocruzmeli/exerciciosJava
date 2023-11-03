package main.com.meli.javatest.conta;

import java.util.HashMap;

public class BancoDeContas {
    private static HashMap<Integer, Conta> contas = new HashMap<>();

    public BancoDeContas(){

    }

    public static void adicionarConta(Conta conta) {
        contas.put(conta.getNumero(), conta);
    }

    public static Conta obterConta(int numero) {
        return contas.get(numero);
    }
}
