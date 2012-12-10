package br.edu.frb.designpattern.abstractfactorymethod.guardaroupa3P4G1C3M;

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
public class GuardaRoupa3P4G1C3MMadeiraLei extends GuardaRoupa3P4G1C3M {

    public GuardaRoupa3P4G1C3MMadeiraLei() {
        System.out.println("\nConstruindo GuardaRoupa3P4G1C3MMadeiraLei\n\n");
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
