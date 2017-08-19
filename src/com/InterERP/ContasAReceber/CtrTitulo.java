/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.InterERP.ContasAReceber;

import java.util.Date;

/**
 *
 * @author david
 */
public class CtrTitulo {
    String titulo;
    CtrParcela[] pacelas;
    int loja;
    Date emissao;
    Date movimento;
    Date vencimento;
    Date UltPagamento;
    Date UltAlteracao;
    CtrSituacao situacao;
    double valorOriginal;
    double valorTitulo;
    double juroTitulo;
    double multaTitulo;
    double taxaTitulo;
    double impostoTitulo;
    double saldoTitulo;
    double descontoTitulo;
            
}
