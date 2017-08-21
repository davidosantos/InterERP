/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.InterERP.Pesquisa;

import com.InterERP.Cadastros.CadCliente;
import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public interface PesPesquisa {

    default public CadCliente pesquisaCliente(Component cmpnt, String iniciaPor) {

        CadCliente cliente = new CadCliente();
        PesPesquisaClienteTela tela = new PesPesquisaClienteTela();

        tela.setArgumento(iniciaPor);
        if (JOptionPane.showConfirmDialog(cmpnt, tela, "Pesquisa de Clientes",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE)
                == JOptionPane.OK_OPTION) {

            cliente.nome = tela.getSelecionado();

        }
        return cliente;
    }
}
