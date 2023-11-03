public class TestaConta {

    public static void main(String[] args) {
        Conta c1 = new Conta();

        c1.nomeTitular = "Joao";
        c1.numero = 123465;
        c1.agencia = "123";
        c1.saldo = 2000;
        c1.dataAbertura = "01/11/2023";

        System.out.println("Nome do titular:" + c1.nomeTitular);
        System.out.println("Numero da conta: " + c1.numero);
        System.out.println("Agencia: " + c1.agencia);
        System.out.println("Saldo: R$" + c1.saldo);
        System.out.println("Data de abertura: " + c1.dataAbertura);

        c1.saca(500);
        c1.deposita(300);

        double rendimento = c1.calculaRendimento();
        System.out.println("O rendimento da conta é: R$" + rendimento);
    }
}
