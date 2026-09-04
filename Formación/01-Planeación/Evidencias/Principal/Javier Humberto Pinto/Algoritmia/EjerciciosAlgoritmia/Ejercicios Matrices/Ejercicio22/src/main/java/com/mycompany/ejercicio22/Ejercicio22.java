/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio22;

import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class Ejercicio22 {
    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String[][] Memoria = {
            {"A","B","C","D"},
            {"A","B","C","D"},
            {"E","F","G","H"},
            {"E","F","G","H"}
        };

        String[][] Visible = new String[4][4];

        int intentos = 0;
        int parejas = 0;

        for (int i = 0; i < Visible.length; i++) {
            for (int j = 0; j < Visible[i].length; j++) {

                Visible[i][j] = "?";

            }
        }

        while (parejas < 8) {

            System.out.println("TABLERO");

            for (int i = 0; i < Visible.length; i++) {
                for (int j = 0; j < Visible[i].length; j++) {

                    System.out.printf("%-3s", Visible[i][j]);

                }
                System.out.println();
            }

            System.out.println("Primera posicion");
            int f1 = teclado.nextInt();
            int c1 = teclado.nextInt();

            System.out.println("Segunda posicion");
            int f2 = teclado.nextInt();
            int c2 = teclado.nextInt();

            intentos++;

            if (Memoria[f1][c1].equals(Memoria[f2][c2])) {

                Visible[f1][c1] = Memoria[f1][c1];
                Visible[f2][c2] = Memoria[f2][c2];

                parejas++;

                System.out.println("COINCIDENCIA");

            } else {

                System.out.println("NO COINCIDEN");

            }
        }

        System.out.println("GANASTE");
        System.out.println("Intentos: " + intentos);
    }
}
