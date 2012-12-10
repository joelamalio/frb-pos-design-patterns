package br.edu.frb.designpattern.abstractfactorymethod.sofa4L;

import br.edu.frb.designpattern.abstractfactorymethod.peca.sofa.LugarSofaAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.sofa.LugarSofaMadeiraLei;

/**
 *
 * @author brunomsc
 */
public class Sofa4LMadeiraLei extends Sofa4L {

    public Sofa4LMadeiraLei() {
        System.out.println("\nConstruindo Sofa4LMadeiraLei\n\n");
    }

    @Override
    public LugarSofaAB criarLugarSofa() {
        return new LugarSofaMadeiraLei();
    }
}
