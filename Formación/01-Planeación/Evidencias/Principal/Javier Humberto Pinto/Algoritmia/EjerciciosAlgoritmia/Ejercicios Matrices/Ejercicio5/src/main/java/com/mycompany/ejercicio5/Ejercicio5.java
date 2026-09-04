/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        System.out.println("Juego de Batalla Naval Simplificado");
        
        int [][]Tablero = new int [10][10];
        Random random = new Random ();
        Scanner teclado= new Scanner (System.in);
        
        for (int i = 0; i < Tablero.length; i++) {
            for (int j = 0; j < Tablero[i].length; j++) {
                
                Tablero[i][j]=random.nextInt(3);
                //Agua=0,Barco=1,BarcoDestruido=2;
                if (Tablero[i][j]==2) {
                    Tablero[i][j]=0;
                    
                }
                
            }
        }
        System.out.println("-------------------");
        System.out.println("TABLERO DE GUERRA");
        System.out.println("-------------------");

        for (int i = 0; i < Tablero.length; i++) {
            for (int j = 0; j < Tablero[i].length; j++) {
                
                System.out.printf("%-2s", +Tablero[i][j]);
                
            }
            System.out.println();
        }
        
        int fila=0,columna=0;
        
        while (true){
            
            System.out.println("Ingrese la posición del barco que quiere destruir");
            System.out.println("Digite la posición X "+fila+" de el barco");
            fila=teclado.nextInt();
            System.out.println("Digite la posición Y "+columna+" de el barco");
            columna=teclado.nextInt();
            
            switch (Tablero[fila][columna]){
                case 0:
                    System.out.println("AGUA");
                    System.out.println("Intente en disparar en otra posición");
                    break;
                case 1:
                    System.out.println("¡¡EXPLOSION!! - BARCO DESTRUIDO");
                    System.out.println("Destrucción exitosa de su barco en la posición X: "+fila+" y "+columna);
                    Tablero[fila][columna]=2;
                    break;
                case 2:
                    System.out.println("BARCO PREVIAMENTE DESTRUIDO ");
                    System.out.println("Intente en disparar otra posición");
                    break;
        }
        System.out.println("-------------------");
        System.out.println("TABLERO ACTUALIZADO");
        System.out.println("-------------------");
        for (int i = 0; i < Tablero.length; i++) {
            for (int j = 0; j < Tablero[i].length; j++) {
                
                System.out.printf("%-2s", +Tablero[i][j]);
                
            }
            System.out.println();
        }
        }
    }
}