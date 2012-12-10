package br.edu.frb.designpattern.abstractfactorymethod;

import br.edu.frb.designpattern.abstractfactorymethod.fabricas.FabricaCompensado;
import br.edu.frb.designpattern.abstractfactorymethod.fabricas.FabricaDeMoveis;
import br.edu.frb.designpattern.abstractfactorymethod.fabricas.FabricaMadeiraDeLei;
import br.edu.frb.designpattern.abstractfactorymethod.fabricas.FabricaMdf;
import br.edu.frb.designpattern.abstractfactorymethod.moveis.Cadeira;
import br.edu.frb.designpattern.abstractfactorymethod.moveis.GuardaRoupa;
import br.edu.frb.designpattern.abstractfactorymethod.moveis.Mesa;
import br.edu.frb.designpattern.abstractfactorymethod.moveis.Sofa;

/**
 *
 * @author brunomsc
 */
public class AppAbstractEFactoryMethod {

    public static void main(String[] args) {

        FabricaDeMoveis fabrica;
        System.out.println("\nFabricaCompensado\n\n");

        fabrica = new FabricaCompensado();

        GuardaRoupa guardaRoupaCompensado = fabrica.criarGuardaRoupa3P4G1C3M();
        guardaRoupaCompensado = fabrica.criarGuardaRoupa4P6G2C4M();
        guardaRoupaCompensado = fabrica.criarGuardaRoupa6P8G2C4M();

        Sofa sofaCompensado = fabrica.criarSofa2L();
        sofaCompensado = fabrica.criarSofa3L();
        sofaCompensado = fabrica.criarSofa4L();

        Mesa mesaCompensado = fabrica.criarMesa6LPeLiso();
        mesaCompensado = fabrica.criarMesa6LPeTrabalhado();
        mesaCompensado = fabrica.criarMesa8LPeLiso();
        mesaCompensado = fabrica.criarMesa8LPeTrabalhado();

        Cadeira cadeiraCompensada = fabrica.criarCadeiraLisa();
        cadeiraCompensada = fabrica.criarCadeiraTrabalhada();

        System.out.println("\n========================================================================================");
        System.out.println("========================================================================================\n");

        System.out.println("\nFabricaMadeiraDeLei\n\n");

        fabrica = new FabricaMadeiraDeLei();
        GuardaRoupa guardaRoupaMadeiraDeLei = fabrica.criarGuardaRoupa3P4G1C3M();
        guardaRoupaMadeiraDeLei = fabrica.criarGuardaRoupa4P6G2C4M();
        guardaRoupaMadeiraDeLei = fabrica.criarGuardaRoupa6P8G2C4M();

        Sofa sofaMadeiraDeLei = fabrica.criarSofa2L();
        sofaMadeiraDeLei = fabrica.criarSofa3L();
        sofaMadeiraDeLei = fabrica.criarSofa4L();

        Mesa mesaMadeiraDeLei = fabrica.criarMesa6LPeLiso();
        mesaMadeiraDeLei = fabrica.criarMesa6LPeTrabalhado();
        mesaMadeiraDeLei = fabrica.criarMesa8LPeLiso();
        mesaMadeiraDeLei = fabrica.criarMesa8LPeTrabalhado();

        Cadeira cadeiraMadeiraDeLei = fabrica.criarCadeiraLisa();
        cadeiraMadeiraDeLei = fabrica.criarCadeiraTrabalhada();

        System.out.println("\n========================================================================================");
        System.out.println("========================================================================================\n");

        System.out.println("\nFabricaMdf\n\n");

        fabrica = new FabricaMdf();
        GuardaRoupa guardaRoupaMdf = fabrica.criarGuardaRoupa3P4G1C3M();
        guardaRoupaMdf = fabrica.criarGuardaRoupa4P6G2C4M();
        guardaRoupaMdf = fabrica.criarGuardaRoupa6P8G2C4M();

        Sofa sofaMdf = fabrica.criarSofa2L();
        sofaMdf = fabrica.criarSofa3L();
        sofaMdf = fabrica.criarSofa4L();

        Mesa mesaMdf = fabrica.criarMesa6LPeLiso();
        mesaMdf = fabrica.criarMesa6LPeTrabalhado();
        mesaMdf = fabrica.criarMesa8LPeLiso();
        mesaMdf = fabrica.criarMesa8LPeTrabalhado();

        Cadeira cadeiraMdf = fabrica.criarCadeiraLisa();
        cadeiraMdf = fabrica.criarCadeiraTrabalhada();
    }
}
