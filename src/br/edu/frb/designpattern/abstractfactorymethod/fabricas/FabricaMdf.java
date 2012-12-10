package br.edu.frb.designpattern.abstractfactorymethod.fabricas;

import br.edu.frb.designpattern.abstractfactorymethod.cadeira.CadeiraMdfLiso;
import br.edu.frb.designpattern.abstractfactorymethod.cadeira.CadeiraMdfTrabalhado;
import br.edu.frb.designpattern.abstractfactorymethod.guardaroupa3P4G1C3M.GuardaRoupa3P4G1C3MMdf;
import br.edu.frb.designpattern.abstractfactorymethod.guardaroupa4P6G2C4M.GuardaRoupa4P6G2C4MMdf;
import br.edu.frb.designpattern.abstractfactorymethod.guardaroupa6P8G2C4M.GuardaRoupa6P8G2C4MMdf;
import br.edu.frb.designpattern.abstractfactorymethod.mesa6L.Mesa6LMdfPeLiso;
import br.edu.frb.designpattern.abstractfactorymethod.mesa6L.Mesa6LMdfPeTrabalhado;
import br.edu.frb.designpattern.abstractfactorymethod.mesa8L.Mesa8LMdfPeLiso;
import br.edu.frb.designpattern.abstractfactorymethod.mesa8L.Mesa8LMdfPeTrabalhado;
import br.edu.frb.designpattern.abstractfactorymethod.moveis.Cadeira;
import br.edu.frb.designpattern.abstractfactorymethod.moveis.GuardaRoupa;
import br.edu.frb.designpattern.abstractfactorymethod.moveis.Mesa;
import br.edu.frb.designpattern.abstractfactorymethod.moveis.Sofa;
import br.edu.frb.designpattern.abstractfactorymethod.sofa2L.Sofa2LMdf;
import br.edu.frb.designpattern.abstractfactorymethod.sofa3L.Sofa3LMdf;
import br.edu.frb.designpattern.abstractfactorymethod.sofa4L.Sofa4LMdf;

/**
 *
 * @author Brunomsc
 */
public class FabricaMdf implements FabricaDeMoveis {

    @Override
    public GuardaRoupa criarGuardaRoupa3P4G1C3M() {
        return new GuardaRoupa3P4G1C3MMdf();
    }

    @Override
    public GuardaRoupa criarGuardaRoupa4P6G2C4M() {
        return new GuardaRoupa4P6G2C4MMdf();
    }

    @Override
    public GuardaRoupa criarGuardaRoupa6P8G2C4M() {
        return new GuardaRoupa6P8G2C4MMdf();
    }

    @Override
    public Sofa criarSofa2L() {
        return new Sofa2LMdf();
    }

    @Override
    public Sofa criarSofa3L() {
        return new Sofa3LMdf();
    }

    @Override
    public Sofa criarSofa4L() {
        return new Sofa4LMdf();
    }

    @Override
    public Mesa criarMesa6LPeLiso() {
        return new Mesa6LMdfPeLiso();
    }

    @Override
    public Mesa criarMesa6LPeTrabalhado() {
        return new Mesa6LMdfPeTrabalhado();
    }

    @Override
    public Mesa criarMesa8LPeLiso() {
        return new Mesa8LMdfPeLiso();
    }

    @Override
    public Mesa criarMesa8LPeTrabalhado() {
        return new Mesa8LMdfPeTrabalhado();
    }

    @Override
    public Cadeira criarCadeiraLisa() {
        return new CadeiraMdfLiso();
    }

    @Override
    public Cadeira criarCadeiraTrabalhada() {
        return new CadeiraMdfTrabalhado();
    }
}
