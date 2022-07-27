/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author felig
 */
public class ej14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crea una aplicación que a través de una función nos convierta una cantidad de euros
        //introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
        //función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
        //una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
        //(void).
            //El cambio de divisas es:
            //* 0.86 libras es un 1 €
            //* 1.28611 $ es un 1 €
            //* 129.852 yenes es un 1 €
       
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese cantidad de euros: ");
        float euro = leer.nextFloat();

        System.out.println("Indique moneda a convertir: \n1.dólares \n2.yenes \n3.libras: ");
        int op = leer.nextInt();

        cambio(op, euro);

    }

    public static void cambio(int tipo, float eu) {
        double res;
        switch (tipo) {
            case 1:
                res = eu * 1.28611;
                System.out.println("Cantidad de euros: €" + eu + ", convertidos a dólares: $" + truncar(res));
                break;
            case 2:
                res = eu * 129.852;
                System.out.println("Cantidad de euros: €" + eu + ", convertidos a yenes: $" + truncar(res));
                break;
            case 3:
                res = eu * 0.86;
                System.out.println("Cantidad de euros: €" + eu + ", convertidos a libras: $" + truncar(res));
                break;
            default:
                System.out.println("Tipo de cambio incorrecto");
                break;
        }
       }
    
    
        public static String truncar(double numero){
        String patron = "#.##";
        DecimalFormat formato = new DecimalFormat(patron);
        String numTruncado = formato.format(numero);
        return numTruncado;
        }
}
    
    
    

