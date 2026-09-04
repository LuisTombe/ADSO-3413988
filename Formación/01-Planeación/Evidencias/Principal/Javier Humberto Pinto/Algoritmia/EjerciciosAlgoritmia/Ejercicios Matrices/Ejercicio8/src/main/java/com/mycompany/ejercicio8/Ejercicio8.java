/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio8;

import java.util.Random;

/**
 *
 * @author ~ Shino ~
 */
public class Ejercicio8 {

    public static void main(String[] args){
        
        System.out.println("Sistema de Ordenamiento de Filas de Menor a Mayor");
        
        int[][]Matriz = new int [5][5];
        Random random = new Random ();
        
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                
                Matriz[i][j]=random.nextInt(100);
                
            }
            
        }
        for (int i = 0; i < Matriz.length; i++) {
            for (int k = 0; k < Matriz[i].length -1; k++) {
                for (int j = 0; j < Matriz[i].length -1; j++) {
                    
                    if (Matriz[i][j]<Matriz[i][j+1]) {
                        
                        int Auxiliar=Matriz[i][j];
                        
                        Matriz[i][j]=Matriz[i][j+1];
                        
                        Matriz[i][j+1]=Auxiliar;
                        
                    }
                    
                }
                
            }
            
        }
        
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                
                System.out.printf("%-5s", +Matriz[i][j]+ " ");
                
            }
            System.out.println();
            
        }
        
    }
}