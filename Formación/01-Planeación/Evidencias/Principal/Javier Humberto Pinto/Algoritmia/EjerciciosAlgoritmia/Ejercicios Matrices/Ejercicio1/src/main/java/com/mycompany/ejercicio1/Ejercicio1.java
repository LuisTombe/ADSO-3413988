 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

import java.util.Random;

/**
 *
 * @author ~ Shino ~
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        System.out.println("Suma de diagonales y diferencia absoluta");
        
        int [][]Matriz = new int [5][5];
        int sumad=0,sumad2=0,diferenciaAB=0;
        Random Bonita = new Random ();
        
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                
                Matriz[i][j]=Bonita.nextInt(10);
                
                if (i==j) {
                    
                    sumad += Matriz[i][j];
                    
                    
                }
                
                if (i+j == Matriz.length -1) {
                    
                    sumad2 += Matriz[i][j];
                    
                }
                
                diferenciaAB=sumad-sumad2;
                
                
            }
            
        }
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz.length; j++) {
                
                System.out.print(Matriz[i][j]+ " ");
                
            }
            System.out.println();
            
        }
        System.out.println("La suma de la primera diagonal es igual a "+sumad);
        System.out.println("La suma de la segunda diagonal es igual a "+sumad2);
        System.out.println("La diferencia absoluta de entre las 2 diagonales es igual a "+diferenciaAB);
        
    }
}
