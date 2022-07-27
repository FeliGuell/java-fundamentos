/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicios;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author felig
 */
public class ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar un programa que pida dos números enteros positivos por teclado y muestre por
        pantalla el siguiente menú:
        MENU
                1. Sumar
                2. Restar
                3. Multiplicar
                4. Dividir
                5. Salir
                Elija opción:
        
        El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
        y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
        Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
        directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
        desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
        programa, caso contrario se vuelve a mostrar el menú.*/
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese número 1 y número 2: ");
        float n1 = leer.nextFloat();
        float n2 = leer.nextFloat();
        
        boolean salir = false;
        
        while(salir == false){
            
        System.out.println("\nMENU: \n1.Sumar \n2.Restar \n3.Multiplicar \n4.Dividir \n5.Salir \nElija opción\n");
        int op = leer.nextInt();
        
        float res;
        
        switch (op) {
            case 1:
                   res = n1+n2;
                   System.out.println("Resultado: "+res);
                    break;
            case 2:
                    res = n1-n2;
                   System.out.println("Resultado: "+res);
                    break;
            case 3:
                    res = n1*n2;
                   System.out.println("Resultado: "+res);
                    break;
            case 4:
                    res = n1/n2;
                   System.out.println("Resultado: "+res);
                    break;
            case 5:
                    System.out.println("\n¿Está seguro de que desea salir(S/N)?");
                    String s = leer.next();
                    if(toUpperCase(s).equals("S")){
                        salir = true;
                        System.out.println("\nAdiós");
                    }
                    break;
                
            default:
                System.out.println("Opción inválida");
                break;
            }
        }
        
    }
   
    
}
