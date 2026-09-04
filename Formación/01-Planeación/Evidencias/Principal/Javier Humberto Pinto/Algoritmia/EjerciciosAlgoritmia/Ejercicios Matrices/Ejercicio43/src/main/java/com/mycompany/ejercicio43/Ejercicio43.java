/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio43;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class Ejercicio43 {

    public static void main(String[] args) {
        System.out.println("Simulación de pandemia avanzada");
        
        int [][] Ciudad = new int [25][25];
        
        Random random = new Random ();
        
        Scanner teclado = new Scanner (System.in);
        
        int FilaInfectada,ColumnaInfectada;
        
        
        for (int i = 0; i < Ciudad.length; i++) {
            for (int j = 0; j < Ciudad[i].length; j++) {
                
                Ciudad[i][j]=random.nextInt(2);
                
                if (Ciudad[i][j]==1&&random.nextInt(100)<15) {
                    
                    Ciudad[i][j]=5;
                }
            }
        }
        
        System.out.println("TABLERO INICIAL");
        
        for (int i = 0; i < Ciudad.length; i++) {
            for (int j = 0; j < Ciudad.length; j++) {
                
                System.out.print(Ciudad[i][j]+ " ");
                
            }
            
            System.out.println();
            
        }
        System.out.println("Digite la fila inicial infectada:");
        FilaInfectada=teclado.nextInt();
        System.out.println("Digite la columna inicial infectada");
        ColumnaInfectada=teclado.nextInt();
        
        
        
        }
    }
