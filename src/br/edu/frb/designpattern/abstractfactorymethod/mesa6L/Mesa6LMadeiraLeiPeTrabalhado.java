package br.edu.frb.designpattern.abstractfactorymethod.mesa6L;

import br.edu.frb.designpattern.abstractfactorymethod.peca.mesa.BaseMesaAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.mesa.BaseMesaMadeiraLei;
import br.edu.frb.designpattern.abstractfactorymethod.peca.mesa.LugarMesaAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.mesa.LugarMesaMadeiraLei;
import br.edu.frb.designpattern.abstractfactorymethod.peca.mesa.PeMesaAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.mesa.PeMesaMadeiraLeiTrabalhado;

/**
 *
 * @author Brunomsc
 */
public class Mesa6LMadeiraLeiPeTrabalhado extends Mesa6L {

    public Mesa6LMadeiraLeiPeTrabalhado() {
        System.out.println("\nConstruindo Mesa6LMadeiraLeiPeTrabalhado\n\n");
    }

    @Override
    public LugarMesaAB criarLugarMesa() {
        return new LugarMesaMadeiraLei();
    }

    @Override
    public BaseMesaAB criarBaseMesa() {
        return new BaseMesaMadeiraLei();
    }

    @Override
    public PeMesaAB criarPeMesa() {
        return new PeMesaMadeiraLeiTrabalhado();
    }
}
