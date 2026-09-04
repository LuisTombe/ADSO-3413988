/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;

import java.util.Random;

/**
 *
 * @author ~ Shino ~
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        System.out.println("Matriz Inversión Vertical y Horizontal");
        
        int [][] Matriz = new int [5][5];
        
        Random randomcito = new Random ();
        System.out.println("---------------------------");
        System.out.println("MATRIZ NORMAL");
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                
                Matriz[i][j]=randomcito.nextInt(10);
                
                System.out.print(Matriz[i][j]+ " ");
                
            }
            
            System.out.println();
            
        }
        System.out.println("---------------------------");
        System.out.println("MATRIZ INVERTIDA VERTICAL");
        for (int i = Matriz.length -1; i >= 0; i--) {
            for (int j = 0; j < Matriz[i].length; j++) {
                
                System.out.print(Matriz[i][j]+ " ");
                
            }
            
            System.out.println();
            
        }
        System.out.println("---------------------------");
        System.out.println("MATRIZ INVERTIDA HORIZONTAL");
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = Matriz.length -1; j >= 0 ; j--) {
                
                System.out.print(Matriz[i][j]+ " ");
                
            }
            System.out.println();
            
        }
        System.out.println("----------------------------");
        
    }
}