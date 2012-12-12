package br.edu.frb.designpattern.abstractfactorymethod.cadeira;

import br.edu.frb.designpattern.abstractfactorymethod.peca.cadeira.BaseCadeiraAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.cadeira.BaseCadeiraCompensadoLiso;
import br.edu.frb.designpattern.abstractfactorymethod.peca.cadeira.EstruturaCadeiraAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.cadeira.EstruturaCadeiraCompensadoLiso;
import br.edu.frb.designpattern.abstractfactorymethod.peca.cadeira.PeCadeiraAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.cadeira.PeCadeiraCompensadoLiso;
import br.edu.frb.designpattern.abstractfactorymethod.peca.cadeira.RecostoCadeiraAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.cadeira.RecostoCadeiraCompensadoLiso;

/**
 *
 * @author Brunomsc
 */
public class CadeiraCompensadoLiso extends CadeiraMovel {

    public CadeiraCompensadoLiso() {
        System.out.println("\nConstruindo CadeiraCompensadoLiso\n\n");
    }

    @Override
    public EstruturaCadeiraAB criarEstruturaCadeira() {
        return new EstruturaCadeiraCompensadoLiso();
    }

    @Override
    public PeCadeiraAB criarPeCadeira() {
        return new PeCadeiraCompensadoLiso();
    }

    @Override
    public BaseCadeiraAB criarBaseCadeira() {
        return new BaseCadeiraCompensadoLiso();
    }

    @Override
    public RecostoCadeiraAB criarRecostoCadeira() {
        return new RecostoCadeiraCompensadoLiso();
    }
    
}
