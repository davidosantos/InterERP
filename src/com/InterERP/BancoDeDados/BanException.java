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
public class BanException extends Exception {

    /**
     * Creates a new instance of <code>BanException</code> without detail
     * message.
     */
    public BanException() {
    }

    /**
     * Constructs an instance of <code>BanException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public BanException(String msg) {
        super(msg);
    }
}
