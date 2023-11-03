package main.com.meli.javatest.input;

public class Evento {
    private Object valor;

    public Evento(Object valor){
        this.valor = valor;
    }

    public double getDouble() {
        if (this.valor instanceof Number){
            this.valor = ((Number) this.valor).doubleValue();
            return (double) this.valor;
        } else if (this.valor instanceof String){
            try {
                return Double.parseDouble((String) valor);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("O tipo de dado não é numérico");
            }
        } else{
            throw new IllegalArgumentException("O tipo de dado não é numérico");
        }
    }
}
