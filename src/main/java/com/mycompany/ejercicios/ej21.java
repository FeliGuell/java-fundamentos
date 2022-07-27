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
public class ej21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
        3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
        dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
        se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
        que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
        la matriz M en la cual empieza el primer elemento de la submatriz P.*/

        int[][] matriz = new int[10][10];
        int[][] submatriz = new int[3][3];

        carga(matriz, submatriz);

        comprobar(matriz, submatriz);
    }

    public static void carga(int[][] x, int[][] y) {
        for (int[] x1 : x) {
            for (int j = 0; j < x.length; j++) {
                x1[j] = (int) (Math.random() * 10);
            }
        }

        //Mostrar matriz
        System.out.println("\n* Matriz:");
        //para cada fila de la matriz
        for (int[] fila : x) {
            String aux = "";
            //Para cada elemento de la fila
            for (int elemento : fila) {
                aux += " " + elemento;
            }
            System.out.println(aux);
        }

        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < y.length; j++) {
                System.out.println("Ingrese componente: ");
                y[i][j] = leer.nextInt();
            }
        }

        //Mostrar matriz
        System.out.println("\n* Submatriz:");
        //para cada fila de la matriz
        for (int[] fila : y) {
            String aux = "";
            //Para cada elemento de la fila
            for (int elemento : fila) {
                aux += " " + elemento;
            }
            System.out.println(aux);
        }

    }

    public static void comprobar(int[][] x, int[][] y) {
        int c=0, v=0, c9=0, iJ=0, iI=0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (c<3 && v<3 && j<9 && x[i][j] == y[c][v] && x[i][j + 1] == y[c][v + 1]) {
                    iI=i;
                    iJ=j;
                    v++;
                    c9++;
                    if (v == 2) {
                        c++;
                        v=0;
                        c9++;
                    }
                }
            }
        }
        if(c9 == 9){
            System.out.println("Es submatriz\n La posición comienza en la coordenada: \n Fila inicial-> "+ (iI-2) +"\n Columna inicial-> "+(iJ-1));
        } else{
            System.out.println("No es submatriz");
        }
  
    }
}
