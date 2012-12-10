package br.edu.frb.designpattern.abstractfactorymethod.moveis;

import br.edu.frb.designpattern.abstractfactorymethod.peca.sofa.LugarSofaAB;

/**
 *
 * @author Brunomsc
 */
public interface Sofa {

    // Factory Methods
    public abstract LugarSofaAB criarLugarSofa();
}
