/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio23;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class Ejercicio23 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("..................................");
        System.out.println("SUDOKU");
        System.out.println("..................................");
        int f=0,c=0;
        System.out.println("Ingrese la cantidad de [Filas] [Columnas]");
        System.out.println("Para filas:");
        f=teclado.nextInt();
        System.out.println("Para columnas");
        c=teclado.nextInt();
        
        int[][]Matriz = new int [f][c];
        
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                
                System.out.println("Digite un numero para la fila "+(i+1));
                Matriz[i][j]=teclado.nextInt();
                                
            }
        }
        
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                
                System.out.printf("%-4s", +Matriz[i][j]+ " ");
            
            }
            System.out.println();
        }
        
        boolean valido=true;
        
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                for (int k = j+1; k < Matriz[i].length; k++) {
                    
                    if (Matriz[i][j]==Matriz[i][k]) {
                        
                        valido=false;
                        
                    }
                    
                }
                
            }
            
        }
        
        for (int j = 0; j < Matriz[0].length; j++) {
            for (int i = 0; i < Matriz.length; i++) {
                for (int k = i+1; k < Matriz.length; k++) {
                    
                    if (Matriz[i][j]==Matriz[k][j]) {
                        
                        valido=false;
                        
                    }
                    
                }
                
            }
            
        }
        
        if (valido) {
            
            System.out.println("SUDOKU VALIDO");
            
        }else{
            
            System.out.println("SUDOKU INVALIDO");
            
        }
    }
}
