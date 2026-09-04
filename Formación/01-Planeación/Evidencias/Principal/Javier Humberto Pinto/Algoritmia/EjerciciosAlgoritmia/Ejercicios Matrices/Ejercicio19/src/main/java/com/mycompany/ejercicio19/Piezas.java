/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio19;

import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class Piezas {
    
    public static void piezas (){
        
        String [][] Tablero = new String [8][8];
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("------------------------------------------------------");
        System.out.println("TABLERO DE AJEDREZ                                   /");
        System.out.println("------------------------------------------------------");
        
        for (int i = 0; i < Tablero.length; i++) {
            for (int j = 0; j < Tablero[i].length; j++) {
                
                //Vacios: -;
                Tablero[i][j]="-";
                //Torres: T; 
                Tablero[0][0]="T1";
                Tablero[0][7]="T1";
                Tablero[7][0]="T2";
                Tablero[7][7]="T2";
                //Caballos: L;
                Tablero[0][1]="L1";
                Tablero[0][6]="L1";
                Tablero[7][1]="L2";
                Tablero[7][6]="L2";
                //Alfires: J;
                Tablero[0][2]="J1";
                Tablero[0][5]="J1";
                Tablero[7][2]="J2";
                Tablero[7][5]="J2";
                //Reinas: Q;
                Tablero[0][3]="Q1";
                Tablero[7][3]="Q2";
                //Reyes: K;
                Tablero[0][4]="K1";
                Tablero[7][4]="K2";
                //Peones: i;
                Tablero[1][0]="i1";
                Tablero[1][1]="i1";
                Tablero[1][2]="i1";
                Tablero[1][3]="i1";
                Tablero[1][4]="i1";
                Tablero[1][5]="i1";
                Tablero[1][6]="i1";
                Tablero[1][7]="i1";
                Tablero[6][0]="i2";
                Tablero[6][1]="i2";
                Tablero[6][2]="i2";
                Tablero[6][3]="i2";
                Tablero[6][4]="i2";
                Tablero[6][5]="i2";
                Tablero[6][6]="i2";
                Tablero[6][7]="i2";
            }
            
        }
    }
}
