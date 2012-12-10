package br.edu.frb.designpattern.abstractfactorymethod.moveis;

import br.edu.frb.designpattern.abstractfactorymethod.peca.mesa.BaseMesaAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.mesa.LugarMesaAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.mesa.PeMesaAB;

/**
 *
 * @author Brunomsc
 */
public interface Mesa {
    
    // Factory Methods
    public abstract LugarMesaAB criarLugarMesa();
    public abstract BaseMesaAB criarBaseMesa();
    public abstract PeMesaAB criarPeMesa();
}
