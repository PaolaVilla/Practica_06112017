/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

import javax.swing.JOptionPane;

/**
 * @Instituto Rumiñahui
 * @author Paola
 */
public class ControlFlujo {

    public static void flujoSwitch() {
        int op = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opción"
            + "\n 1. Iteración" 
            + "\n 2. Suma de un arreglo"
            + "\n 3. En construcción"));
        switch (op){
            case 1:
                JOptionPane.showMessageDialog(null, "Caso 1");
                iteracionFor();
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Caso 2");
                sumaArreglo();
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Caso en construcción");
                break;
        }
    }
    
    public static void condicionalDoWhile(){
        int x;
        do {            
            flujoSwitch();
            x = JOptionPane.showConfirmDialog(null, "Desea continuar");
        } while (x!=1);
    }
    
    public static void iteracionFor(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Valor de i: " +i);
            if(i==2 || i==4){
                //break;
                continue;
            }
            System.out.println("Paso de i: " +i);
        }
    }
    
    public static void sumaArreglo(){
        int [] array = {2,4,6};
        int suma = 0;
        
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        JOptionPane.showMessageDialog(null, "La suma de los numeros del array es: " +(++suma));
    }
}
