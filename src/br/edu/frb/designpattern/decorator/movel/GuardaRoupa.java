package br.edu.frb.designpattern.decorator.movel;

import br.edu.frb.designpattern.decorator.AMovel;

/**
 * @author antonio
 */
public class GuardaRoupa extends AMovel {

    public GuardaRoupa() {
        setDescricao("Guarda Roupa");
    }

    @Override
    public Double getPreco() {
        return 0d;
    }
}