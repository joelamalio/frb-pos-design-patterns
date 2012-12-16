package br.edu.frb.designpattern.decorator.peca;

import br.edu.frb.designpattern.decorator.AMovel;
import br.edu.frb.designpattern.decorator.APecaDecorator;
import br.edu.frb.designpattern.decorator.material.TipoMaterial;

public class Gaveta extends APecaDecorator {

    public Gaveta(TipoMaterial material, AMovel movel) {
        super(material, movel);
        setDescricao("Gaveta");
    }

    @Override
    public Double getPreco() {
        Double custo = movel.getPreco();
        switch (getMaterial()) {
            case COMPENSADO:
                return custo + 15d;
            case MDF:
                return custo + 30d;
            case MADEIRA_DE_LEI:
                return custo + 40d;
            default:
                throw new RuntimeException("Tipo de material não definido");
        }
    }
}
