/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.InterERP.Pesquisa;

import com.InterERP.Cadastros.ca_cliente;
import java.awt.Component;
import java.awt.EventQueue;
import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class chamaTela {

    pesquisaCliente tela;
    String titulo;
    Component invoker;
    String pesquisa;

    public chamaTela(pesquisaCliente tela, Component invoker, String titulo, String pesquisa) {
        this.tela = tela;
        this.titulo = titulo;
        this.invoker = invoker;
        this.pesquisa = pesquisa;
    }

    public ca_cliente getResult() {
        ca_cliente cliente = new ca_cliente();
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                tela.setArgumento(pesquisa);
                if (JOptionPane.showConfirmDialog(invoker, tela, titulo, JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.OK_OPTION) {
                    cliente.nome = "teste";
                }

            }
        });
        return cliente;
    }
}
