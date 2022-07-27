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
public class ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
        // dos. El programa deberá después mostrar el resultado de la suma
        
        
        int num1, num2 ;
        int suma=0;
     
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese dos números: ");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        suma = num1+num2;
        
        System.out.println("La suma de los dos números es: " + suma );
        
    }
    
}
