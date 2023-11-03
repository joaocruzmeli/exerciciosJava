
public class TestaConta {

    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.nomeTitular = "Joao";
        c1.saldo = 200;

        Data data = new Data();
        data.dia = 10;
        data.mes = 11;
        data.ano = 2000;

        c1.dataAbertura = data;

        System.out.println(c1.recuperarDadosParaImpressao());
    }
}
