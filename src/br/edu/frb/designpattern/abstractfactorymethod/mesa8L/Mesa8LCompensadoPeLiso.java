package br.edu.frb.designpattern.abstractfactorymethod.mesa8L;

import br.edu.frb.designpattern.abstractfactorymethod.peca.mesa.BaseMesaAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.mesa.BaseMesaCompensado;
import br.edu.frb.designpattern.abstractfactorymethod.peca.mesa.LugarMesaAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.mesa.LugarMesaCompensado;
import br.edu.frb.designpattern.abstractfactorymethod.peca.mesa.PeMesaAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.mesa.PeMesaCompensadoLiso;

/**
 *
 * @author Brunomsc
 */
public class Mesa8LCompensadoPeLiso extends Mesa8L {

    public Mesa8LCompensadoPeLiso() {
        System.out.println("\nConstruindo Mesa8LCompensadoPeLiso\n\n");
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
        return new PeMesaCompensadoLiso();
    }
}
