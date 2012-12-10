package br.edu.frb.designpattern.abstractfactorymethod.sofa2L;

import br.edu.frb.designpattern.abstractfactorymethod.peca.sofa.LugarSofaAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.sofa.LugarSofaCompensado;

/**
 *
 * @author brunomsc
 */
public class Sofa2LCompensado extends Sofa2L {

    public Sofa2LCompensado() {
        System.out.println("\nConstruindo Sofa2LCompensado\n\n");
    }

    @Override
    public LugarSofaAB criarLugarSofa() {
        return new LugarSofaCompensado();
    }
}
