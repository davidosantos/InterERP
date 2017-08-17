/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.InterERP.ContasAReceber;

/**
 *
 * @author david
 */
public interface contasAReceber {

    public void IncluirTitulo();

    public void excluirTitulo();

    public void baixarTitulo();
    
    public cr_titulo[] buscaTitulos(int cliente);
}
