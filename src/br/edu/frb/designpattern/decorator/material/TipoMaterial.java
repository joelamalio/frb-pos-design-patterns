package br.edu.frb.designpattern.decorator.material;

/**
 * @author antonio
 */
public enum TipoMaterial {

    MDF("MDF"),
    MADEIRA_DE_LEI("MADEIRA DE LEI"),
    COMPENSADO("COMPENSADO");
    
    private String material;

    private TipoMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return material;
    }
}