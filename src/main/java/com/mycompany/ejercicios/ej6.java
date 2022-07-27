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
public class ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un programa que dado un numero determine si es par o impar.
        
        Scanner leer = new Scanner(System.in);
       
        
        System.out.println("Escriba un número: ");
        int num = leer.nextInt();
        
        if(num%2 == 0){
            
            System.out.println("El número es par");
        }else{
            System.out.println("El número es impar");
        }
    
    }
}
