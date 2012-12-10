package br.edu.frb.designpattern.abstractfactorymethod.fabricas;

import br.edu.frb.designpattern.abstractfactorymethod.moveis.Cadeira;
import br.edu.frb.designpattern.abstractfactorymethod.moveis.GuardaRoupa;
import br.edu.frb.designpattern.abstractfactorymethod.moveis.Mesa;
import br.edu.frb.designpattern.abstractfactorymethod.moveis.Sofa;

/**
 * Interface para criação das Fábricas.
 * 
 * @author Brunomsc
 */
public interface FabricaDeMoveis {

    GuardaRoupa criarGuardaRoupa3P4G1C3M();
    GuardaRoupa criarGuardaRoupa4P6G2C4M();
    GuardaRoupa criarGuardaRoupa6P8G2C4M();

    Sofa criarSofa2L();
    Sofa criarSofa3L();
    Sofa criarSofa4L();

    Mesa criarMesa6LPeLiso();
    Mesa criarMesa6LPeTrabalhado();
    Mesa criarMesa8LPeLiso();
    Mesa criarMesa8LPeTrabalhado();

    Cadeira criarCadeiraLisa();
    Cadeira criarCadeiraTrabalhada();
}
