package br.edu.frb.designpattern.abstractfactorymethod.cadeira;

import br.edu.frb.designpattern.abstractfactorymethod.peca.cadeira.BaseCadeiraAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.cadeira.BaseCadeiraMadeiraLeiTrabalhado;
import br.edu.frb.designpattern.abstractfactorymethod.peca.cadeira.EstruturaCadeiraAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.cadeira.EstruturaCadeiraMadeiraLeiTrabalhado;
import br.edu.frb.designpattern.abstractfactorymethod.peca.cadeira.PeCadeiraAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.cadeira.PeCadeiraMadeiraLeiTrabalhado;
import br.edu.frb.designpattern.abstractfactorymethod.peca.cadeira.RecostoCadeiraAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.cadeira.RecostoCadeiraMadeiraLeiTrabalhada;

/**
 *
 * @author Brunomsc
 */
public class CadeiraMadeiraLeiTrabalhado extends CadeiraMovel {

    public CadeiraMadeiraLeiTrabalhado() {
        System.out.println("\nConstruindo CadeiraMadeiraLeiTrabalhado\n\n");
    }

    @Override
    public EstruturaCadeiraAB criarEstruturaCadeira() {
        return new EstruturaCadeiraMadeiraLeiTrabalhado();
    }

    @Override
    public PeCadeiraAB criarPeCadeira() {
        return new PeCadeiraMadeiraLeiTrabalhado();
    }

    @Override
    public BaseCadeiraAB criarBaseCadeira() {
        return new BaseCadeiraMadeiraLeiTrabalhado();
    }

    @Override
    public RecostoCadeiraAB criarRecostoCadeira() {
        return new RecostoCadeiraMadeiraLeiTrabalhada();
    }
}
