/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.InterERP.BancoDeDados;

/**
 *
 * @author david
 */
public interface BanBancoDeDadosInter {
    abstract void conecta() throws BanException;
    
    default public void banGrava(String Sql) throws BanException {
        
    }
    
    default public void banAtualiza(String Sql) throws BanException {
        
    }
    
}
