package br.edu.frb.designpattern.abstractfactorymethod.mesa6L;

import br.edu.frb.designpattern.abstractfactorymethod.peca.mesa.BaseMesaAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.mesa.BaseMesaMdf;
import br.edu.frb.designpattern.abstractfactorymethod.peca.mesa.LugarMesaAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.mesa.LugarMesaMdf;
import br.edu.frb.designpattern.abstractfactorymethod.peca.mesa.PeMesaAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.mesa.PeMesaMdfTrabalhado;

/**
 *
 * @author Brunomsc
 */
public class Mesa6LMdfPeTrabalhado extends Mesa6L {

    public Mesa6LMdfPeTrabalhado() {
        System.out.println("\nConstruindo Mesa6LMdfPeTrabalhado\n\n");
    }

    @Override
    public LugarMesaAB criarLugarMesa() {
        return new LugarMesaMdf();
    }

    @Override
    public BaseMesaAB criarBaseMesa() {
        return new BaseMesaMdf();
    }

    @Override
    public PeMesaAB criarPeMesa() {
        return new PeMesaMdfTrabalhado();
    }
}
