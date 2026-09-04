/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio20;

import java.util.Random;

/**
 *
 * @author ~ Shino ~
 */
public class Ejercicio20 {

    public static void main(String[] args) {       

        Random random = new Random();

        int[][] Matriz = new int[5][5];
        int ceros=0;

        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {

                Matriz[i][j] = random.nextInt(10);

            }
        }
        System.out.println("MATRIZ NORMAL");
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                
                System.out.printf("%-4s", +Matriz[i][j]+ " ");
                
            }
            System.out.println();
        }
        System.out.println("MATRIZ TRIANGULAR SUPERIOR");
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                
                if (j >= i) {
                    
                    System.out.printf("%-4s", +Matriz[i][j]+ " ");
                    
                }else{
                    
                    System.out.printf("%-4s", "0 ");
                    
                    
                    ceros++;
                    
                }
            }
            System.out.println();
        }
        System.out.println("MATRIZ TRIANGULAR INFERIOR");
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                
                if (i >= j) {
                    
                    System.out.printf("%-4s", +Matriz[i][j]+ " ");
                    
                }else{
                    
                    System.out.printf("%-4s", "0 ");
                    
                    ceros++;
                }
            }
            System.out.println();
        }
        System.out.println("--------------------------");
        System.out.println("Cantidad de ceros = "+ceros);
    }
}
                