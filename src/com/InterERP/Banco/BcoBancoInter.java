/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.InterERP.Banco;

import com.InterERP.ContasAReceber.CtrTitulo;
import java.util.List;

/**
 *
 * @author david
 */
public interface BcoBancoInter {

    /**
     *
     * @param titulos
     */
    default public void banGeraRemessa(List<CtrTitulo> titulos) {

    }
}
