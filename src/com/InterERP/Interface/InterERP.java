/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.InterERP.Interface;

import com.InterERP.Vendas.InterfaceVendas;
import com.InterERP.Vendas.Vendas;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.tree.DefaultTreeModel;
import org.openide.util.Exceptions;

/**
 *
 * @author david_000
 */
public class InterERP extends javax.swing.JFrame implements InterERP_interface, InterfaceVendas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        InterERMain.start(null);
    }

    @Override
    public DefaultTreeModel criaMenu_Arvore() {
        javax.swing.tree.DefaultMutableTreeNode interERP = new javax.swing.tree.DefaultMutableTreeNode("InterERP");
        javax.swing.tree.DefaultMutableTreeNode menuCadastros = new javax.swing.tree.DefaultMutableTreeNode("Cadastros");
        javax.swing.tree.DefaultMutableTreeNode menuCR = new javax.swing.tree.DefaultMutableTreeNode("Contas a Receber");
        javax.swing.tree.DefaultMutableTreeNode menuCP = new javax.swing.tree.DefaultMutableTreeNode("Contas a Pagar");
        javax.swing.tree.DefaultMutableTreeNode menuPedidos = new javax.swing.tree.DefaultMutableTreeNode("Pedidos");
        javax.swing.tree.DefaultMutableTreeNode menuCaixa = new javax.swing.tree.DefaultMutableTreeNode("Caixa");
        javax.swing.tree.DefaultMutableTreeNode menuGerencia = new javax.swing.tree.DefaultMutableTreeNode("Gerencia");

        javax.swing.tree.DefaultMutableTreeNode subMenuClientes = new javax.swing.tree.DefaultMutableTreeNode("CA - Clientes");
        javax.swing.tree.DefaultMutableTreeNode subMenuProdutos = new javax.swing.tree.DefaultMutableTreeNode("CA - Produtos");
        javax.swing.tree.DefaultMutableTreeNode subMenuRelat = new javax.swing.tree.DefaultMutableTreeNode("CA - Relatórios");
        javax.swing.tree.DefaultMutableTreeNode subMenuOper = new javax.swing.tree.DefaultMutableTreeNode("CR - Operações");
        javax.swing.tree.DefaultMutableTreeNode subMenuVend = new javax.swing.tree.DefaultMutableTreeNode("PE - Vender");

        menuCadastros.add(subMenuClientes);
        menuCadastros.add(subMenuProdutos);
        menuCadastros.add(subMenuRelat);
        menuPedidos.add(subMenuVend);

        menuCR.add(subMenuOper);

        interERP.add(menuCadastros);
        interERP.add(menuCR);
        interERP.add(menuCP);
        interERP.add(menuPedidos);
        interERP.add(menuCaixa);
        interERP.add(menuGerencia);

        return new javax.swing.tree.DefaultTreeModel(interERP);
    }

    @Override
    public void adiciona_Tab(JTabbedPane tabbedPane,String tab) {
         switch (tab) {
            case "CR - Operações": {
                JPanel cr_op = new cr_operacoes(this);
                tabbedPane.addTab(tab, cr_op);
            }
            break;
            case "CA - Clientes": {
                JPanel ca_cli = new ca_clientes(this);
                tabbedPane.addTab(tab, ca_cli);
            }
            
            break;
            case "PE - Vender" : {
                JPanel InterfaceVendas = new Vendas(this);
                tabbedPane.addTab(tab, InterfaceVendas);
            
          
           }
            
            
            
           
            break;
            default: {
                JOptionPane.showMessageDialog(this, "Não Encontrado o Programa " + tab + ".", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    @Override
    public void remove_Tab(JTabbedPane pane) {
        int sel = pane.getSelectedIndex();
        pane.removeTabAt(sel);
    }

    @Override
    public int buscaCliente(JTextField text) {
          int num = 0;
        Thread tela;
        tela = new Thread(() -> {
            synchronized (InterERP.this) {
                pesquisa_de_clientes ps = new pesquisa_de_clientes(text);
                ps.setVisible(true);
                // num = ps.cliente;
                notify();
            }
          });

        synchronized (tela) {
            try {

                tela.wait();
            } catch (InterruptedException ex) {
                Exceptions.printStackTrace(ex);
            }
        }
        return num;
    }

    @Override
    public void fecharVendas() {
        
    }

}
