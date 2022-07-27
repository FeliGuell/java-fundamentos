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
public class ejE23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
        que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
        20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
        será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
        rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
        por pantalla la sopa de letras creada.654654654
        Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
        de Java substring(), Length() y Math.random().*/
        
        
        Scanner leer = new Scanner(System.in);
        String palabra = "";
        boolean invalido = false;
        char[][] letras = new char[5][5];
        for (int i = 0; i < 5; i++) {
            System.out.println("\nIngrese la palabra "+(i+1));
            do{
                palabra = leer.next();
                if(palabra.length() > 2 && palabra.length()<6){
                    invalido = false;
                }else{
                    System.out.println("\nIngrese la palabra correctamente entre 3 y 5 caracteres");
                    invalido = true;
                }
            }
            while(invalido);
            
            for (int j = 0; j < palabra.length(); j++) {
                letras[i][j] = palabra.charAt(j);
            }
           
        }
        
         matriz(letras,palabra.length());
        
        
    }
    
    public static void matriz(char[][] letras, int x){
        Scanner leer = new Scanner(System.in);
        char[][] caracteres = new char[20][20];
        int[] filas = new int[5];
        int c=0;
        boolean lleno = false;

        for (int j = 0; j < 5; j++) {
            //Fila aleatoria 
            int fila = (int) (Math.random()*20);
            filas[j]= fila;
            while(c<5 && filas[c]==fila){
                    fila = (int) (Math.random()*20);
                    filas[j]= fila;
                    c++;
            }
            c=0;

            //Columna inicial aleatoria
            int k = (int) (Math.random()*16);
            
            
            //Rellenar espacios con números 
            while(!lleno){
            int radix = 10;
            //System.out.println("\nIngrese relleno: ");
            //char relleno = leer.next().charAt(0);
             for (int i = 0; i < 20; i++) {
                 for (int l = 0; l < 20; l++) {
                     caracteres[i][l] = Character.forDigit((int)(Math.random()*10),radix);
                     //caracteres[i][l] = relleno;
                 }  
            }   
            lleno = true;
            }
           
          
            //Sobreescribir con carga de palabra
             for (int i = 0; i < x; i++) {
                caracteres[fila][k] = letras[j][i];  
                k++;
            } 
        }

        mostrar(caracteres);
        
    }
    
    
    public static void mostrar(char[][] matriz){
        //Mostrar matriz
        System.out.println("\n* Sopa de letras para niños:");
        //para cada fila de la matriz
       
        for(char[] fila: matriz){
        String aux = "";
        //Para cada elemento de la fila
        for(char elemento: fila ){
        aux += " " + elemento;
        }
        System.out.println(aux);
        }
        
        
    }  
}
    

