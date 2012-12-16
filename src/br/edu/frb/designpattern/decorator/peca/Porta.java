package br.edu.frb.designpattern.decorator.peca;

import br.edu.frb.designpattern.decorator.AMovel;
import br.edu.frb.designpattern.decorator.APecaDecorator;
import br.edu.frb.designpattern.decorator.material.TipoMaterial;

public class Porta extends APecaDecorator {

    public Porta(TipoMaterial material, AMovel movel) {
        super(material, movel);
        setDescricao("Porta");
    }

    @Override
    public Double getPreco() {
        Double custo = movel.getPreco();
        switch (getMaterial()) {
            case COMPENSADO:
                return custo + 25d;
            case MDF:
                return custo + 40d;
            case MADEIRA_DE_LEI:
                return custo + 60d;
            default:
                throw new RuntimeException("Tipo de material não definido");
        }
    }
}
