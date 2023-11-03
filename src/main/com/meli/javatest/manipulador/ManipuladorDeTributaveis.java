package main.com.meli.javatest.manipulador;

import main.com.meli.javatest.util.entrada.Evento;
import main.com.meli.javatest.interfaces.Tributavel;

import java.util.List;

public class ManipuladorDeTributaveis {
    private double total;

    public void calculaImpostos(Evento evento){
        double total = 0;
        List<Tributavel> listaTributaveis= evento.getListaTributaveis("listaTributaveis");
        for (Tributavel tributavel : listaTributaveis) {
            total += tributavel.getValorImposto();
        }
    }

    public double getTotal() {
        return total;
    }
}
