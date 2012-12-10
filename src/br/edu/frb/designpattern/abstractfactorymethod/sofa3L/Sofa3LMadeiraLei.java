package br.edu.frb.designpattern.abstractfactorymethod.sofa3L;

import br.edu.frb.designpattern.abstractfactorymethod.peca.sofa.LugarSofaAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.sofa.LugarSofaMadeiraLei;

/**
 *
 * @author brunomsc
 */
public class Sofa3LMadeiraLei extends Sofa3L {

    public Sofa3LMadeiraLei() {
        System.out.println("\nConstruindo Sofa3LMadeiraLei\n\n");
    }

    @Override
    public LugarSofaAB criarLugarSofa() {
        return new LugarSofaMadeiraLei();
    }
}
