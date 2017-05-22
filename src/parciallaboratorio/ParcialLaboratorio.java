/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parciallaboratorio;

import javax.swing.JOptionPane;

/**
 *
 * @author JHON JAIRO DIAZ
 */
public class ParcialLaboratorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese un número"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese otro número"));
        int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el último número"));
        int resultado = multiplicar(numero1, numero2, numero3);
        JOptionPane.showMessageDialog(null, "El resultado es: "+resultado);
    }
    
    public static int multiplicar(int numero1, int numero2, int numero3) {
        int operacion = (numero1 * numero2)*numero3;
        return operacion;
    }
    
    
}
