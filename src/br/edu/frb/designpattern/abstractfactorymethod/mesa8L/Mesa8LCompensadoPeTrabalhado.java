package br.edu.frb.designpattern.abstractfactorymethod.mesa8L;

import br.edu.frb.designpattern.abstractfactorymethod.peca.mesa.BaseMesaAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.mesa.BaseMesaCompensado;
import br.edu.frb.designpattern.abstractfactorymethod.peca.mesa.LugarMesaAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.mesa.LugarMesaCompensado;
import br.edu.frb.designpattern.abstractfactorymethod.peca.mesa.PeMesaAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.mesa.PeMesaCompensadoTrabalhado;

/**
 *
 * @author Brunomsc
 */
public class Mesa8LCompensadoPeTrabalhado extends Mesa8L {

    public Mesa8LCompensadoPeTrabalhado() {
        System.out.println("\nConstruindo Mesa8LCompensadoPeTrabalhado\n\n");
    }

    @Override
    public LugarMesaAB criarLugarMesa() {
        return new LugarMesaCompensado();
    }

    @Override
    public BaseMesaAB criarBaseMesa() {
        return new BaseMesaCompensado();
    }

    @Override
    public PeMesaAB criarPeMesa() {
        return new PeMesaCompensadoTrabalhado();
    }
}
