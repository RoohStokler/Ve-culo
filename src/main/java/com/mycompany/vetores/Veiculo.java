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
public class Veiculo {

    private String marca[] = new String[3];
    private String modelo[] = new String[3];

    public void cadMarca() {

        for (int i = 0; i < marca.length; i++) {
            marca[i] = JOptionPane.showInputDialog("Digite a marca " + i);
            modelo[i] = JOptionPane.showInputDialog("Digite o modelo " + i);
        }
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        String result = "";
        int indice = 0;

        while (indice < marca.length) {
            result += marca[indice] + "\n";
            indice++;
        }
        return result;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        String result = "";
        int indice = 0;

        while (indice < modelo.length) {
            result += modelo[indice] + "\n";
            indice++;
        }
        return result;
    }
    
    public String veiculosCadastrados(){
        String result = "";
        for (int i = 0; i < marca.length; i++) {
            result += marca[i] + " - " + modelo[i] + "\n";            
        }
        return result;
    }
    
    public String veiculoPesquisa(int indice){
        return marca[indice] + " - " + modelo[indice];
    }
    
}
