package br.edu.frb.designpattern.abstractfactorymethod.guardaroupa4P6G2C4M;

import br.edu.frb.designpattern.abstractfactorymethod.moveis.GuardaRoupa;
import br.edu.frb.designpattern.abstractfactorymethod.peca.guardaroupa.CabideiroAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.guardaroupa.GavetaAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.guardaroupa.MaleiroAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.guardaroupa.PortaAB;

/**
 *
 * @author brunomsc
 */
public abstract class GuardaRoupa4P6G2C4M implements GuardaRoupa {
    
    private PortaAB porta1;
    private PortaAB porta2;
    private PortaAB porta3;
    private PortaAB porta4;
    private GavetaAB gaveta1;
    private GavetaAB gaveta2;
    private GavetaAB gaveta3;
    private GavetaAB gaveta4;
    private GavetaAB gaveta5;
    private GavetaAB gaveta6;
    private CabideiroAB cabideiro1;
    private CabideiroAB cabideiro2;
    private MaleiroAB maleiro1;
    private MaleiroAB maleiro2;
    private MaleiroAB maleiro3;
    private MaleiroAB maleiro4;
    
    public GuardaRoupa4P6G2C4M() {
        porta1 = criarPorta();
        porta2 = criarPorta();
        porta3 = criarPorta();
        porta4 = criarPorta();
        
        gaveta1 = criarGaveta();
        gaveta2 = criarGaveta();
        gaveta3 = criarGaveta();
        gaveta4 = criarGaveta();
        gaveta5 = criarGaveta();
        gaveta6 = criarGaveta();
        
        cabideiro1 = criarCabideiro();
        cabideiro2 = criarCabideiro();
        
        maleiro1 = criarMaleiro();
        maleiro2 = criarMaleiro();
        maleiro3 = criarMaleiro();
        maleiro4 = criarMaleiro();
    }
}
