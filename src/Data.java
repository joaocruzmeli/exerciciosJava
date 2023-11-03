public class Data {
    public int dia;
    public int mes;
    public int ano;

    public String retornaFormatada(){
        return String.format("%d/%d/%d", dia, mes, ano);
    }
}
