/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.funcionalidades;

import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author david_000
 */
public interface InterERP_interface {

    abstract public DefaultTreeModel criaMenu_Arvore();

    abstract public void adiciona_Tab(String tab);

    abstract public void remove_Tab(JTabbedPane pane);
    
    abstract public void buscaCliente(JTextField text);
    
}
