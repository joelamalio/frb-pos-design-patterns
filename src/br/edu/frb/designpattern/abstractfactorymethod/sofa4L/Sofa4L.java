package br.edu.frb.designpattern.abstractfactorymethod.sofa4L;

import br.edu.frb.designpattern.abstractfactorymethod.moveis.Sofa;
import br.edu.frb.designpattern.abstractfactorymethod.peca.sofa.LugarSofaAB;

/**
 *
 * @author brunomsc
 */
public abstract class Sofa4L implements Sofa {

    private LugarSofaAB lugarSofa1;
    private LugarSofaAB lugarSofa2;
    private LugarSofaAB lugarSofa3;
    private LugarSofaAB lugarSofa4;

    public Sofa4L() {
        lugarSofa1 = criarLugarSofa();
        lugarSofa2 = criarLugarSofa();
        lugarSofa3 = criarLugarSofa();
        lugarSofa4 = criarLugarSofa();
    }
}
