package br.edu.frb.designpattern.abstractfactorymethod.sofa2L;

import br.edu.frb.designpattern.abstractfactorymethod.peca.sofa.LugarSofaAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.sofa.LugarSofaMadeiraLei;

/**
 *
 * @author brunomsc
 */
public class Sofa2LMadeiraLei extends Sofa2L {

    public Sofa2LMadeiraLei() {
        System.out.println("\nConstruindo Sofa2LMadeiraLei\n\n");
    }

    @Override
    public LugarSofaAB criarLugarSofa() {
        return new LugarSofaMadeiraLei();
    }
}
