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
public class ej17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
        // de 2 dígitos, etcétera (hasta 5 dígitos).
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dimension de vector: ");
        int N = leer.nextInt();
        int[] vector = new int[N];
        
        rellenar(vector);
        busqueda(vector);
    }
    
    public static void rellenar(int[] vector){
      
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 20000);
        }
        
        for (int elemento:vector) {
            System.out.print(elemento + " ");
        }
    }
    
    public static void busqueda(int vector[]){
        int uno=0,dos=0,tres=0,cuatro=0,cinco=0;
        for (int i = 0; i < vector.length; i++) {
            String digitos=Integer.toString(vector[i]);
           
            switch (digitos.length()) {
                case 1:
                        uno++;
                    break;
                case 2:
                        dos++;
                    break;
                case 3:
                        tres++;
                    break;
                case 4:
                        cuatro++;
                    break;
                case 5:
                        cinco++;
                    break;
                default:
                    throw new AssertionError();
            }
        }
        System.out.println("\nLa cantidad de numeros \n De 1 digito hay: " + uno + " \n De 2 digitos hay: " + dos + "\n De 3 digitos hay: " + tres + "\n De 4 digitos hay: " + cuatro + "\n De 5 digitos hay: " + cinco);

       
    }
    
}

