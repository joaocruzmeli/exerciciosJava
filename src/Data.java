import java.time.LocalDate;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano){
        validaData(dia, mes,ano);
    }

    public String retornaFormatada(){
        return String.format("%d/%d/%d", dia, mes, ano);
    }

    public void validaDia(int dia){
        if (dia < 1 || dia > 31){
            throw new IllegalArgumentException("Dia inválido! O dia deve estar entre 1 e 31");
        }
    }

    public void validaMes(int mes){
        if (mes < 1 || mes > 12){
            throw new IllegalArgumentException("Mês inválido! O mês deve estar entre 1 e 12");
        }
    }

    public void validaAno(int ano){
        if (ano < 1900 || ano > LocalDate.now().getYear()){
            throw new IllegalArgumentException("Ano inválido! O Ano deve ser maior que 1900 e no máximo " + LocalDate.now().getYear());
        }
    }

    public void validaData(int dia, int mes, int ano){
        validaDia(dia);
        validaMes(mes);
        validaAno(ano);

        int [] listaMaximoDias = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int maximoDia : listaMaximoDias) {
            if (dia > maximoDia) {
                throw new IllegalArgumentException("Data inválida! Dia inválido para o mês correspondente");
            }
        }
    }
}
