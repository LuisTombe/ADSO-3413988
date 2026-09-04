/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio32;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class Ejercicio32 {

    public static void main(String[] args) {

        System.out.println("Sistema Bancario por Sucursales");

        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        int f=0,c=0;

        System.out.println("Ingrese numero de [filas] y [columnas]");
        System.out.println("Filas:");
        f=teclado.nextInt();
        System.out.println("Columnas:");
        c=teclado.nextInt();

        String[][] Matriz = new String[f][c];

        Matriz[0][0] = "SUCURSALES";
        Matriz[0][1] = "LUNES";
        Matriz[0][2] = "MARTES";
        Matriz[0][3] = "MIERCOLES";
        Matriz[0][4] = "JUEVES";
        Matriz[0][5] = "VIERNES";
        Matriz[0][6] = "SABADO";
        Matriz[0][7] = "DOMINGO";
        
        System.out.println("Instructor, ingrese solo 8 columnas, las filas las que sean, pero columnas = 8");

        for (int i = 1; i < Matriz.length; i++) {

            Matriz[i][0]="SUCURSAL"+i;

        }

        for (int i = 1; i < Matriz.length; i++) {
            for (int j = 1; j < Matriz[i].length; j++) {

                Matriz[i][j]=String.valueOf(random.nextInt(10001));

            }
        }

        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {

                System.out.printf("%-15s", Matriz[i][j]);

            }
            System.out.println();
        }
        System.out.println();

        double sucursalMayor=0,totalGeneral=0;
        String nombreSucursalMayor = "";

        for (int i = 1; i < Matriz.length; i++) {
            double suma = 0;
            for (int j = 1; j < Matriz[i].length; j++) {

                double valor = Double.parseDouble(Matriz[i][j]);
                suma += valor;
                totalGeneral += valor;

                if (valor < 0) {
                    System.out.println("Transaccion sospechosa en fila " +i+ " columna " +j);

                }
            }

            double promedio = suma / (c - 1);

            System.out.println("Sucursal: " + Matriz[i][0]);
            System.out.println("Total ingresos: " + suma);
            System.out.println("Promedio: " + promedio);

            if (suma > sucursalMayor) {
                sucursalMayor = suma;
                nombreSucursalMayor = Matriz[i][0];

            }
        }

        double mayorDia = 0,menorDia = Double.MAX_VALUE;
        String nombreMayorDia = "";
        String nombreMenorDia = "";

        for (int j = 1; j < Matriz[0].length; j++) {
            double sumaDia = 0;
            for (int i = 1; i < Matriz.length; i++) {

                sumaDia += Double.parseDouble(Matriz[i][j]);

            }
            if (sumaDia > mayorDia) {
                mayorDia = sumaDia;
                nombreMayorDia = Matriz[0][j];

            }
            if (sumaDia < menorDia) {
                menorDia = sumaDia;
                nombreMenorDia = Matriz[0][j];

            }
        }

        double promedioGeneral = totalGeneral / ((f - 1) * (c - 1));

        System.out.println("-------------------------------------");
        System.out.println("REPORTE GENERAL");
        System.out.println("-------------------------------------");
        System.out.println("Total General: " + totalGeneral);
        System.out.println("Promedio General: " + promedioGeneral);
        System.out.println("Sucursal con mayores ingresos: " + nombreSucursalMayor + " Total: " + sucursalMayor);
        System.out.println("Dia con mayores ingresos: " + nombreMayorDia + " Total: " + mayorDia);
        System.out.println("Dia con menores ingresos: " + nombreMenorDia + " Total: " + menorDia);

    }
}
