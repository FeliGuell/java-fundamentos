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
public class ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
        //números al usuario hasta que la suma de los números introducidos supere el límite inicial.
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese límite: ");
        int limite = leer.nextInt();
        
        int suma=0;
        
        while(limite>suma){
            System.out.println("Ingrese número a sumar: ");
            int num = leer.nextInt();
            suma+=num;
            System.out.println("Suma: "+suma);
        }
       
       
        
    }
    
}
