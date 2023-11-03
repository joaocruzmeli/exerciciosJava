
public class TestaConta {

    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.nomeTitular = "Joao";
        c1.saldo = 200;

        Data data = new Data();
        c1.dataAbertura = data;
    }
}
