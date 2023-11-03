public class TestaConta {

    public static void main(String[] args) {
        Conta c1 = new Conta();

        c1.nomeTitular = "Joao";
        c1.numero = 123465;
        c1.agencia = "123";
        c1.saldo = 2000;
        c1.dataAbertura = "01/11/2023";

        c1.recuperarDadosParaImpressao();

        c1.saca(500);
        c1.deposita(300);

        double rendimento = c1.calculaRendimento();
        System.out.println("O rendimento da conta é: R$" + rendimento);
    }
}
