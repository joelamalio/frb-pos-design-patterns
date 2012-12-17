/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.frb.designpattern.adapter;

import br.edu.frb.designpattern.abstractfactorymethod.fabricas.FabricaCompensado;
import br.edu.frb.designpattern.abstractfactorymethod.fabricas.FabricaDeMoveis;
import br.edu.frb.designpattern.abstractfactorymethod.fabricas.FabricaMadeiraDeLei;
import br.edu.frb.designpattern.abstractfactorymethod.fabricas.FabricaMdf;

/**
 *
 * @author Eduardo
 */
public class Adapter extends HouseMoveisClass{
    
    private FabricaDeMoveis fabrica;

    @Override
    public void criaCompensadoGuardaRoupa3P4G1C3M() {
        fabrica = new FabricaCompensado();
        fabrica.criarGuardaRoupa3P4G1C3M();
    }

    @Override
    public void criaCompensadoGuardaRoupa4P6G2C4M() {
        fabrica = new FabricaCompensado();
        fabrica.criarGuardaRoupa4P6G2C4M();
    }

    @Override
    public void criaCompensadoGuardaRoupa6P8G2C4M() {
        fabrica = new FabricaCompensado();
        fabrica.criarGuardaRoupa6P8G2C4M();
    }

    @Override
    public void criaCompensadoSofa2L() {
        fabrica = new FabricaCompensado();
        fabrica.criarSofa2L();
    }

    @Override
    public void criaCompensadoSofa3L() {
        fabrica = new FabricaCompensado();
        fabrica.criarSofa3L();
    }

    @Override
    public void criaCompensadoSofa4L() {
        fabrica = new FabricaCompensado();
        fabrica.criarSofa4L();
    }

    @Override
    public void criaCompensadoMesa6LPeLiso() {
        fabrica = new FabricaCompensado();
        fabrica.criarMesa6LPeLiso();
    }

    @Override
    public void criaCompensadoMesa6LPeTrabalhado() {
        fabrica = new FabricaCompensado();
        fabrica.criarMesa6LPeTrabalhado();
    }

    @Override
    public void criaCompensadoMesa8LPeLiso() {
        fabrica = new FabricaCompensado();
        fabrica.criarMesa8LPeLiso();
    }

    @Override
    public void criaCompensadoMesa8LPeTrabalhado() {
        fabrica = new FabricaCompensado();
        fabrica.criarMesa8LPeTrabalhado();
    }

    @Override
    public void criaCompensadoCadeiraLisa() {
        fabrica = new FabricaCompensado();
        fabrica.criarCadeiraLisa();
    }

    @Override
    public void criaCompensadoCadeiraTrabalhada() {
        fabrica = new FabricaCompensado();
        fabrica.criarCadeiraTrabalhada();
    }

    @Override
    public void criaMdfGuardaRoupa3P4G1C3M() {
        fabrica = new FabricaMdf();
        fabrica.criarGuardaRoupa3P4G1C3M();
    }

    @Override
    public void criaMdfGuardaRoupa4P6G2C4M() {
        fabrica = new FabricaMdf();
        fabrica.criarGuardaRoupa4P6G2C4M();
    }

    @Override
    public void criaMdfGuardaRoupa6P8G2C4M() {
        fabrica = new FabricaMdf();
        fabrica.criarGuardaRoupa6P8G2C4M();
    }

    @Override
    public void criaMdfSofa2L() {
        fabrica = new FabricaMdf();
        fabrica.criarSofa2L();
    }

    @Override
    public void criaMdfSofa3L() {
        fabrica = new FabricaMdf();
        fabrica.criarSofa3L();
    }

    @Override
    public void criaMdfSofa4L() {
        fabrica = new FabricaMdf();
        fabrica.criarSofa4L();
    }

    @Override
    public void criaMdfMesa6LPeLiso() {
        fabrica = new FabricaMdf();
        fabrica.criarMesa6LPeLiso();
    }

    @Override
    public void criaMdfMesa6LPeTrabalhado() {
        fabrica = new FabricaMdf();
        fabrica.criarMesa6LPeTrabalhado();
    }

    @Override
    public void criaMdfMesa8LPeLiso() {
        fabrica = new FabricaMdf();
        fabrica.criarMesa8LPeLiso();
    }

    @Override
    public void criaMdfMesa8LPeTrabalhado() {
        fabrica = new FabricaMdf();
        fabrica.criarMesa8LPeTrabalhado();
    }

    @Override
    public void criaMdfCadeiraLisa() {
        fabrica = new FabricaMdf();
        fabrica.criarCadeiraLisa();
    }

    @Override
    public void criaMdfCadeiraTrabalhada() {
        fabrica = new FabricaMdf();
        fabrica.criarCadeiraTrabalhada();
    }

    @Override
    public void criaMadeiraDeLeiGuardaRoupa3P4G1C3M() {
        fabrica = new FabricaMadeiraDeLei();
        fabrica.criarGuardaRoupa3P4G1C3M();
    }

    @Override
    public void criaMadeiraDeLeiGuardaRoupa4P6G2C4M() {
        fabrica = new FabricaMadeiraDeLei();
        fabrica.criarGuardaRoupa4P6G2C4M();
    }

    @Override
    public void criaMadeiraDeLeiGuardaRoupa6P8G2C4M() {
        fabrica = new FabricaMadeiraDeLei();
        fabrica.criarGuardaRoupa6P8G2C4M();
    }

    @Override
    public void criaMadeiraDeLeiSofa2L() {
        fabrica = new FabricaMadeiraDeLei();
        fabrica.criarSofa2L();
    }

    @Override
    public void criaMadeiraDeLeiSofa3L() {
        fabrica = new FabricaMadeiraDeLei();
        fabrica.criarSofa3L();
    }

    @Override
    public void criaMadeiraDeLeiSofa4L() {
        fabrica = new FabricaMadeiraDeLei();
        fabrica.criarSofa4L();
    }

    @Override
    public void criaMadeiraDeLeiMesa6LPeLiso() {
        fabrica = new FabricaMadeiraDeLei();
        fabrica.criarMesa6LPeLiso();
    }

    @Override
    public void criaMadeiraDeLeiMesa6LPeTrabalhado() {
        fabrica = new FabricaMadeiraDeLei();
        fabrica.criarMesa6LPeTrabalhado();
    }

    @Override
    public void criaMadeiraDeLeiMesa8LPeLiso() {
        fabrica = new FabricaMadeiraDeLei();
        fabrica.criarMesa8LPeLiso();
    }

    @Override
    public void criaMadeiraDeLeiMesa8LPeTrabalhado() {
        fabrica = new FabricaMadeiraDeLei();
        fabrica.criarMesa8LPeTrabalhado();
    }

    @Override
    public void criaMadeiraDeLeiCadeiraLisa() {
        fabrica = new FabricaMadeiraDeLei();
        fabrica.criarCadeiraLisa();
    }

    @Override
    public void criaMadeiraDeLeiCadeiraTrabalhada() {
        fabrica = new FabricaMadeiraDeLei();
        fabrica.criarCadeiraTrabalhada();
    }
    
}
