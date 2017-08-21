/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.InterERP.ContasAReceber;

import com.InterERP.BancoDeDados.BanException;
import com.InterERP.Logs.LogLogs;
import com.InterERP.BancoDeDados.BanBancoDeDadosInter;

/**
 *
 * @author david
 */
public interface CtrContasAReceberInter extends BanBancoDeDadosInter, LogLogs {

    default public void crtIncluirTitulo(CtrTitulo titulo){
        try {
            banAtualiza("teste");
        } catch (BanException ex) {
            LogGravaLog(ex.getMessage());
        }
    }

    default public void crtExcluirTitulo(CtrTitulo titulo){
        
    }

    default public void crtBaixarTitulo(CtrTitulo titulo){
        
    }
    
    default public CtrTitulo[] crtBuscaTitulos(int cliente){
        return null;
    }
}
