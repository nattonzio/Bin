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
public class Ejercicio_Moore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][]matriz={{1,2,5,10,20},
                        {2,3,6,11,-1},
                        {3,4,7,12,-1},
                        {4,5,8,13,-1},
                        {5,6,9,14,-1},
                        {6,7,10,15,-1},
                        {7,8,11,16,-1},
                        {8,9,12,17,-1},
                        {9,10,13,18,-1},
                        {10,11,14,19,-1},
                        {11,12,15,20,-1},
                        {12,13,16,-1,-1},
                        {13,14,17,-1,-1},
                        {14,15,18,-1,-1},
                        {15,16,19,-1,-1},
                        {16,17,20,-1,-1},
                        {17,18,-1,-1,-1},
                        {18,19,-1,-1,-1},
                        {19,20,-1,-1,-1},
                        {20,-1,-1,-1,-1},
                        {-1,-1,-1,-1,-1}};
            
        String palabra;
        int col=0,e=0,opc;
       
        palabra=JOptionPane.showInputDialog("Ingrese Monedas");
        
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i)=='a') col=0;
            if (palabra.charAt(i)=='b') col=1;
            if (palabra.charAt(i)=='c') col=2;
            if (palabra.charAt(i)=='d') col=3;
            if (palabra.charAt(i)=='e') col=4;
            e=matriz[e][col];
            if (e==-1) {System.out.println("Gracias por tus monedas");   
            }
        }
        
         opc=Integer.parseInt(JOptionPane.showInputDialog("1.CocaCola 2.Fanta 3.Sprite 4.Agua"));
            
            switch(opc){
                case 1: if (e>=18) {System.out.println("Toma tu CocaCola "+ " Vuelto: "+ (float)(e-18)/10);
                    }else{
                    System.out.println("No te alcanza");
                }break;
                case 2: if (e>=16) {System.out.println("Toma tu Fanta "+ " Vuelto: "+ (float)(e-16)/10);
                    }else{
                    System.out.println("No te alcanza");
                }break;
                case 3:if (e>=15) {System.out.println("Toma tu Sprite "+ " Vuelto: "+ (float)(e-15)/10);
                    }else{
                    System.out.println("No te alcanza");
                }break;
                case 4: if (e>=15) {System.out.println("Toma tu Aguita de Coco "+ " Vuelto: "+ (float)(e-15)/10);
                    }else{
                    System.out.println("No te alcanza");
                }break;
                default:
                    System.out.println("Habla, que fue");
            }
        
        }
        
    }
    

