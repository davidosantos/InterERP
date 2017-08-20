/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.InterERP.Pesquisa;

import com.InterERP.Cadastros.CadCliente;
import java.awt.Component;
import java.awt.EventQueue;
import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class PesChamaTela {

    PesPesquisaClienteTela tela;
    String titulo;
    Component invoker;
    String pesquisa;

    public PesChamaTela(PesPesquisaClienteTela tela, Component invoker, String titulo, String pesquisa) {
        this.tela = tela;
        this.titulo = titulo;
        this.invoker = invoker;
        this.pesquisa = pesquisa;
    }

    public CadCliente getResult() {
        CadCliente cliente = new CadCliente();

        tela.setArgumento(pesquisa);
        if (JOptionPane.showConfirmDialog(invoker, tela, titulo,
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE)
                == JOptionPane.OK_OPTION) {

            cliente.nome = tela.getSelecionado();

        }

        return cliente;
    }
}
