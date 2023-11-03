package main.com.meli.javatest.manipulador;

import main.com.meli.javatest.util.entrada.Evento;
import main.com.meli.javatest.model.seguro.SeguroDeVida;

public class ManipuladorDeSeguroDeVida {
    private SeguroDeVida seguroDeVida;

    public SeguroDeVida criaSeguro(Evento evento){
        this.seguroDeVida = new SeguroDeVida();
        this.seguroDeVida.setNumeroApolice(evento.getInt("numeroApolice"));
        this.seguroDeVida.setTitular(evento.getString("titular"));
        this.seguroDeVida.setValor(evento.getDouble("valor"));
        return this.seguroDeVida;
    }
}
