package br.edu.frb.designpattern.abstractfactorymethod.guardaroupa6P8G2C4M;

import br.edu.frb.designpattern.abstractfactorymethod.peca.guardaroupa.CabideiroAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.guardaroupa.CabideiroMadeiraLei;
import br.edu.frb.designpattern.abstractfactorymethod.peca.guardaroupa.GavetaAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.guardaroupa.GavetaMadeiraLei;
import br.edu.frb.designpattern.abstractfactorymethod.peca.guardaroupa.MaleiroAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.guardaroupa.MaleiroMadeiraLei;
import br.edu.frb.designpattern.abstractfactorymethod.peca.guardaroupa.PortaAB;
import br.edu.frb.designpattern.abstractfactorymethod.peca.guardaroupa.PortaMadeiraLei;

/**
 *
 * @author brunomsc
 */
public class GuardaRoupa6P8G2C4MMadeiraLei extends GuardaRoupa6P8G2C4M {

    public GuardaRoupa6P8G2C4MMadeiraLei() {
        System.out.println("\nConstruindo GuardaRoupa6P8G2C4MMadeiraLei\n\n");
    }
    
    @Override
    public PortaAB criarPorta() {
        return new PortaMadeiraLei();
    }

    @Override
    public GavetaAB criarGaveta() {
        return new GavetaMadeiraLei();
    }

    @Override
    public CabideiroAB criarCabideiro() {
        return new CabideiroMadeiraLei();
    }

    @Override
    public MaleiroAB criarMaleiro() {
        return new MaleiroMadeiraLei();
    }
    
}
