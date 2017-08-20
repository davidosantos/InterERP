/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.InterERP;

import com.InterERP.ContasAReceber.CtrTitulo;
import com.InterERP.Interface.InterERMain;
import javax.swing.JTabbedPane;
import com.InterERP.ContasAReceber.CtrContasAReceber;

/**
 *
 * @author david_000
 */
public class InterERP extends javax.swing.JFrame implements
        CtrContasAReceber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        InterERMain.start(null);
    }


// <editor-fold defaultstate="collapsed" desc="Contas a Receber"> 

    @Override
    public void IncluirTitulo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluirTitulo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void baixarTitulo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CtrTitulo[] buscaTitulos(int cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
//</editor-fold> 

}
