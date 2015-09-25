/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete;

import javax.swing.JOptionPane;

/**
 *
 * @author LAB
 */
public class Ejercico6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int [][]matriz={{1,2},
                        {9,5},
                        {7,3},
                        {6,4},
                        {-1,-1},
{-1,-1},
{-1,-1},
{10,8},
{-1,-1},
{-1,-1},
{-1,-1}};
String palabra,msj;
int col=0,e=0;
palabra=JOptionPane.showInputDialog("Ingrese binario");
for (int i = 0; i < palabra.length(); i++) {
if (palabra.charAt(i)=='0') col=0;
if (palabra.charAt(i)=='1') col=1;
e=matriz[e][col];
switch(e){
case 0: JOptionPane.showMessageDialog(null, "vacio");e=0;break;
case 1:
case 2:
case 3:
case 7:break;
case 4: System.out.print(" ");e=0;break;
case 5:System.out.print("S");e=0;break;
case 6:System.out.print("N");e=0;break;
case 8:System.out.print("A");e=0;break;
case 9:System.out.print("L");e=0;break;
case 10:System.out.println("E");e=0;break;
}
}

    }
    
}
