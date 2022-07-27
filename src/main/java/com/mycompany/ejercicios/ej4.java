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
public class ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
        //Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
        
        Scanner leer = new Scanner(System.in);
        float gradosC, gradosF;
        
        System.out.println("Ingrese grados centígrados: ");
        gradosC = leer.nextFloat();
        
        gradosF = 32+(9*gradosC/5);
        
        System.out.println("Equivalente en grados Fahrenheit:"+gradosF);
    }
    
}
