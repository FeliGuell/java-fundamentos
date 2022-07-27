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
public class ej20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
        /*suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
        permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
        El programa deberá comprobar que los números introducidos son correctos, es decir,
        están entre el 1 y el 9.*/
         
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dimension de matriz: ");
        int N = leer.nextInt();
        int[][] matriz = new int[N][N];
        
        rellenar(matriz);
        comparar(matriz);
        
        
      
    }
    
    
    public static void rellenar(int[][] matriz){
      
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Ingrese componente \nFila: "+i+"\nColumna: "+j );
                matriz[i][j] = leer.nextInt();
                while(matriz[i][j] > 9 || matriz[i][j] < 1){
                System.out.println("Ingrese componente correctamente \nFila: "+i+"\nColumna: "+j);
                matriz[i][j] = leer.nextInt();
                }
     
            }
            
        }
        
        //Mostrar matriz
        System.out.println("\n* Matriz:");
        //para cada fila de la matriz
        for(int[] fila: matriz){
            String aux = "";
            //Para cada elemento de la fila
            for(int elemento: fila ){
                aux += " " + elemento;
            }
            System.out.println(aux);
        }
    }
    
    public static void comparar(int[][] matriz){
        int cantErrores = 0;
        int sumaDiagonal1= 0;
        int sumaDiagonal2= 0;
        int sumaMagica = 0;
     
        for (int i = 0; i < matriz.length; i++) {
            sumaDiagonal1 += matriz[i][i];
            sumaDiagonal2 += matriz[i][(matriz.length-1)-i];
          
            
            int sumaFila = 0;
            int sumaColumna = 0;
            
            for (int j = 0; j < matriz.length; j++) {
                
                if(sumaMagica == 0){
                    for (int k = 0; k < matriz.length; k++) {
                        sumaMagica += matriz[0][k];
                    }
                }
               sumaFila += matriz[i][j]; 
               sumaColumna += matriz[j][i]; 

            }
            
            if(!(sumaFila == sumaMagica && sumaColumna==sumaMagica)){
                     cantErrores ++;
                }
        }
         if(!(sumaDiagonal1==sumaMagica && sumaDiagonal2==sumaMagica)){
                     cantErrores ++;  
                }
        System.out.println("La suma mágica es: " + sumaMagica);
        if(cantErrores == 0){
            System.out.println("La matriz es mágica");
        } else {
            System.out.println("La matriz no es mágica");
        }
        
    }
}
