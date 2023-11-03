
public class TestaConta {

    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.nomeTitular = "Joao";
        c1.saldo = 200;

        Conta.saldo = 1234;
        Conta.calculaRendimento();
    }
}
