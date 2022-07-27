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
public class ej16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
        // usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
        // numero y si se encuentra repetido
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dimension de vector: ");
        int N = leer.nextInt();
        int[] vector = new int[N];
        
        rellenar(vector);
        mostrar(vector);
        
        System.out.println("\nIngrese número a buscar: ");
        int num = leer.nextInt();
        
        busqueda(vector, num);
    
      
    }
    
    
    public static void rellenar(int[] vector){
      
        for (int i = 0; i < vector.length; i++) {
           
            vector[i] = (int) (Math.random()*100);
        }
    }
    
      public static void mostrar(int[] vector){
        for (int elemento:vector) {
           System.out.print(elemento + " ");
        }
    }
      
    public static void busqueda(int[] vector, int num) {
        int c=0;
        boolean encontro = false;
        for (int i=0;i<vector.length;i++) {
            if (vector[i] == num){
                System.out.println("El número se encuentra en la posición "+(i+1));
                encontro = true;
                c+=1;
            } 
        }
        
        if(c>1)
            System.out.println("El número se encuentra repetido");
        
        if(!encontro) 
            System.out.println("No se encontró el elemento");
} 
}
