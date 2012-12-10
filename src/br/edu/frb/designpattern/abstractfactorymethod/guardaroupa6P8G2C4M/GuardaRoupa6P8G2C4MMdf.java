package br.edu.frb.designpattern.abstractfactorymethod.guardaroupa6P8G2C4M;

import br.edu.frb.designpattern.abstractfactorymethod.peca.guardaroupa.CabideiroAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.guardaroupa.CabideiroMdf;
import br.edu.frb.designpattern.abstractfactorymethod.peca.guardaroupa.GavetaAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.guardaroupa.GavetaMdf;
import br.edu.frb.designpattern.abstractfactorymethod.peca.guardaroupa.MaleiroAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.guardaroupa.MaleiroMdf;
import br.edu.frb.designpattern.abstractfactorymethod.peca.guardaroupa.PortaAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.guardaroupa.PortaMdf;

/**
 *
 * @author brunomsc
 */
public class GuardaRoupa6P8G2C4MMdf extends GuardaRoupa6P8G2C4M {

    public GuardaRoupa6P8G2C4MMdf() {
        System.out.println("\nConstruindo GuardaRoupa6P8G2C4MMdf\n\n");
    }
    
    @Override
    public PortaAB criarPorta() {
        return new PortaMdf();
    }

    @Override
    public GavetaAB criarGaveta() {
        return new GavetaMdf();
    }

    @Override
    public CabideiroAB criarCabideiro() {
        return new CabideiroMdf();
    }

    @Override
    public MaleiroAB criarMaleiro() {
        return new MaleiroMdf();
    }
    
}
