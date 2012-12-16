package br.edu.frb.designpattern.decorator;

import br.edu.frb.designpattern.decorator.material.TipoMaterial;

/**
 * @author antonio
 */
public abstract class APecaDecorator {

    private TipoMaterial material;
    protected AMovel movel;
    protected String descricao;

    public APecaDecorator(TipoMaterial material, AMovel movel) {
        this.material = material;
        this.movel = movel;
    }

    public abstract Double getPreco();

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return movel.getDescricao() + " , com " + descricao + "de " + material.toString();
    }

    public TipoMaterial getMaterial() {
        return material;
    }
}