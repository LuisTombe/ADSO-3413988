/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio17;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class Ejercicio17 {

    public static void main(String[] args) {
        System.out.println("Matriz a Vector");
        
        int [][] Matriz = new int [5][5];
        int [] Vector = new int [25];
        Random random = new Random ();
        Scanner teclado = new Scanner (System.in);
        
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                
                Matriz[i][j]=random.nextInt(5);
                
                System.out.printf("%-5s", +Matriz[i][j]+ " ");
                
            }
            System.out.println();
        }
        
        int op=0;
        
        while(true){
            System.out.println(".");
            System.out.println("-------------------------------------");
            System.out.println("COMO QUIERE SU MATRIZ               /");
            System.out.println("-------------------------------------");
            System.out.println("(1) Normal");
            System.out.println("(2) Vector Filas");
            System.out.println("(3) Vector Columnas");
            System.out.println("(4) Vector Diagonal Principal");
            System.out.println("(5) Vector Diagonal Secundaria");
            System.out.println("(6) Salir");
            op=teclado.nextInt();
        
        switch (op){
            
            case 1:
                
                for (int i = 0; i < Matriz.length; i++) {
                    for (int j = 0; j < Matriz[i].length; j++) {
                        
                        System.out.printf("%-5s", +Matriz[i][j]+ " ");
                    }
                    System.out.println();
                }
                break;
                
            case 2:
                
                for (int i = 0; i < Matriz.length; i++) {
                    for (int j = 0; j < Matriz[i].length; j++) {
                        
                        Vector[i]=Matriz[i][j];
                        
                        System.out.print(Vector[i]+ " ");
                    }
                }
                break;
            
            case 3:
                
                for (int j = 0; j < Matriz[0].length; j++) {
                    for (int i = 0; i < Matriz.length; i++) {
                        
                        Vector[i]=Matriz[i][j];
                        
                        System.out.print(Vector[i]+ " ");
                        
                    }
                    
                }
                break;
            
            case 4:
                
                for (int i = 0; i < Matriz.length; i++) {
                    for (int j = 0; j < Matriz[i].length; j++) {
                        
                        if (i==j) {
                            
                            System.out.print(Matriz[i][j]+ " ");
                        }
                    }
                }
                break;
                
            case 5:
                
                for (int i = 0; i < Matriz.length; i++) {
                    for (int j = 0; j < Matriz[i].length; j++) {
                        
                        if (i+j == Matriz.length -1) {
                            
                            System.out.print(Matriz[i][j]+ " ");
                            
                        }
                    }
                }
                break;
                
            case 6:
                
                System.out.println("SESION TERMINADA");
                return;
                
                default:

                    System.out.println("Opcion invalida");
        }
        }
    }
}
