/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author felig
 */
public class ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escribir un programa que lea un número entero por teclado y muestre por pantalla el
        //doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
        
        int num;
        Scanner leer = new Scanner(System.in);
       
        System.out.println("Escribir un número:");
        num= leer.nextInt();
        
        // Truncar los decimales de un double
        double trunc = Math.sqrt(num);
        String pattern = "#.####";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        String formattedDouble = decimalFormat.format(trunc);
        
        
        System.out.println("Doble: "+(num*2)+" \nTriple:"+(num*3)+" \nRaíz Cuadrada: "+ formattedDouble );
    }
    
}
