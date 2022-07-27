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
public class ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
        //pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
        //la función equals() en Java.
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la contraseña: ");
        String cont = leer.next();
        
        if(cont.equals("eureka")){
            System.out.println("Correcto");         
        }else{
            System.out.println("Incorrecto");
        }
     
    }
}
