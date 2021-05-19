/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vetores;

import javax.swing.JOptionPane;

/**
 *
 * @author Stokler
 */
public class Principal {

    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo();

        veiculo.cadMarca();
        JOptionPane.showMessageDialog(null, veiculo.veiculosCadastrados());
        JOptionPane.showMessageDialog(null, 
                veiculo.veiculoPesquisa(Integer.parseInt(JOptionPane.showInputDialog("Código"))));
    }
}
