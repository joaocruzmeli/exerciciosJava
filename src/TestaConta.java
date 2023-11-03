
public class TestaConta {

    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.setNomeTitular("Joao");
        c1.setNumero(1234);
        c1.setAgencia("1234");
        c1.setSaldo(5000);

        /* Método incorreto de acesso
        c1.nomeTitular = "Joao";
        c1.numero = 1234;
        c1.agencia = "1234";
        c1.saldo = 5000;
        */

        Data data = new Data();
        data.dia = 10;
        data.mes = 11;
        data.ano = 2000;

        c1.setDataAbertura(data);

        System.out.println(c1.recuperarDadosParaImpressao());
    }
}
