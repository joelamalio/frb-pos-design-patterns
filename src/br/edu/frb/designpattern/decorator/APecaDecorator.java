package br.edu.frb.designpattern.decorator;

import br.edu.frb.designpattern.decorator.material.TipoMaterial;

/**
 * @author antonio
 */
public abstract class APecaDecorator extends AMovel {

    private TipoMaterial material;
    protected AMovel movel;

    public APecaDecorator(TipoMaterial material, AMovel movel) {
        this.material = material;
        this.movel = movel;
    }

    @Override
    public String getDescricao() {
        return movel.getDescricao() + " , com " + super.getDescricao() + " de " + material.toString();
    }

    public TipoMaterial getMaterial() {
        return material;
    }
}