/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio19;

import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class Ejercicio19 {
    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String[][] Tablero = new String[8][8];
        
        for (int i = 0; i < Tablero.length; i++) {
            for (int j = 0; j < Tablero[i].length; j++) {
                
                Tablero[i][j]="-";
            }
            
        }
        
        //Torres: T
        Tablero[0][0]="T1";
        Tablero[0][7]="T1";
        Tablero[7][0]="T2";
        Tablero[7][7]="T2";
        //Peones: P
        for (int j = 0; j < 8; j++) {
            
            Tablero[1][j]="P1";
            Tablero[6][j]="P2";
            
        }
        
        while(true){
            
            System.out.println("TABLERO");
            
            for (int i = 0; i < Tablero.length; i++) {
                for (int j = 0; j < Tablero[i].length; j++) {
                    
                    System.out.printf("%-4s", Tablero[i][j]+ " ");
                    
                }
                System.out.println();
            }
            
            System.out.println("MENU");
            System.out.println("(1)Mover Pieza");
            System.out.println("(2)Salir");
            
            int op=teclado.nextInt();
            
            switch(op){
                
                case 1:
                    
                    int fo,co,fd,cd;
                    
                    System.out.println("Ingrese la fila de origen");
                    fo=teclado.nextInt();
                    
                    System.out.println("Ingrese la columna de origen");
                    co=teclado.nextInt();
                    
                    if (Tablero[fo][co]==("-")) {
                        System.out.println("No hay ficha en esa posicion");
                        break;
                    }
                    
                    System.out.println("Ingrese la fila de destino");
                    fd=teclado.nextInt();
                    
                    System.out.println("Ingrese la columna de destino");
                    cd=teclado.nextInt();
                    
                    Tablero[fd][cd]=Tablero[fo][co];
                    
                    Tablero[fo][co]="-";
                    
                    System.out.println("Movimiento realizado");
                    break;
                    
                case 2:
                    System.out.println("SESION TERMINADA");
                    return;
                
                default:
                    System.out.println("Opcion Invalida");
            }
        }
    }
}
                            

