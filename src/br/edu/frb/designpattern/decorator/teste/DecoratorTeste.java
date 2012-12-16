package br.edu.frb.designpattern.decorator.teste;

import br.edu.frb.designpattern.decorator.AMovel;
import br.edu.frb.designpattern.decorator.material.TipoMaterial;
import br.edu.frb.designpattern.decorator.movel.GuardaRoupa;
import br.edu.frb.designpattern.decorator.movel.Mesa;
import br.edu.frb.designpattern.decorator.movel.Sofa;
import br.edu.frb.designpattern.decorator.peca.Base;
import br.edu.frb.designpattern.decorator.peca.Estrutura;
import br.edu.frb.designpattern.decorator.peca.Gaveta;
import br.edu.frb.designpattern.decorator.peca.Maleiro;
import br.edu.frb.designpattern.decorator.peca.Pe;
import br.edu.frb.designpattern.decorator.peca.Porta;

/**
 *
 * @author antonio
 */
public class DecoratorTeste {

    public static void main(String args[]) {
        imprimeResultado(new Base(TipoMaterial.COMPENSADO, new Pe(TipoMaterial.MDF, new Mesa())));
        imprimeResultado(new Porta(TipoMaterial.MADEIRA_DE_LEI, new Gaveta(TipoMaterial.COMPENSADO, new Maleiro(TipoMaterial.MADEIRA_DE_LEI, new GuardaRoupa()))));
        imprimeResultado(new Estrutura(TipoMaterial.MADEIRA_DE_LEI, new Sofa()));

    }

    private static void imprimeResultado(AMovel movelMontado) {
        System.out.println("Descricao: " + movelMontado.getDescricao());
        System.out.println("Custo total: " + movelMontado.getPreco());
    }
}
