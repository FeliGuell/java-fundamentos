/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicios;

import java.util.Scanner;

/**
 *
 * @author felig
 */
public class ej13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
        //cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba la cantidad de lados: ");
        int lados = leer.nextInt();
   
        for (int i = 0; i < lados; i++) {
            for (int j = 0; j < lados; j++) {
                if(i==0 || j==0 || j==lados-1 || i==lados-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");    
                }
            }
            System.out.println("");
        }   
    }
    
}
