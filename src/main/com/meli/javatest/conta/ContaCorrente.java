package main.com.meli.javatest.conta;

public class ContaCorrente extends Conta{

    @Override
    public void saca(double valor) {
        if (valor <= 0) {
            System.out.println("O valor para o saque deve ser maior que R$0.00!");
        } else if (saldo >= valor) {
            this.saldo = this.saldo - (valor + 0.10);
            System.out.println("Saque de R$" + valor +  " realizado com sucesso! ");
        } else {
            throw new IllegalArgumentException("Saldo insuficiente!");
        }
    }

    public String getTipo(){
        return super.getTipo() + " Corrente";
    }
}
