package br.edu.frb.designpattern.singleton.fabricas;

import br.edu.frb.designpattern.abstractfactorymethod.cadeira.CadeiraMadeiraLeiLiso;
import br.edu.frb.designpattern.abstractfactorymethod.cadeira.CadeiraMadeiraLeiTrabalhado;
import br.edu.frb.designpattern.abstractfactorymethod.fabricas.FabricaDeMoveis;
import br.edu.frb.designpattern.abstractfactorymethod.guardaroupa3P4G1C3M.GuardaRoupa3P4G1C3MMadeiraLei;
import br.edu.frb.designpattern.abstractfactorymethod.guardaroupa4P6G2C4M.GuardaRoupa4P6G2C4MMadeiraLei;
import br.edu.frb.designpattern.abstractfactorymethod.guardaroupa6P8G2C4M.GuardaRoupa6P8G2C4MMadeiraLei;
import br.edu.frb.designpattern.abstractfactorymethod.mesa6L.Mesa6LMadeiraLeiPeLiso;
import br.edu.frb.designpattern.abstractfactorymethod.mesa6L.Mesa6LMadeiraLeiPeTrabalhado;
import br.edu.frb.designpattern.abstractfactorymethod.mesa8L.Mesa8LMadeiraLeiPeLiso;
import br.edu.frb.designpattern.abstractfactorymethod.mesa8L.Mesa8LMadeiraLeiPeTrabalhado;
import br.edu.frb.designpattern.abstractfactorymethod.moveis.Cadeira;
import br.edu.frb.designpattern.abstractfactorymethod.moveis.GuardaRoupa;
import br.edu.frb.designpattern.abstractfactorymethod.moveis.Mesa;
import br.edu.frb.designpattern.abstractfactorymethod.moveis.Sofa;
import br.edu.frb.designpattern.abstractfactorymethod.sofa2L.Sofa2LMadeiraLei;
import br.edu.frb.designpattern.abstractfactorymethod.sofa3L.Sofa3LMadeiraLei;
import br.edu.frb.designpattern.abstractfactorymethod.sofa4L.Sofa4LMadeiraLei;
import java.util.Date;

/**
 * @author joelamalio
 */
public class FabricaMadeiraDeLei implements FabricaDeMoveis {
    
    private static FabricaMadeiraDeLei instancia;
    private static final int QUANTIDADE_MAXIMA_INSTANCIAS = 3;
    private static int quantidadeDeInstancia = 0;
    private long idInstancia;

    private FabricaMadeiraDeLei(long idInstancia) {
        quantidadeDeInstancia++;
        this.idInstancia = idInstancia;
    }
    
    public static FabricaMadeiraDeLei getInstancia() {
        if (instancia == null || quantidadeDeInstancia < QUANTIDADE_MAXIMA_INSTANCIAS) {
            final long idInstancia = new Date().getTime();
            instancia = new FabricaMadeiraDeLei(idInstancia);
            final String texto = String.format("-----> Criando a instancia controlada com id = %d e numero %d\n", idInstancia, quantidadeDeInstancia);
            System.out.println(texto);
        } else {
            final String texto = String.format("-----> Recuperando a instancia controlada com id = %d  e numero %d\n", instancia.getIdInstancia(), quantidadeDeInstancia);
            System.out.println(texto);
        }
        return instancia;
    }

    public long getIdInstancia() {
        return idInstancia;
    }
    
    @Override
    public GuardaRoupa criarGuardaRoupa3P4G1C3M() {
        return new GuardaRoupa3P4G1C3MMadeiraLei();
    }

    @Override
    public GuardaRoupa criarGuardaRoupa4P6G2C4M() {
        return new GuardaRoupa4P6G2C4MMadeiraLei();
    }

    @Override
    public GuardaRoupa criarGuardaRoupa6P8G2C4M() {
        return new GuardaRoupa6P8G2C4MMadeiraLei();
    }

    @Override
    public Sofa criarSofa2L() {
        return new Sofa2LMadeiraLei();
    }

    @Override
    public Sofa criarSofa3L() {
        return new Sofa3LMadeiraLei();
    }

    @Override
    public Sofa criarSofa4L() {
        return new Sofa4LMadeiraLei();
    }

    @Override
    public Mesa criarMesa6LPeLiso() {
        return new Mesa6LMadeiraLeiPeLiso();
    }

    @Override
    public Mesa criarMesa6LPeTrabalhado() {
        return new Mesa6LMadeiraLeiPeTrabalhado();
    }

    @Override
    public Mesa criarMesa8LPeLiso() {
        return new Mesa8LMadeiraLeiPeLiso();
    }

    @Override
    public Mesa criarMesa8LPeTrabalhado() {
        return new Mesa8LMadeiraLeiPeTrabalhado();
    }

    @Override
    public Cadeira criarCadeiraLisa() {
        return new CadeiraMadeiraLeiLiso();
    }

    @Override
    public Cadeira criarCadeiraTrabalhada() {
        return new CadeiraMadeiraLeiTrabalhado();
    }
}
