/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicios;

/**
 *
 * @author felig
 */
public class ej15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
        // muestre por pantalla en orden descendente.
        
        int[] vector = new int[100];
        rellenar(vector);
        ordenar(vector);
        mostrar(vector);
        
        
    }
    
    public static void rellenar(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            vector[i] = i;
        }
    }
    
    public static void ordenar(int[] vector){
        //Método burbuja mejorado
        int temp;
        for(int i=1;i < vector.length;i++){
            for (int j=0 ; j < vector.length- 1; j++){
                if (vector[j] < vector[j+1]){
                    temp = vector[j];
                    vector[j] = vector[j+1];
                    vector[j+1] = temp;
                }
            }
        }
    }
    
    public static void mostrar(int[] vector){
        for (int elemento:vector) {
           System.out.print(elemento + " ");
        }
    }
      
       
}
    

