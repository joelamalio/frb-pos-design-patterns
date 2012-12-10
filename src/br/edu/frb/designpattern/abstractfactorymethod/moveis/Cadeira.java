package br.edu.frb.designpattern.abstractfactorymethod.moveis;

import br.edu.frb.designpattern.abstractfactorymethod.peca.cadeira.BaseCadeiraAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.cadeira.EstruturaCadeiraAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.cadeira.PeCadeiraAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.cadeira.RecostoCadeiraAB;

/**
 *
 * @author Brunomsc
 */
public interface Cadeira {
    // Factory Methods
    public abstract EstruturaCadeiraAB criarEstruturaCadeira();
    public abstract PeCadeiraAB criarPeCadeira();
    public abstract BaseCadeiraAB criarBaseCadeira();
    public abstract RecostoCadeiraAB criarRecostoCadeira();
}
