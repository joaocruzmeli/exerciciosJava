package main.com.meli.javatest.modelo.pessoa;

public class PessoaFisica {
    private String cpf;

    public PessoaFisica (String cpf){
        validaCpf(cpf);
        this.cpf = cpf;
    }

    public void validaCpf(String cpf){

    }

    public String getCpf() {
        return cpf;
    }
}
