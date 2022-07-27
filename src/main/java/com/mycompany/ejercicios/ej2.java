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
public class ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
        // pantalla.
        
       
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Escriba su nombre: ");
        String nombre = leer.next();
        
        System.out.println("Su nombre es: "+nombre);
        
        
        
    }
    
}
