/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ister.modelo;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 * @Instituto Rumiñahui
 * @author Paola
 */
public class PiramideTATA {
    
    public static int[] seriElementos(){
        final int k = 16;
        int d = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de elementos: "));
        int p[] = new int[d];
        int m[] = new int [d];
        for (int i = 0; i < m.length; i++) {
            if (i==0){
                m[i] = 6;
                p[i] = m[i]+k;
            }
            else{
                p[i]= p[i-1]+k;
                m[i]= p[i-1]+m[i-1];
            }
        }
        //System.out.println(Arrays.toString(p));
        //System.out.println(Arrays.toString(m));
        JOptionPane.showMessageDialog(null, Arrays.toString(m));
        return m;
    }
    
    public static void piramide(){
        
        int numero = 6;
        int filasMaxima = 5;
        int numeroActual = numero+16;
        String respuesta = "";
        for (int i = 1; i <= filasMaxima; i++) {
            for (int j = 1; j <= 1; j++) {
                numeroActual = numeroActual + 1;
                respuesta = respuesta + numeroActual + "";
            }
            respuesta = respuesta + "\n";
        }
        JOptionPane.showMessageDialog(null, respuesta);
    }
    
    public static void pisos(){
        int piso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese eñ numero de pisos"));
        for (int i = piso; i >= 1; i--) {
            i=i+piso;
            piso--;
        }
        
    }
}
