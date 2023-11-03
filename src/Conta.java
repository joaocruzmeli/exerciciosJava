public class Conta {
    private String nomeTitular;
    private int numero;
    private String agencia;
    private double saldo;
    private Data dataAbertura;

    public Conta() {

    }

    public Conta(String nomeTitular){
        this.nomeTitular = nomeTitular;
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
        return this.saldo * 0.1;
    }

    public String recuperarDadosParaImpressao(){
        String dados = "\nTitular: " + this.nomeTitular;
        dados += "\nNúmero da conta: " + this.numero;
        dados += "\nAgência: " + this.agencia;
        dados += "\nSaldo R$: " + this.saldo;
        dados += "\nData de abertura: " + this.dataAbertura.retornaFormatada();
        return dados;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Data getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Data dataAbertura) {
        this.dataAbertura = dataAbertura;
    }
}
