package br.edu.frb.designpattern.solucaoacoplada.movel;

import br.edu.frb.designpattern.solucaoacoplada.peca.guardaroupa.Cabideiro;
import br.edu.frb.designpattern.solucaoacoplada.peca.guardaroupa.Gaveta;
import br.edu.frb.designpattern.solucaoacoplada.peca.guardaroupa.Maleiro;
import br.edu.frb.designpattern.solucaoacoplada.peca.guardaroupa.Porta;

/**
 * @author joelamalio
 */
public class GuardaRoupa3P4G1C3M {

    private Porta porta1;
    private Porta porta2;
    private Porta porta3;
    private Gaveta gaveta1;
    private Gaveta gaveta2;
    private Gaveta gaveta3;
    private Gaveta gaveta4;
    private Cabideiro cabideiro1;
    private Maleiro maleiro1;
    private Maleiro maleiro2;
    private Maleiro maleiro3;

    public GuardaRoupa3P4G1C3M() {
    }

    public Cabideiro getCabideiro1() {
        return cabideiro1;
    }

    public Gaveta getGaveta1() {
        return gaveta1;
    }

    public void setGaveta1(Gaveta gaveta1) {
        this.gaveta1 = gaveta1;
    }

    public Gaveta getGaveta2() {
        return gaveta2;
    }

    public void setGaveta2(Gaveta gaveta2) {
        this.gaveta2 = gaveta2;
    }

    public Gaveta getGaveta3() {
        return gaveta3;
    }

    public void setGaveta3(Gaveta gaveta3) {
        this.gaveta3 = gaveta3;
    }

    public Gaveta getGaveta4() {
        return gaveta4;
    }

    public void setGaveta4(Gaveta gaveta4) {
        this.gaveta4 = gaveta4;
    }

    public Maleiro getMaleiro1() {
        return maleiro1;
    }

    public void setMaleiro1(Maleiro maleiro1) {
        this.maleiro1 = maleiro1;
    }

    public Maleiro getMaleiro2() {
        return maleiro2;
    }

    public void setMaleiro2(Maleiro maleiro2) {
        this.maleiro2 = maleiro2;
    }

    public Maleiro getMaleiro3() {
        return maleiro3;
    }

    public void setMaleiro3(Maleiro maleiro3) {
        this.maleiro3 = maleiro3;
    }

    public Porta getPorta1() {
        return porta1;
    }

    public void setPorta1(Porta porta1) {
        this.porta1 = porta1;
    }

    public Porta getPorta2() {
        return porta2;
    }

    public void setPorta2(Porta porta2) {
        this.porta2 = porta2;
    }

    public Porta getPorta3() {
        return porta3;
    }

    public void setPorta3(Porta porta3) {
        this.porta3 = porta3;
    }
}
