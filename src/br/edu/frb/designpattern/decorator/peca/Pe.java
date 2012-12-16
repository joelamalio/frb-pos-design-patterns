package br.edu.frb.designpattern.decorator.peca;

import br.edu.frb.designpattern.decorator.AMovel;
import br.edu.frb.designpattern.decorator.APecaDecorator;
import br.edu.frb.designpattern.decorator.material.TipoMaterial;

public class Pe extends APecaDecorator {

    public Pe(TipoMaterial material, AMovel movel) {
        super(material, movel);
        setDescricao("Pe");
    }

    @Override
    public Double getPreco() {
        Double custo = movel.getPreco();
        switch (getMaterial()) {
            case COMPENSADO:
                return custo + 10d;
            case MDF:
                return custo + 15d;
            case MADEIRA_DE_LEI:
                return custo + 20d;
            default:
                throw new RuntimeException("Tipo de material não definido");
        }
    }
}
