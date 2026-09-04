/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio33;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class Ejercicio33 {

    public static void main(String[] args) {

        System.out.println("Simulación de incendio forestal");

        int[][] Bosque = new int[10][10];
        Random random = new Random();
        int cerillo = 0, fila = 0, columna = 0;
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < Bosque.length; i++) {

            for (int j = 0; j < Bosque[i].length; j++) {

                Bosque[i][j] = random.nextInt(2);

                System.out.print(Bosque[i][j] + " ");
            }
            System.out.println();
        }

        while (true) {

            System.out.println("---------------");
            System.out.println("Equipar cerillo");
            System.out.println("1 = SI");
            System.out.println("0 = Salir");
            cerillo = teclado.nextInt();
            
            if (cerillo == 0) {
                System.out.println("Simulación terminada");
                break;
            }

            System.out.println("Digite la fila donde quiere tirar el cerillo");
            fila = teclado.nextInt();
            System.out.println("Digite la columna donde quiere tirar el cerillo");
            columna = teclado.nextInt();

            if (fila < 0 || fila > 9 || columna < 0 || columna > 9) {

                System.out.println("Posición inválida");
                continue;
            }

            switch (Bosque[fila][columna]) {

                case 1:

                    System.out.println("Cerillo lanzado en posición ["+ fila + "][" + columna + "]");
                    Bosque[fila][columna] = 2;
                    break;

                case 0:

                    System.out.println("Vacío");
                    System.out.println("Se apagó el fuego");
                    continue;

                case 2:

                    System.out.println("Ya hay fuego ahí");
                    continue;

                case 3:

                    System.out.println("Árbol quemado");
                    continue;
            }

            while (true) {

                int[][] Bosque2 = new int[10][10];
                for (int i = 0; i < Bosque.length; i++) {
                    for (int j = 0; j < Bosque[i].length; j++) {

                        Bosque2[i][j] = Bosque[i][j];
                    }
                }

                for (int i = 0; i < Bosque.length; i++) {
                    for (int j = 0; j < Bosque[i].length; j++) {

                        if (Bosque[i][j] == 2) {

                            if (i > 0 && Bosque[i - 1][j] == 1) {

                                Bosque2[i - 1][j] = 2;
                            }

                            if (i < 9 && Bosque[i + 1][j] == 1) {

                                Bosque2[i + 1][j] = 2;
                            }

                            if (j > 0 && Bosque[i][j - 1] == 1) {

                                Bosque2[i][j - 1] = 2;
                            }

                            if (j < 9 && Bosque[i][j + 1] == 1) {

                                Bosque2[i][j + 1] = 2;
                            }

                            Bosque2[i][j] = 3;
                        }
                    }
                }
                for (int i = 0; i < Bosque.length; i++) {
                    for (int j = 0; j < Bosque[i].length; j++) {
                        
                        Bosque[i][j] = Bosque2[i][j];
                    }
                }

                System.out.println("TABLERO ACTUALIZADO:");

                for (int i = 0; i < Bosque.length; i++) {
                    for (int j = 0; j < Bosque[i].length; j++) {

                        System.out.print(Bosque[i][j] + " ");
                    }
                    System.out.println();
                }

                boolean quedanArboles = false;

                for (int i = 0; i < Bosque.length; i++) {

                    for (int j = 0; j < Bosque[i].length; j++) {

                        if (Bosque[i][j] == 1) {
                            quedanArboles = true;
                        }
                    }
                }

                if (!quedanArboles) {

                    System.out.println("TODO EL BOSQUE SE HA QUEMADO");
                    break;
                }

                try {

                    Thread.sleep(1000);

                } catch (InterruptedException e) {

                    e.printStackTrace();
                }
            }
        }
    }
}

