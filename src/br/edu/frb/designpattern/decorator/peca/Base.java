package br.edu.frb.designpattern.decorator.peca;

import br.edu.frb.designpattern.decorator.AMovel;
import br.edu.frb.designpattern.decorator.APecaDecorator;
import br.edu.frb.designpattern.decorator.material.TipoMaterial;

public class Base extends APecaDecorator {

    public Base(TipoMaterial material, AMovel movel) {
        super(material, movel);
        setDescricao("Base");
    }

    @Override
    public Double getPreco() {
        Double custo = movel.getPreco();
        switch (getMaterial()) {
            case COMPENSADO:
                return custo + 40d;
            case MDF:
                return custo + 60d;
            case MADEIRA_DE_LEI:
                return custo + 80d;
            default:
                throw new RuntimeException("Tipo de material não definido");
        }
    }
}
