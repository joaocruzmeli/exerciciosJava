
public class TestaConta {

    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.setNomeTitular("Joao");
        c1.setNumero(1234);
        c1.setAgencia("1234");
        c1.setSaldo(5000);

        Conta c2 = new Conta("Victor");

        Data data = new Data();
        data.dia = 10;
        data.mes = 11;
        data.ano = 2000;

        c1.setDataAbertura(data);

        System.out.println(c1.recuperarDadosParaImpressao());
        System.out.println(c2.getNomeTitular());
    }
}
