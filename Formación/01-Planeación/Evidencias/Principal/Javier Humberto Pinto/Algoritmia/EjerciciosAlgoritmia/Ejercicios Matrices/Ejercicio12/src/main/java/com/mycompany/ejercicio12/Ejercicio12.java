/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio12;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class Ejercicio12 {

    public static void main(String[] args) {

        Random random = new Random();
        int[][] Matriz = new int[5][5];

        System.out.println("MATRIZ NORMAL");

        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {

                Matriz[i][j] = random.nextInt(10);

                System.out.printf("%-5s", Matriz[i][j]);

            }
            System.out.println();
        }

        int arriba = 0;
        int abajo = Matriz.length - 1;
        int izquierda = 0;
        int derecha = Matriz[0].length - 1;

        System.out.println("RECORRIDO EN ESPIRAL");

        while (arriba <= abajo && izquierda <= derecha) {

            for (int j = izquierda; j <= derecha; j++) {
                System.out.print(Matriz[arriba][j] + " ");
            }
            arriba++;
                                   

            for (int i = arriba; i <= abajo; i++) {
                System.out.print(Matriz[i][derecha] + " ");
            }
            derecha--;
            
            if (arriba <= abajo) {
                
                for (int j = derecha; j >= izquierda; j--) {
                    System.out.print(Matriz[abajo][j]+ " ");
                    
                }
                
                abajo--;
                
            }
            if (izquierda <= derecha) {
                
                for (int i = abajo; i >= arriba; i--) {
                    System.out.print(Matriz[i][izquierda]+ " ");
                    
                }
                izquierda++;
            }
        }
    }
}
    

