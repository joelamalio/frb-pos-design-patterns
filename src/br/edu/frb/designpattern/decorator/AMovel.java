package br.edu.frb.designpattern.decorator;

/**
 *
 * @author antonio
 */
public abstract class AMovel {

    public String descricao = "Movel abstrato";

    public abstract Double getPreco();

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}