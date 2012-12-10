package br.edu.frb.designpattern.abstractfactorymethod.mesa8L;

import br.edu.frb.designpattern.abstractfactorymethod.peca.mesa.BaseMesaAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.mesa.BaseMesaMdf;
import br.edu.frb.designpattern.abstractfactorymethod.peca.mesa.LugarMesaAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.mesa.LugarMesaMdf;
import br.edu.frb.designpattern.abstractfactorymethod.peca.mesa.PeMesaAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.mesa.PeMesaMdfLiso;

/**
 *
 * @author Brunomsc
 */
public class Mesa8LMdfPeLiso extends Mesa8L {

    public Mesa8LMdfPeLiso() {
        System.out.println("\nConstruindo Mesa8LMdfPeLiso\n\n");
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
        return new PeMesaMdfLiso();
    }
}
