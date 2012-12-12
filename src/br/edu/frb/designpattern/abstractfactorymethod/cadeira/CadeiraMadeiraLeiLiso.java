package br.edu.frb.designpattern.abstractfactorymethod.cadeira;

import br.edu.frb.designpattern.abstractfactorymethod.peca.cadeira.BaseCadeiraAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.cadeira.BaseCadeiraMadeiraLeiLiso;
import br.edu.frb.designpattern.abstractfactorymethod.peca.cadeira.EstruturaCadeiraAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.cadeira.EstruturaCadeiraMadeiraLeiLiso;
import br.edu.frb.designpattern.abstractfactorymethod.peca.cadeira.PeCadeiraAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.cadeira.PeCadeiraMadeiraLeiLiso;
import br.edu.frb.designpattern.abstractfactorymethod.peca.cadeira.RecostoCadeiraAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.cadeira.RecostoCadeiraMadeiraLeiLiso;

/**
 *
 * @author Brunomsc
 */
public class CadeiraMadeiraLeiLiso extends CadeiraMovel {

    public CadeiraMadeiraLeiLiso() {
        System.out.println("\nConstruindo CadeiraMadeiraLeiLiso\n\n");
    }

    @Override
    public EstruturaCadeiraAB criarEstruturaCadeira() {
        return new EstruturaCadeiraMadeiraLeiLiso();
    }

    @Override
    public PeCadeiraAB criarPeCadeira() {
        return new PeCadeiraMadeiraLeiLiso();
    }

    @Override
    public BaseCadeiraAB criarBaseCadeira() {
        return new BaseCadeiraMadeiraLeiLiso();
    }

    @Override
    public RecostoCadeiraAB criarRecostoCadeira() {
        return new RecostoCadeiraMadeiraLeiLiso();
    }
}
