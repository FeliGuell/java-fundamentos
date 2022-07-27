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
public class ejE9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /*  Simular la división usando solamente restas. Dados dos números enteros mayores que
        uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
        Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
        resultado es el residuo, y el número de restas realizadas es el cociente.
            Por ejemplo: 50 / 13:
                50 – 13 = 37 una resta realizada
                37 – 13 = 24 dos restas realizadas
                24 – 13 = 11 tres restas realizadas
        dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
        ¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.*/
      
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dividendo: ");
        int N = leer.nextInt();
        System.out.println("Ingrese divisor: ");
        int D = leer.nextInt();
        int c=0;
        int resta = N;
        while(D<resta){
            resta-=D;
            c++;
        }
        System.out.println("Cociente: "+c+"\nResiduo: "+resta);
    }
    
}
