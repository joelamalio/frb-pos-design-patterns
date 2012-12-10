package br.edu.frb.designpattern.abstractfactorymethod.sofa4L;

import br.edu.frb.designpattern.abstractfactorymethod.peca.sofa.LugarSofaAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.sofa.LugarSofaMdf;

/**
 *
 * @author brunomsc
 */
public class Sofa4LMdf extends Sofa4L {
    
    public Sofa4LMdf() {
        System.out.println("\nConstruindo Sofa4LMdf\n\n");
    }

    @Override
    public LugarSofaAB criarLugarSofa() {
        return new LugarSofaMdf();
    }
}
