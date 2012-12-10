package br.edu.frb.designpattern.abstractfactorymethod.cadeira;

import br.edu.frb.designpattern.abstractfactorymethod.peca.cadeira.BaseCadeiraAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.cadeira.BaseCadeiraCompensadoTrabalhado;
import br.edu.frb.designpattern.abstractfactorymethod.peca.cadeira.EstruturaCadeiraAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.cadeira.EstruturaCadeiraCompensadoTrabalhado;
import br.edu.frb.designpattern.abstractfactorymethod.peca.cadeira.PeCadeiraAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.cadeira.PeCadeiraCompensadoTrabalhado;
import br.edu.frb.designpattern.abstractfactorymethod.peca.cadeira.RecostoCadeiraAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.cadeira.RecostoCadeiraCompensadoTrabalhado;

/**
 *
 * @author Brunomsc
 */
public class CadeiraCompensadoTrabalhado extends Cadeira {

    public CadeiraCompensadoTrabalhado() {
        System.out.println("\nConstruindo CadeiraCompensadoTrabalhado\n\n");
    }

    @Override
    public EstruturaCadeiraAB criarEstruturaCadeira() {
        return new EstruturaCadeiraCompensadoTrabalhado();
    }

    @Override
    public PeCadeiraAB criarPeCadeira() {
        return new PeCadeiraCompensadoTrabalhado();
    }

    @Override
    public BaseCadeiraAB criarBaseCadeira() {
        return new BaseCadeiraCompensadoTrabalhado();
    }

    @Override
    public RecostoCadeiraAB criarRecostoCadeira() {
        return new RecostoCadeiraCompensadoTrabalhado();
    }
    
}
