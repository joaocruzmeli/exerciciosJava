package main.com.meli.javatest.exception;

public class ValorInvalidoException extends RuntimeException{
    public ValorInvalidoException(double valor) {
        super("Valor inválido! R$" + valor);
    }
}
