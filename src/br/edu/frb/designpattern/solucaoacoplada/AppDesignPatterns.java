package br.edu.frb.designpattern.solucaoacoplada;

import br.edu.frb.designpattern.solucaoacoplada.movel.*;

/**
 * @author joelamalio
 */
public class AppDesignPatterns {

    public static void main(String[] args) {
        
        GuardaRoupa3P4G1C3M guardaRoupa3P4G1C3M = new GuardaRoupa3P4G1C3M();
        GuardaRoupa4P6G2C4M guardaRoupa4P6G2C4M = new GuardaRoupa4P6G2C4M();
        GuardaRoupa6P8G2C4M guardaRoupa6P8G2C4M = new GuardaRoupa6P8G2C4M();
        
        Sofa2L sofa2L = new Sofa2L();
        Sofa3L sofa3L = new Sofa3L();
        Sofa4L sofa4L = new Sofa4L();
        
        Mesa4P1B6L mesa4P1B6L = new Mesa4P1B6L();
        Mesa4P1B8L mesa4P1B8L = new Mesa4P1B8L();
        
    }
}
