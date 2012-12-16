package br.edu.frb.designpattern.decorator.movel;

import br.edu.frb.designpattern.decorator.AMovel;

/**
 * @author antonio
 */
public class Sofa extends AMovel {

    public Sofa() {
        setDescricao("Sofa");
    }

    @Override
    public Double getPreco() {
        return 0d;
    }
}