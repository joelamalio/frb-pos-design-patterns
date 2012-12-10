package br.edu.frb.designpattern.abstractfactorymethod.guardaroupa3P4G1C3M;

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
public class GuardaRoupa3P4G1C3MMdf extends GuardaRoupa3P4G1C3M {

    public GuardaRoupa3P4G1C3MMdf() {
        System.out.println("\nConstruindo GuardaRoupa3P4G1C3MMdf\n\n");
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
