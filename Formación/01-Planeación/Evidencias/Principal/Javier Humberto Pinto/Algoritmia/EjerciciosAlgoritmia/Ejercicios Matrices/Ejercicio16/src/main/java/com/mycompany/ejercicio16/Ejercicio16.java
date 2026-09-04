/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio16;

import java.util.Random;

/**
 *
 * @author ~ Shino ~
 */
public class Ejercicio16 {

    public static void main(String[] args) {
        System.out.println("Suma de Bordes y Centro");
        
        int [][] Matriz = new int [4][4];
        Random random = new Random ();
        int sumabordes=0,sumainternos=0;
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                
                Matriz[i][j]=random.nextInt(10);
                
                System.out.printf("%-5s", +Matriz[i][j]+ " ");
            }
            System.out.println();
        }
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                
                if (i==0||i==Matriz.length-1||j==0||j==Matriz[i].length -1) {
                    
                    sumabordes += Matriz[i][j];
                
                }else{
                    
                    sumainternos += Matriz[i][j];
                }
            }
        }
        
        System.out.println("La suma de los bordes es = "+sumabordes);
        System.out.println("La suma de los internos es = "+sumainternos);
    }
}



