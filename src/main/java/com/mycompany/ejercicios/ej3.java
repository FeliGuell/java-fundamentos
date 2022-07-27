/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicios;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;


/**
 *
 * @author felig
 */
public class ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
        //en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
        
        String frase;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Escriba una frase: ");
        
        frase = leer.nextLine();
        
        System.out.println("Frase en Mayúsculas: "+toUpperCase(frase));
        System.out.println("Frase en Minúsculas: "+toLowerCase(frase));
        
    }
    
}
