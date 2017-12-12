/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ister.vista;

import ec.edu.ister.modelo.FormacionPrimosSuma;
import ec.edu.ister.modelo.PiramideTATA;
import javax.swing.JOptionPane;

/**
 * @Instituto Rumiñahui
 * @author Paola
 */
public class Aplicacion {
    public static void main(String[] args) {
        //PiramideTATA.seriElementos();
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        JOptionPane.showMessageDialog(null, FormacionPrimosSuma.esPrimo(n));
    }
}
