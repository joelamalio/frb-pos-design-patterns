package br.edu.frb.designpattern.abstractfactorymethod.mesa6L;

import br.edu.frb.designpattern.abstractfactorymethod.moveis.Mesa;
import br.edu.frb.designpattern.abstractfactorymethod.peca.mesa.BaseMesaAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.mesa.LugarMesaAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.mesa.PeMesaAB;

/**
 *
 * @author Brunomsc
 */
public abstract class Mesa6L implements Mesa {

    private LugarMesaAB lugarMesa1;
    private LugarMesaAB lugarMesa2;
    private LugarMesaAB lugarMesa3;
    private LugarMesaAB lugarMesa4;
    private LugarMesaAB lugarMesa5;
    private LugarMesaAB lugarMesa6;
    private BaseMesaAB baseMesa;
    private PeMesaAB peMesa1;
    private PeMesaAB peMesa2;
    private PeMesaAB peMesa3;
    private PeMesaAB peMesa4;

    public Mesa6L() {
        lugarMesa1 = criarLugarMesa();
        lugarMesa2 = criarLugarMesa();
        lugarMesa3 = criarLugarMesa();
        lugarMesa4 = criarLugarMesa();
        lugarMesa5 = criarLugarMesa();
        lugarMesa6 = criarLugarMesa();
        
        baseMesa = criarBaseMesa();
        
        peMesa1 = criarPeMesa();
        peMesa2 = criarPeMesa();
        peMesa3 = criarPeMesa();
        peMesa4 = criarPeMesa();
    }
}
