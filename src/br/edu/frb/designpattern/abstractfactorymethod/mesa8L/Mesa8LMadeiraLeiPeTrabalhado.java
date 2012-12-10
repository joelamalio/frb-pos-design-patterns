package br.edu.frb.designpattern.abstractfactorymethod.mesa8L;

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
public class Mesa8LMadeiraLeiPeTrabalhado extends Mesa8L {

    public Mesa8LMadeiraLeiPeTrabalhado() {
        System.out.println("\nConstruindo Mesa8LMadeiraLeiPeTrabalhado\n\n");
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
