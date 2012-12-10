package br.edu.frb.designpattern.abstractfactorymethod.fabricas;

import br.edu.frb.designpattern.abstractfactorymethod.cadeira.CadeiraCompensadoLiso;
import br.edu.frb.designpattern.abstractfactorymethod.cadeira.CadeiraCompensadoTrabalhado;
import br.edu.frb.designpattern.abstractfactorymethod.guardaroupa3P4G1C3M.GuardaRoupa3P4G1C3MCompensado;
import br.edu.frb.designpattern.abstractfactorymethod.guardaroupa4P6G2C4M.GuardaRoupa4P6G2C4MCompensado;
import br.edu.frb.designpattern.abstractfactorymethod.guardaroupa6P8G2C4M.GuardaRoupa6P8G2C4MCompensado;
import br.edu.frb.designpattern.abstractfactorymethod.mesa6L.Mesa6LCompensadoPeLiso;
import br.edu.frb.designpattern.abstractfactorymethod.mesa6L.Mesa6LCompensadoPeTrabalhado;
import br.edu.frb.designpattern.abstractfactorymethod.mesa8L.Mesa8LCompensadoPeLiso;
import br.edu.frb.designpattern.abstractfactorymethod.mesa8L.Mesa8LCompensadoPeTrabalhado;
import br.edu.frb.designpattern.abstractfactorymethod.moveis.Cadeira;
import br.edu.frb.designpattern.abstractfactorymethod.moveis.GuardaRoupa;
import br.edu.frb.designpattern.abstractfactorymethod.moveis.Mesa;
import br.edu.frb.designpattern.abstractfactorymethod.moveis.Sofa;
import br.edu.frb.designpattern.abstractfactorymethod.sofa2L.Sofa2LCompensado;
import br.edu.frb.designpattern.abstractfactorymethod.sofa3L.Sofa3LCompensado;
import br.edu.frb.designpattern.abstractfactorymethod.sofa4L.Sofa4LCompensado;

/**
 *
 * @author Brunomsc
 */
public class FabricaCompensado implements FabricaDeMoveis {

    @Override
    public GuardaRoupa criarGuardaRoupa3P4G1C3M() {
        return new GuardaRoupa3P4G1C3MCompensado();
    }

    @Override
    public GuardaRoupa criarGuardaRoupa4P6G2C4M() {
        return new GuardaRoupa4P6G2C4MCompensado();
    }

    @Override
    public GuardaRoupa criarGuardaRoupa6P8G2C4M() {
        return new GuardaRoupa6P8G2C4MCompensado();
    }

    @Override
    public Sofa criarSofa2L() {
        return new Sofa2LCompensado();
    }

    @Override
    public Sofa criarSofa3L() {
        return new Sofa3LCompensado();
    }

    @Override
    public Sofa criarSofa4L() {
        return new Sofa4LCompensado();
    }

    @Override
    public Mesa criarMesa6LPeLiso() {
        return new Mesa6LCompensadoPeLiso();
    }

    @Override
    public Mesa criarMesa6LPeTrabalhado() {
        return new Mesa6LCompensadoPeTrabalhado();
    }

    @Override
    public Mesa criarMesa8LPeLiso() {
        return new Mesa8LCompensadoPeLiso();
    }

    @Override
    public Mesa criarMesa8LPeTrabalhado() {
        return new Mesa8LCompensadoPeTrabalhado();
    }

    @Override
    public Cadeira criarCadeiraLisa() {
        return new CadeiraCompensadoLiso();
    }

    @Override
    public Cadeira criarCadeiraTrabalhada() {
        return new CadeiraCompensadoTrabalhado();
    }
}
