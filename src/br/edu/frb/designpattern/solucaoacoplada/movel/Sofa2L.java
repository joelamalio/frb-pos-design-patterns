package br.edu.frb.designpattern.solucaoacoplada.movel;

import br.edu.frb.designpattern.solucaoacoplada.peca.sofa.Lugar;

/**
 *
 * @author joelamalio
 */
public class Sofa2L {

    private Lugar assento1;
    private Lugar assento2;

    public Sofa2L() {
    }

    public Lugar getAssento1() {
        return assento1;
    }

    public void setAssento1(Lugar assento1) {
        this.assento1 = assento1;
    }

    public Lugar getAssento2() {
        return assento2;
    }

    public void setAssento2(Lugar assento2) {
        this.assento2 = assento2;
    }
}
