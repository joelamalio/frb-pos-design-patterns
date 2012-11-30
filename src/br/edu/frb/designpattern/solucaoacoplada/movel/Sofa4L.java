package br.edu.frb.designpattern.solucaoacoplada.movel;

import br.edu.frb.designpattern.solucaoacoplada.peca.sofa.Lugar;

/**
 *
 * @author joelamalio
 */
public class Sofa4L {

    private Lugar assento1;
    private Lugar assento2;
    private Lugar assento3;
    private Lugar assento4;

    public Sofa4L() {
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
    
    public Lugar getAssento3() {
        return assento3;
    }

    public void setAssento3(Lugar assento3) {
        this.assento3 = assento3;
    }
    
    public Lugar getAssento4() {
        return assento4;
    }

    public void setAssento4(Lugar assento4) {
        this.assento4 = assento4;
    }
}
