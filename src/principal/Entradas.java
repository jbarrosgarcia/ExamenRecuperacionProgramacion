/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import javax.swing.JOptionPane;

/**
 *
 * @author jbarrosgarcia
 */
public class Entradas {

    private String grada;
    private int prezo;

    public Entradas() {

    }

    public Entradas(String grada, int prezo) {
        this.grada = grada;
        this.prezo = prezo;
    }

    public void llenarEntrada() {
        this.grada = JOptionPane.showInputDialog("Introducir grada");
        this.prezo = Integer.parseInt(JOptionPane.showInputDialog("introducir precio"));
    }

    public String getGrada() {
        return grada;
    }

    public void setGrada(String grada) {
        this.grada = grada;
    }

    public int getPrezo() {
        return prezo;
    }

    public void setPrezo(int prezo) {
        this.prezo = prezo;
    }

    @Override
    public String toString() {
        return "Entradas{" + "grada=" + grada + ", prezo=" + prezo + '}';
    }

}
