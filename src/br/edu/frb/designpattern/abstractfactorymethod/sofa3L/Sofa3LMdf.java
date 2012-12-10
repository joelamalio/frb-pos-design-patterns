package br.edu.frb.designpattern.abstractfactorymethod.sofa3L;

import br.edu.frb.designpattern.abstractfactorymethod.peca.sofa.LugarSofaAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.sofa.LugarSofaMdf;

/**
 *
 * @author brunomsc
 */
public class Sofa3LMdf extends Sofa3L {

    public Sofa3LMdf() {
        System.out.println("\nConstruindo Sofa3LMdf\n\n");
    }

    @Override
    public LugarSofaAB criarLugarSofa() {
        return new LugarSofaMdf();
    }
}
