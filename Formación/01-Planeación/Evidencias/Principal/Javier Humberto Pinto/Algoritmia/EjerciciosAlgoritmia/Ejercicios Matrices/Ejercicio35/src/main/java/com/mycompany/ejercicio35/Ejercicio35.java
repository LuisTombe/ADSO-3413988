/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio35;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class Ejercicio35 {

    public static void main(String[] args) {

        System.out.println("Simulacion de Ecosistema");

        Random random = new Random();
        Scanner teclado = new Scanner(System.in);

        int[][] Matriz = new int[6][6];

        //0=vacío, 1 = presa, 2 = depredador

        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {

                int numero=random.nextInt(10);

                if (numero <= 4) {
                    Matriz[i][j]=0;
                } else if (numero <= 8) {
                    Matriz[i][j]=1;
                } else {
                    Matriz[i][j]=2;
                }
            }
        }

        while (true) {

            System.out.println();
            System.out.println("MENU");
            System.out.println("1. Ejecutar ciclo");
            System.out.println("2. Mostrar ecosistema");
            System.out.println("3. Apagar sistema");

            int op = teclado.nextInt();

            switch(op){

                case 1:

                    for (int i = 0; i < Matriz.length; i++) {
                        for (int j = Matriz[i].length - 2; j >= 0; j--) {

                            if (Matriz[i][j]==1&&Matriz[i][j+1]==0) {

                                Matriz[i][j]=0;
                                Matriz[i][j+1]=1;

                            }
                        }
                    }

                    for (int i = 0; i < Matriz.length; i++) {
                        for (int j = 1; j < Matriz[i].length; j++) {

                            if (Matriz[i][j]==1&& Matriz[i][j-1]==0) {

                                int probabilidad=random.nextInt(100);
                                if (probabilidad < 20) {
                                    Matriz[i][j-1]=1;

                                }
                            }
                        }
                    }

                    for (int i = 0; i < Matriz.length; i++) {
                        for (int j = Matriz[i].length - 2; j >= 0; j--) {

                            if (Matriz[i][j]==2) {
                                if (Matriz[i][j+1]==1) {

                                    Matriz[i][j]=0;
                                    Matriz[i][j+1]=2;

                                    int probabilidad=random.nextInt(100);

                                    if (probabilidad<10){
                                        Matriz[i][j]=2;
                                        
                                    }
                                    
                                } else if (Matriz[i][j+1]==0){

                                    Matriz[i][j]=0;
                                    Matriz[i][j+1]=2;

                                }
                            }
                        }
                    }

                    for (int i = 0; i < Matriz.length; i++) {
                        for (int j = 0; j < Matriz[i].length; j++) {

                            if (Matriz[i][j]==1){

                                int probabilidad=random.nextInt(100);
                                if (probabilidad<5){
                                    Matriz[i][j]=0;

                                }
                            }

                            if (Matriz[i][j]==2){

                                int probabilidad=random.nextInt(100);

                                if (probabilidad<3){

                                    Matriz[i][j]=0;

                                }
                            }
                        }
                    }

                    for (int i = 0; i < Matriz.length; i++) {
                        for (int j = 0; j < Matriz[i].length; j++) {

                            if (Matriz[i][j]==0){
                                System.out.printf("%-4s",".");
                            }

                            if (Matriz[i][j]==1) {
                                System.out.printf("%-4s","P");
                            }

                            if (Matriz[i][j]==2) {
                                System.out.printf("%-4s","D");
                            }

                        }
                        System.out.println();
                    }

                    int vacios = 0;
                    int presas = 0;
                    int depredadores = 0;

                    for (int i = 0; i < Matriz.length; i++) {
                        for (int j = 0; j < Matriz[i].length; j++) {

                            if (Matriz[i][j]==0){
                                vacios++;
                            }
                            if (Matriz[i][j]==1){
                                presas++;
                            }
                            if (Matriz[i][j]==2){
                                depredadores++;
                            }
                        }
                    }

                    System.out.println();
                    System.out.println("ESTADISTICAS");
                    System.out.println("---------------------");
                    System.out.println("Espacios vacios: "+vacios);
                    System.out.println("Presas: "+presas);
                    System.out.println("Depredadores: "+depredadores);
                    break;

                case 2:

                    System.out.println();

                    for (int i = 0; i < Matriz.length; i++) {
                        for (int j = 0; j < Matriz[i].length; j++) {

                            if (Matriz[i][j]==0){
                                System.out.printf("%-4s",".");
                            }
                            if (Matriz[i][j]==1){
                                System.out.printf("%-4s","P");
                            }
                            if (Matriz[i][j]==2){
                                System.out.printf("%-4s","D");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 3:

                    System.out.println("Apagando sistema...");
                    return;

            }

        }

    }

}