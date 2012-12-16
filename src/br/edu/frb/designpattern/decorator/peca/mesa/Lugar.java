package br.edu.frb.designpattern.decorator.peca.mesa;

import br.edu.frb.designpattern.decorator.AMovel;
import br.edu.frb.designpattern.decorator.APecaDecorator;
import br.edu.frb.designpattern.decorator.material.TipoMaterial;

public abstract class Lugar extends APecaDecorator {

    public Lugar(TipoMaterial material, AMovel movel) {
        super(material, movel);
        setDescricao("Lugar");
    }

    @Override
    public Double getPreco() {
        Double custo = movel.getPreco();
        switch (getMaterial()) {
            case COMPENSADO:
                return custo + 5d;
            case MDF:
                return custo + 10d;
            case MADEIRA_DE_LEI:
                return custo + 15d;
            default:
                return custo + 0d;
        }
    }
}