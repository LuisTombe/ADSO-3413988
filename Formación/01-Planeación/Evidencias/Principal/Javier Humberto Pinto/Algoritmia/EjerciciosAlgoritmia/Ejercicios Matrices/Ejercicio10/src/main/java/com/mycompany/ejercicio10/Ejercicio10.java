/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio10;

import java.util.Random;

/**
 *
 * @author ~ Shino ~
 */
public class Ejercicio10 {
    
    public static void main(String[] args) {

        Random random = new Random();
        int [][] Matriz = new int [5][5];
        
        System.out.println("ROTACIÓN DE MATRIZ");
        System.out.println("-------------------------------");
        
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                
                Matriz[i][j]=random.nextInt(10);
                
                System.out.printf("%-5s", +Matriz[i][j]+ " ");
                
            }
            System.out.println();
            
        }
        
        System.out.println("ROTACIÓN DE MATRIZ 90 GRADOS");
        System.out.println("-------------------------------");
        
        for (int j = 0; j < Matriz[0].length; j++) {
            for (int i = Matriz.length -1; i >= 0; i--) {
                
                System.out.printf("%-5s", +Matriz[i][j]+ " ");
                
            }
            System.out.println();
            
        }
        
        System.out.println("ROTACIÓN DE MATRIZ 180 GRADOS");
        System.out.println("-------------------------------");
        
        for (int i = Matriz.length -1; i >= 0; i--) {
            for (int j = Matriz.length -1; j >= 0; j--) {
                
                System.out.printf("%-5s", +Matriz[i][j]+ " ");
                
            }
            System.out.println();
            
        }
        
        System.out.println("ROTACIÓN DE MATRIZ 270 GRADOS");
        System.out.println("-------------------------------");
        
        for (int j = Matriz[0].length -1; j >= 0; j--) {
            for (int i = 0; i < Matriz.length; i++) {
                
                System.out.printf("%-5s", +Matriz[i][j]+ " ");
                
            }
            System.out.println();
            
        }
        
        System.out.println("ROTACIÓN DE MATRIZ 360 GRADOS");
        System.out.println("-------------------------------");
        
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {  
                
                System.out.printf("%-5s", +Matriz[i][j]+ " ");
                
            }
            System.out.println();
            
        }
    }
}