public class TestaConta {

    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.nomeTitular = "Joao";
        c1.saldo = 200;

        Conta c2 = c1;

        if (c1 == c2){
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");
        }
    }
}
