package br.edu.frb.designpattern.decorator.teste;

import br.edu.frb.designpattern.decorator.AMovel;
import br.edu.frb.designpattern.decorator.material.TipoMaterial;
import br.edu.frb.designpattern.decorator.movel.Mesa;
import br.edu.frb.designpattern.decorator.peca.Base;
import br.edu.frb.designpattern.decorator.peca.Pe;

/**
 *
 * @author antonio
 */
public class DecoratorTeste {

    public static void main(String args[]) {
        imprimeResultado(new Base(TipoMaterial.COMPENSADO, new Pe(TipoMaterial.MDF, new Mesa())));

    }

    private static void imprimeResultado(AMovel movelMontado) {
        System.out.println("Descricao: " + movelMontado.getDescricao());
        System.out.println("Custo total: " + movelMontado.getPreco());
    }
}
