/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio15;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class Ejercicio15 {

    public static void main(String[] args) {
        System.out.println("[BUSCA MINAS]");
        
        int [][] Matriz = new int [10][10];
        String [][] Cubrimiento = new String [10][10];
        Random random = new Random ();
        Scanner teclado = new Scanner (System.in);
        int descubierta=0;
        
        System.out.println("----------------------------------------------");
        System.out.println("[BUSCA MINAS VISIBLE]");
        System.out.println("----------------------------------------------");
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                
                Matriz[i][j]=random.nextInt(3);
                
                System.out.printf("%-5s", +Matriz[i][j]+ " ");
                
            }
            System.out.println();
        }
        
        System.out.println("----------------------------------------------");
        System.out.println("[BUSCA MINAS OCULTO]");
        System.out.println("----------------------------------------------");
        for (int i = 0; i < Cubrimiento.length; i++) {
            for (int j = 0; j < Cubrimiento[i].length; j++) {
                
                Cubrimiento[i][j]="?";
                
                System.out.printf("%-5s", Cubrimiento[i][j]+ " ");
                
            }
            System.out.println();
        }
        
        int f=0,c=0;
        int op=0;
        
        while (true){
            
            System.out.println("----------------------------------------------");
            System.out.println("[MENU]");
            System.out.println("----------------------------------------------");
            
            System.out.println("Ingrese la acción que quiere realizar");
            System.out.println("(1)Play");
            System.out.println("(2)Rules");
            System.out.println("(3)Exit");
            
            op=teclado.nextInt();
                
            switch (op){
                
                case 1:
                    
                    System.out.println("Elija una posicion");
                    System.out.println("[Fila]");
                    f=teclado.nextInt();
                    System.out.println("[Columna]");
                    c=teclado.nextInt();
                    
                    if (f < 0 || f > 9 || c < 0 || c > 9) {
                        
                        System.out.println("Posicion invalida");
                        break;
                    }

                    if (!Cubrimiento[f][c].equals("?")) {

                        System.out.println("Casilla ya descubierta");
                        break;
                    }
                    
                    switch (Matriz[f][c]){
                        
                        case 0:
                            
                            Cubrimiento[f][c]="0";
                            System.out.println("[SEGURO]");
                            System.out.println("No hay mina");
                            System.out.println("Continue...");
                            descubierta++;
                            
                            break;
                        
                        case 1:
                            
                            Cubrimiento[f][c]="1";
                            System.out.println("[SEGURO]");
                            System.out.println("No hay mina");
                            System.out.println("Continue...");
                            descubierta++;
                            
                            break;
                        
                        case 2:
                            
                            Cubrimiento[f][c]="2";
                            System.out.println("!!BOOM¡¡");
                            System.out.println("MINA ENCONTRADA");
                            System.out.println("USTED [PIERDE]");
                            return;
                    }

                    System.out.println("----------------------------------------------");
                    System.out.println("[TABLERO ACTUALIZADO]");
                    System.out.println("----------------------------------------------");

                    for (int i = 0; i < Cubrimiento.length; i++) {
                        for (int j = 0; j < Cubrimiento[i].length; j++) {

                            System.out.printf("%-5s", Cubrimiento[i][j] + " ");
                        }
                        System.out.println();
                    }

                    if (descubierta >= 5) {

                        System.out.println("¡¡FELICIDADES!!");
                        System.out.println("USTED HA GANADO");

                        return;
                    }

                    break;

                case 2:

                    System.out.println("----------------------------------------------");
                    System.out.println("[RULES]");
                    System.out.println("----------------------------------------------");
                    System.out.println("1. Digite una posicion para [fila] y [columna]");
                    System.out.println("2. Si cae en una mina (2), usted pierde");
                    System.out.println("3. Si cae en una posicion segura continua");
                    System.out.println("4. No puede elegir una posicion ya descubierta");
                    System.out.println("5. Si descubre 5 sitios, usted gana");

                    break;

                case 3:

                    System.out.println("SALIENDO DEL JUEGO...");
                    return;

                default:

                    System.out.println("Opcion invalida");
            }
        }
    }
}
              
