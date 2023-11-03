package main.com.meli.javatest.entrada;

import main.com.meli.javatest.bancodedados.BancoDeContas;
import main.com.meli.javatest.interfaces.Tributavel;
import main.com.meli.javatest.modelo.conta.Conta;
import main.com.meli.javatest.modelo.conta.ContaCorrente;
import main.com.meli.javatest.modelo.seguro.SeguroDeVida;

import java.util.*;

public class Evento {
    private Scanner sc;
    private Object valor;
    private Map<String, Object> campoValores;
    
    public Evento(){
        campoValores = new HashMap<>();
        sc = new Scanner(System.in);
    }

    public double getDouble(String atributo) {
        if (atributo.equalsIgnoreCase("saldo")){
            System.out.print("Informe o saldo da conta: ");
            campoValores.put("saldo", sc.nextDouble());
            return (double) campoValores.get("saldo");
        } else if (atributo.equalsIgnoreCase("valorOperacao")) {
            System.out.print("Informe o valor: ");
            campoValores.put("valorOperacao", sc.nextDouble());
            return (double) campoValores.get("valorOperacao");
        } else if (atributo.equalsIgnoreCase("valor")) {
            System.out.print("Informe o valor: ");
            campoValores.put("valor", sc.nextDouble());
            return (double) campoValores.get("valor");
        } else {
            throw new IllegalArgumentException("O campo nao é compatível ao tipo de dado requerido");
        }
    }

    public int getInt(String atributo){
        if (atributo.equalsIgnoreCase("numero") ){
            System.out.print("Informe o número da conta: ");
            campoValores.put("numero", sc.nextInt());
            sc.nextLine();
            return (int) campoValores.get("numero");
        } else if (atributo.equalsIgnoreCase("numeroApolice")) {
            System.out.print("Informe o número do apolice: ");
            campoValores.put("numeroApolice", sc.nextInt());
            sc.nextLine();
            return (int) campoValores.get("numeroApolice");
        } else {
            throw new IllegalArgumentException("O campo nao é compatível ao tipo de dado requerido");
        }
    }

    public String getString(String atributo) {
        if (atributo.equalsIgnoreCase("titular")){
            System.out.print("Informe o nome do titular conta: ");
            campoValores.put("titular", sc.nextLine());
            return (String) campoValores.get("titular");
        } else if (atributo.equalsIgnoreCase("agencia")) {
            System.out.print("Informe a agência: ");
            campoValores.put("agencia", sc.nextLine());
            return (String) campoValores.get("agencia");
        } else if (atributo.equalsIgnoreCase("tipo")) {
            System.out.println("Informe o tipo da conta: (Corrente ou Poupanca) ");
            System.out.print("Digite (Corrente ou Poupança): ");
            campoValores.put("tipo", sc.nextLine().toLowerCase());
            return (String) campoValores.get("tipo");
        } else {
            throw new IllegalArgumentException("O campo nao é compatível ao tipo de dado requerido");
        }
    }

    public Conta getDestino(String atributo){
        if (atributo.equalsIgnoreCase("destino")){
            System.out.print("Informe o número da conta a transferir: ");
            campoValores.put("destino", sc.nextInt());
            return BancoDeContas.obterConta((Integer) campoValores.get("destino"));
        }
        throw new IllegalArgumentException("O campo nao é compatível ao tipo de dado requerido");
    }

    public List<Tributavel> getListaTributaveis(String atributo){
        if (atributo.equalsIgnoreCase("listaTributaveis")){
            System.out.print("Informe o número da conta a transferir: ");
            List<Object> listaTributaveis = new ArrayList<>();
            listaTributaveis.add(new ContaCorrente());
            listaTributaveis.add(new SeguroDeVida());
            campoValores.put("listaTributaveis", listaTributaveis);
            return (List<Tributavel>) campoValores.get("listaTributaveis");
        }
        throw new IllegalArgumentException("O campo nao é compatível ao tipo de dado requerido");
    }

}
