package br.edu.frb.designpattern.abstractfactorymethod.sofa2L;

import br.edu.frb.designpattern.abstractfactorymethod.moveis.Sofa;
import br.edu.frb.designpattern.abstractfactorymethod.peca.sofa.LugarSofaAB;

/**
 *
 * @author brunomsc
 */
public abstract class Sofa2L implements Sofa {

    private LugarSofaAB lugarSofa1;
    private LugarSofaAB lugarSofa2;

    public Sofa2L() {
        lugarSofa1 = criarLugarSofa();
        lugarSofa2 = criarLugarSofa();
    }
}
