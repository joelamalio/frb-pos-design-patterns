package br.edu.frb.designpattern.abstractfactorymethod.sofa3L;

import br.edu.frb.designpattern.abstractfactorymethod.moveis.Sofa;
import br.edu.frb.designpattern.abstractfactorymethod.peca.sofa.LugarSofaAB;

/**
 *
 * @author brunomsc
 */
public abstract class Sofa3L implements Sofa {
    
    private LugarSofaAB lugarSofa1;
    private LugarSofaAB lugarSofa2;
    private LugarSofaAB lugarSofa3;

    public Sofa3L() {
        lugarSofa1 = criarLugarSofa();
        lugarSofa2 = criarLugarSofa();
        lugarSofa3 = criarLugarSofa();
    }
}
