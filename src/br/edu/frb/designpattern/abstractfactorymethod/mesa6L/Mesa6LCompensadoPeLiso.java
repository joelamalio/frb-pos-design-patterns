package br.edu.frb.designpattern.abstractfactorymethod.mesa6L;

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
public class Mesa6LCompensadoPeLiso extends Mesa6L {

    public Mesa6LCompensadoPeLiso() {
        System.out.println("\nConstruindo Mesa6LCompensadoPeLiso\n\n");
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
