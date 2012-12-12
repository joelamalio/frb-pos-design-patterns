package br.edu.frb.designpattern.abstractfactorymethod.moveis;

import br.edu.frb.designpattern.abstractfactorymethod.peca.guardaroupa.CabideiroAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.guardaroupa.GavetaAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.guardaroupa.MaleiroAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.guardaroupa.PortaAB;

/**
 *
 * @author Brunomsc
 */
public interface GuardaRoupa {

    // Factory Methods
    public abstract PortaAB criarPorta();
    public abstract GavetaAB criarGaveta();
    public abstract CabideiroAB criarCabideiro();
    public abstract MaleiroAB criarMaleiro();
}
