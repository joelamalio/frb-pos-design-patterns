package br.edu.frb.designpattern.decorator.peca;

import br.edu.frb.designpattern.decorator.AMovel;
import br.edu.frb.designpattern.decorator.APecaDecorator;
import br.edu.frb.designpattern.decorator.material.TipoMaterial;

public class Cabideiro extends APecaDecorator {

    public Cabideiro(TipoMaterial material, AMovel movel) {
        super(material, movel);
        setDescricao("Cabideiro");
    }

    @Override
    public Double getPreco() {
        Double custo = movel.getPreco();
        switch (getMaterial()) {
            case COMPENSADO:
                return custo + 20d;
            case MDF:
                return custo + 35d;
            case MADEIRA_DE_LEI:
                return custo + 45d;
            default:
                throw new RuntimeException("Tipo de material não definido");
        }
    }
}
