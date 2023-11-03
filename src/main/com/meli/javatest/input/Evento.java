package main.com.meli.javatest.input;

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
            campoValores.put("saldo", sc.next());
            return validarDouble(campoValores.get("saldo"));
        } else if (atributo.equalsIgnoreCase("valor")) {
            System.out.print("Informe o valor: ");
            campoValores.put("valor", sc.next());
            return validarDouble(campoValores.get("valor"));
        } else {
            throw new IllegalArgumentException("O campo nao é compatível ao tipo de dado requerido");
        }
    }

    public int getInt(String atributo){
        if (atributo.equalsIgnoreCase("numero") ){
            System.out.print("Informe o número da conta: ");
            campoValores.put("numero", sc.next());
            return validarInt(campoValores.get("numero"));
        } else {
            throw new IllegalArgumentException("O campo nao é compatível ao tipo de dado requerido");
        }
    }

    public String getString(String atributo) {
        if (atributo.equalsIgnoreCase("titular")){
            System.out.print("Informe o nome do titular conta: ");
            campoValores.put("titular", sc.nextLine());
            return validarString(campoValores.get("titular"));
        } else if (atributo.equalsIgnoreCase("agencia")) {
            System.out.print("Informe a agência: ");
            campoValores.put("agencia", sc.nextLine());
            return validarString(campoValores.get("agencia"));
        } else {
            throw new IllegalArgumentException("O campo nao é compatível ao tipo de dado requerido");
        }
    }

    public double validarDouble(Object valor){
        if (valor instanceof Number){
            valor = ((Number) valor).doubleValue();
            return (double) valor;
        } else if (valor instanceof String){
            try {
                return Double.parseDouble((String) valor);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("O tipo de dado não é double");
            }
        } else{
            throw new IllegalArgumentException("O tipo de dado não é double");
        }
    }

    public int validarInt(Object valor){
        if (valor instanceof Number){
            valor = ((Number) valor).intValue();
            return ((Number) valor).intValue();
        } else if (valor instanceof String){
            try {
                return Integer.parseInt((String) valor);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("O tipo de dado não é inteiro");
            }
        } else{
            throw new IllegalArgumentException("O tipo de dado não é inteiro");
        }
    }

    public String validarString(Object string){
        if (string instanceof Number) {
            return String.valueOf((string));
        } else if (string instanceof String) {
            return (String) string;
        } else {
            throw new IllegalArgumentException("O tipo de dado não é uma string");
        }
    }
}
