/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.InterERP.Pedido;

import com.InterERP.BancoDeDados.BanBancoDeDadosInter;
import com.InterERP.BancoDeDados.BanException;

/**
 *
 * @author david
 */
public interface PedPedidoInter extends BanBancoDeDadosInter {
    default public void pedGrava(PedPedido pedido) throws BanException{
        
    }
}
