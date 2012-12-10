package br.edu.frb.designpattern.abstractfactorymethod.sofa2L;

import br.edu.frb.designpattern.abstractfactorymethod.peca.sofa.LugarSofaAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.sofa.LugarSofaMdf;

/**
 *
 * @author brunomsc
 */
public class Sofa2LMdf extends Sofa2L {

    public Sofa2LMdf() {
        System.out.println("\nConstruindo Sofa2LMdf\n\n");
    }

    @Override
    public LugarSofaAB criarLugarSofa() {
        return new LugarSofaMdf();
    }
}
