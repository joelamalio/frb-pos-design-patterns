package br.edu.frb.designpattern.singleton;

import br.edu.frb.designpattern.abstractfactorymethod.fabricas.FabricaDeMoveis;
import br.edu.frb.designpattern.abstractfactorymethod.moveis.Cadeira;
import br.edu.frb.designpattern.abstractfactorymethod.moveis.GuardaRoupa;
import br.edu.frb.designpattern.abstractfactorymethod.moveis.Mesa;
import br.edu.frb.designpattern.abstractfactorymethod.moveis.Sofa;
import br.edu.frb.designpattern.singleton.fabricas.FabricaCompensado;
import br.edu.frb.designpattern.singleton.fabricas.FabricaMadeiraDeLei;

/**
 * @author joelamalio
 */
public class AppSingleton {

    public static void main(String[] args) {

        FabricaDeMoveis fabrica;
        System.out.println("\nFabricaCompensado (Singleton com instancia unica)\n\n");

        fabrica = FabricaCompensado.getInstancia();
        GuardaRoupa guardaRoupaCompensado = fabrica.criarGuardaRoupa3P4G1C3M();
        guardaRoupaCompensado = fabrica.criarGuardaRoupa4P6G2C4M();
        guardaRoupaCompensado = fabrica.criarGuardaRoupa6P8G2C4M();

        fabrica = FabricaCompensado.getInstancia();
        Sofa sofaCompensado = fabrica.criarSofa2L();
        sofaCompensado = fabrica.criarSofa3L();
        sofaCompensado = fabrica.criarSofa4L();

        fabrica = FabricaCompensado.getInstancia();
        Mesa mesaCompensado = fabrica.criarMesa6LPeLiso();
        mesaCompensado = fabrica.criarMesa6LPeTrabalhado();
        mesaCompensado = fabrica.criarMesa8LPeLiso();
        mesaCompensado = fabrica.criarMesa8LPeTrabalhado();

        Cadeira cadeiraCompensada = fabrica.criarCadeiraLisa();
        cadeiraCompensada = fabrica.criarCadeiraTrabalhada();

        System.out.println("\n========================================================================================");
        System.out.println("========================================================================================\n");

        System.out.println("\nFabricaMadeiraDeLei  (Singleton com 3 instancias controladas)\n\n");

        fabrica = FabricaMadeiraDeLei.getInstancia();
        GuardaRoupa guardaRoupaMadeiraDeLei = fabrica.criarGuardaRoupa3P4G1C3M();
        guardaRoupaMadeiraDeLei = fabrica.criarGuardaRoupa4P6G2C4M();
        guardaRoupaMadeiraDeLei = fabrica.criarGuardaRoupa6P8G2C4M();

        fabrica = FabricaMadeiraDeLei.getInstancia();
        Sofa sofaMadeiraDeLei = fabrica.criarSofa2L();
        sofaMadeiraDeLei = fabrica.criarSofa3L();
        sofaMadeiraDeLei = fabrica.criarSofa4L();

        fabrica = FabricaMadeiraDeLei.getInstancia();
        Mesa mesaMadeiraDeLei = fabrica.criarMesa6LPeLiso();
        mesaMadeiraDeLei = fabrica.criarMesa6LPeTrabalhado();
        mesaMadeiraDeLei = fabrica.criarMesa8LPeLiso();
        mesaMadeiraDeLei = fabrica.criarMesa8LPeTrabalhado();

        fabrica = FabricaMadeiraDeLei.getInstancia();
        Cadeira cadeiraMadeiraDeLei = fabrica.criarCadeiraLisa();
        cadeiraMadeiraDeLei = fabrica.criarCadeiraTrabalhada();
    }
}
