package br.edu.frb.designpattern.abstractfactorymethod.guardaroupa4P6G2C4M;

import br.edu.frb.designpattern.abstractfactorymethod.peca.guardaroupa.CabideiroAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.guardaroupa.CabideiroCompensado;
import br.edu.frb.designpattern.abstractfactorymethod.peca.guardaroupa.GavetaAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.guardaroupa.GavetaCompensado;
import br.edu.frb.designpattern.abstractfactorymethod.peca.guardaroupa.MaleiroAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.guardaroupa.MaleiroCompensado;
import br.edu.frb.designpattern.abstractfactorymethod.peca.guardaroupa.PortaAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.guardaroupa.PortaCompensado;

/**
 *
 * @author brunomsc
 */
public class GuardaRoupa4P6G2C4MCompensado extends GuardaRoupa4P6G2C4M {

    public GuardaRoupa4P6G2C4MCompensado() {
        System.out.println("\nConstruindo GuardaRoupa4P6G2C4MCompensado\n\n");
    }
    
    @Override
    public PortaAB criarPorta() {
        return new PortaCompensado();
    }

    @Override
    public GavetaAB criarGaveta() {
        return new GavetaCompensado();
    }

    @Override
    public CabideiroAB criarCabideiro() {
        return new CabideiroCompensado();
    }

    @Override
    public MaleiroAB criarMaleiro() {
        return new MaleiroCompensado();
    }
    
}
