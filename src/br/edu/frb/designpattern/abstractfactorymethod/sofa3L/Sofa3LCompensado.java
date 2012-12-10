package br.edu.frb.designpattern.abstractfactorymethod.sofa3L;

import br.edu.frb.designpattern.abstractfactorymethod.peca.sofa.LugarSofaAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.sofa.LugarSofaCompensado;

/**
 *
 * @author brunomsc
 */
public class Sofa3LCompensado extends Sofa3L {

    public Sofa3LCompensado() {
        System.out.println("\nConstruindo Sofa3LCompensado\n\n");
    }

    @Override
    public LugarSofaAB criarLugarSofa() {
        return new LugarSofaCompensado();
    }
}
