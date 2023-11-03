public class Conta {
    public String nomeTitular;
    public int numero;
    public String agencia;
    public double saldo;
    public Data dataAbertura;

    public Conta() {

    }

    public void saca(double valor) {
        if (valor <= 0) {
            System.out.println("O valor para o saque deve ser maior que R$0.00!");
        } else if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor +  " realizado com sucesso! ");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void deposita(double valor){
        if (valor > 0 ){
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
        }
        else {
            System.out.println("O valor para o depósito deve ser maior que R$0,00!");
        }
    }

    public double calculaRendimento(){
        return saldo * 0.1;
    }

    public String recuperarDadosParaImpressao(){
        String dados = "\nTitular: " + this.nomeTitular;
        dados += "\nNúmero da conta: " + this.numero;
        dados += "\nAgência: " + this.agencia;
        dados += "\nSaldo R$: " + this.saldo;
        dados += "\nData de abertura: " + this.dataAbertura.retornaFormatada();
        return dados;
    }
}
