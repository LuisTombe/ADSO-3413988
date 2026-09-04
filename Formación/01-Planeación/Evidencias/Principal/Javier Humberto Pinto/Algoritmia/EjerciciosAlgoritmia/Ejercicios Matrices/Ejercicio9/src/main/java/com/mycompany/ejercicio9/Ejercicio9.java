/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio9;

import java.util.Random;

/**
 *
 * @author ~ Shino ~
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        
        System.out.println("Sistema de Numeros Primos");
        
        int [][] Matriz = new int [5][5];
        Random random = new Random ();
        
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                
                Matriz[i][j]=random.nextInt(10);
                
            }
            
        }
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                
                System.out.printf("%-5s", +Matriz[i][j]+ " ");
                
            }
            System.out.println();
            
        }
        int cantidadprimos=0,cantidadprimosf=0,mayorfila=0;
        for (int i = 0; i < Matriz.length; i++) {
            int primosfila=0;
            for (int j = 0; j < Matriz[i].length; j++) {
                int divisor=0;
                for (int k = 1; k < Matriz[i][j]; k++) {
                    
                    if (Matriz[i][j]%k==0) {
                        
                        divisor++;
                        
                    }
                    
                }
                if (divisor==2) {
                    
                    cantidadprimos++;
                    primosfila++;
                    
                    System.out.println("Primo: " +Matriz[i][j]+ " en ["+i+"] ["+j+"]");
                    
                }
                
            }
            if (primosfila>cantidadprimosf) {
                
                cantidadprimosf=primosfila;
                mayorfila=i;
                
            }
            
        }
        System.out.println("La cantidad de primos total es: "+cantidadprimos);
        System.out.println("La fila con mayor numero de primos es: "+mayorfila);
        System.out.println("La cantidad de primos en esa fila es: "+cantidadprimosf);
    }
}