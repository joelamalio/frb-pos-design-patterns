package br.edu.frb.designpattern.decorator.movel;

import br.edu.frb.designpattern.decorator.AMovel;

/**
 * @author antonio
 */
public class Mesa extends AMovel {

    public Mesa() {
        setDescricao("Mesa");
    }
    
    @Override
    public Double getPreco() {
        return 0d;
    }
}