/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio56;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class Ejercicio56 {

    public static void main(String[] args) {
        System.out.println("Sistema de recomendacion basica");
        
        String [][] Matriz = new String [5][5];
        Random random = new Random ();
        Scanner teclado = new Scanner (System.in);
        int NP=0;
       
        Matriz[0][0]="Usuario";
        Matriz[0][1]="Netflix";
        Matriz[0][2]="Prime Video";
        Matriz[0][3]="Disney+";
        Matriz[0][4]="HBO Max";
        
        for (int i = 1; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                
                
                if (j==0) {
                    System.out.println("Ingrese el nombre del usuario "+i);
                    Matriz[i][j]=teclado.nextLine();
                    
                }else{
                    
                    System.out.println(" Digite el numero de veces que " + Matriz[i][0]+ " Prefiere " + Matriz[0][j]);
                    
                    NP=teclado.nextInt();
                    
                    while (NP<0){             
                        
                    System.out.println("Error no se permiten NEGATIVOS");
                        
                    NP=teclado.nextInt();
                    
                    }
                    
                    Matriz[i][j]=String.valueOf(NP);
                    
                    teclado.nextLine();
                }
            }
        }
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                
                System.out.printf("%-15s", Matriz[i][j]+ " ");
                
            }
            System.out.println();
        }
    }
}

    


