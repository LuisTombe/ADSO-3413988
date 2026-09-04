/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio26;

import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class Ejercicio26 {

    public static void main(String[] args) {
        System.out.println("SIMULADOR DE CINE");
        
        Scanner teclado = new Scanner(System.in);

        String[][] Cine = new String[5][5];

        for (int i = 0; i < Cine.length; i++) {
            for (int j = 0; j < Cine[i].length; j++) {

                Cine[i][j] = "L";

            }
        }

        while (true) {

            System.out.println("CINE");

            for (int i = 0; i < Cine.length; i++) {
                for (int j = 0; j < Cine[i].length; j++) {

                    System.out.printf("%-3s", Cine[i][j]);

                }
                System.out.println();
            }

            System.out.println("1. Reservar");
            System.out.println("2. Cancelar");
            System.out.println("3. Ocupacion");
            System.out.println("4. Salir");

            int op = teclado.nextInt();

            switch (op) {

                case 1:

                    System.out.println("Fila:");
                    int f = teclado.nextInt();

                    System.out.println("Columna:");
                    int c = teclado.nextInt();

                    if (Cine[f][c].equals("R")) {

                        System.out.println("Silla ya reservada");

                    } else {

                        Cine[f][c] = "R";
                        System.out.println("Reserva realizada");

                    }

                    break;

                case 2:

                    System.out.println("Fila:");
                    f = teclado.nextInt();

                    System.out.println("Columna:");
                    c = teclado.nextInt();

                    Cine[f][c] = "L";

                    System.out.println("Reserva cancelada");

                    break;

                case 3:

                    int ocupadas = 0;

                    for (int i = 0; i < Cine.length; i++) {
                        for (int j = 0; j < Cine[i].length; j++) {

                            if (Cine[i][j].equals("R")) {

                                ocupadas++;

                            }
                        }
                    }

                    double porcentaje =
                            (double) ocupadas * 100 /(Cine.length * Cine[0].length);

                    System.out.println("Ocupacion: " + porcentaje + "%");

                    break;

                case 4:

                    return;
            }
        }
    }
}