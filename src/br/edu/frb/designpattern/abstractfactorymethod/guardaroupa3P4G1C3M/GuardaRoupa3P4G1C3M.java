package br.edu.frb.designpattern.abstractfactorymethod.guardaroupa3P4G1C3M;

import br.edu.frb.designpattern.abstractfactorymethod.moveis.GuardaRoupa;
import br.edu.frb.designpattern.abstractfactorymethod.peca.guardaroupa.CabideiroAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.guardaroupa.GavetaAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.guardaroupa.MaleiroAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.guardaroupa.PortaAB;

/**
 *
 * @author brunomsc
 */
public abstract class GuardaRoupa3P4G1C3M implements GuardaRoupa {
    private PortaAB porta1;
    private PortaAB porta2;
    private PortaAB porta3;
    private GavetaAB gaveta1;
    private GavetaAB gaveta2;
    private GavetaAB gaveta3;
    private GavetaAB gaveta4;
    private CabideiroAB cabideiro1;
    private MaleiroAB maleiro1;
    private MaleiroAB maleiro2;
    private MaleiroAB maleiro3;
    
    public GuardaRoupa3P4G1C3M() {
        porta1 = criarPorta();
        porta2 = criarPorta();
        porta3 = criarPorta();
        
        gaveta1 = criarGaveta();
        gaveta2 = criarGaveta();
        gaveta3 = criarGaveta();
        gaveta4 = criarGaveta();
        
        cabideiro1 = criarCabideiro();
        
        maleiro1 = criarMaleiro();
        maleiro2 = criarMaleiro();
        maleiro3 = criarMaleiro();
    }
}
