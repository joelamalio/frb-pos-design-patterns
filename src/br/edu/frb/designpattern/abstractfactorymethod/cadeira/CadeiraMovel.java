package br.edu.frb.designpattern.abstractfactorymethod.cadeira;

import br.edu.frb.designpattern.abstractfactorymethod.peca.cadeira.BaseCadeiraAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.cadeira.EstruturaCadeiraAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.cadeira.PeCadeiraAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.cadeira.RecostoCadeiraAB;

/**
 *
 * @author Brunomsc
 */
public abstract class CadeiraMovel implements br.edu.frb.designpattern.abstractfactorymethod.moveis.Cadeira{
    
    private EstruturaCadeiraAB estruturaCadeira;
    private PeCadeiraAB peCadeira1;
    private PeCadeiraAB peCadeira2;
    private PeCadeiraAB peCadeira3;
    private PeCadeiraAB peCadeira4;
    private BaseCadeiraAB baseCadeira;
    private RecostoCadeiraAB recostoCadeira;

    public CadeiraMovel() {
        estruturaCadeira = criarEstruturaCadeira();
        peCadeira1 = criarPeCadeira();
        peCadeira2 = criarPeCadeira();
        peCadeira3 = criarPeCadeira();
        peCadeira4 = criarPeCadeira();
        baseCadeira = criarBaseCadeira();
        recostoCadeira = criarRecostoCadeira();
    }
}
