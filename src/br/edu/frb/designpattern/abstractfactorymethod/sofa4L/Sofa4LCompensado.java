package br.edu.frb.designpattern.abstractfactorymethod.sofa4L;

import br.edu.frb.designpattern.abstractfactorymethod.peca.sofa.LugarSofaAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.sofa.LugarSofaCompensado;

/**
 *
 * @author brunomsc
 */
public class Sofa4LCompensado extends Sofa4L {

    public Sofa4LCompensado() {
        System.out.println("\nConstruindo Sofa4LCompensado\n\n");
    }

    @Override
    public LugarSofaAB criarLugarSofa() {
        return new LugarSofaCompensado();
    }
}
