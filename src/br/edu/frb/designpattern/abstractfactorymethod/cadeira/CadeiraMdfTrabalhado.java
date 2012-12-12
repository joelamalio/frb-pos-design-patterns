package br.edu.frb.designpattern.abstractfactorymethod.cadeira;

import br.edu.frb.designpattern.abstractfactorymethod.peca.cadeira.BaseCadeiraAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.cadeira.BaseCadeiraMdfTrabalhado;
import br.edu.frb.designpattern.abstractfactorymethod.peca.cadeira.EstruturaCadeiraAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.cadeira.EstruturaCadeiraMdfTrabalhado;
import br.edu.frb.designpattern.abstractfactorymethod.peca.cadeira.PeCadeiraAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.cadeira.PeCadeiraMdfTrabalhado;
import br.edu.frb.designpattern.abstractfactorymethod.peca.cadeira.RecostoCadeiraAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.cadeira.RecostoCadeiraMdfTrabalhado;

/**
 *
 * @author Brunomsc
 */
public class CadeiraMdfTrabalhado extends CadeiraMovel {

    public CadeiraMdfTrabalhado() {
        System.out.println("\nConstruindo CadeiraMdfTrabalhado\n\n");
    }

    @Override
    public EstruturaCadeiraAB criarEstruturaCadeira() {
        return new EstruturaCadeiraMdfTrabalhado();
    }

    @Override
    public PeCadeiraAB criarPeCadeira() {
        return new PeCadeiraMdfTrabalhado();
    }

    @Override
    public BaseCadeiraAB criarBaseCadeira() {
        return new BaseCadeiraMdfTrabalhado();
    }

    @Override
    public RecostoCadeiraAB criarRecostoCadeira() {
        return new RecostoCadeiraMdfTrabalhado();
    }
}
