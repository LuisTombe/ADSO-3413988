/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio13;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Multiplicación de matrices");
        int f=0,c=0,f2=0,c2=0;
        
        
        System.out.println("INGRESE EL NUMERO DE FILAS Y COLUMNAS DE SUS MATRICES");
        System.out.println("Para la Matriz #1");
        System.out.println("Ingrese el numero de filas");
        f=teclado.nextInt();
        System.out.println("Ingrese el numero de columnas");
        c=teclado.nextInt();
        System.out.println("Para la Matriz #2");
        System.out.println("Ingrese el numero de filas");
        f2=teclado.nextInt();
        System.out.println("Ingrese el numero de columnas");
        c2=teclado.nextInt();
        
        int [][] Matriz = new int [f][c];
        int [][] Matriz2 = new int [f2][c2];
        Random random = new Random ();
        Random random2 = new Random ();
        
        System.out.println("-------------------------------");
        System.out.println("MATRIZ #1                     /");
        System.out.println("-------------------------------");
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                
                Matriz[i][j]=random.nextInt(10);
                
                System.out.printf("%-5s", +Matriz[i][j]+ " ");
                
            }
            System.out.println();
            
        }
        System.out.println("-------------------------------");
        System.out.println("MATRIZ #2                     /");
        System.out.println("-------------------------------");
        for (int i = 0; i < Matriz2.length; i++) {
            for (int j = 0; j < Matriz2[i].length; j++) {
                
                Matriz2[i][j]=random2.nextInt(10);
                
                System.out.printf("%-5s", +Matriz2[i][j]+ " ");
                
            }
            System.out.println();
            
        }
        
        if (f==f2&&c==c2) {
                int [][] MatrizOP = new int [f][c]; 
                
            System.out.println("-------------------------------");
            System.out.println("SUS MATRICES SE PUEDEN OPERAR  /"); 
            System.out.println("-------------------------------");
            
        while (true){
            
        
        int op=0;
        
            System.out.println("Ingrese el operador a usar");
            System.out.println("(1)Sumar");
            System.out.println("(2)Restar");
            System.out.println("(3)Multiplicar");
            System.out.println("(4)FINALIZAR SESION");
            op=teclado.nextInt(); 
                
                switch  (op){
                    
                    case 1:
                        
                        System.out.println("-------------------------------");
                        System.out.println("MATRIZ SUMADA                 /");
                        System.out.println("-------------------------------");
                        
                        for (int i = 0; i < MatrizOP.length; i++) {
                            for (int j = 0; j < MatrizOP[i].length; j++) {
                                MatrizOP[i][j]=Matriz[i][j]+Matriz2[i][j];
                                
                                System.out.printf("%-5s", +MatrizOP[i][j]+ " ");
                            
                            }
                            System.out.println();
                        }
                        break;
                        
                    case 2:
                        
                        System.out.println("-------------------------------");
                        System.out.println("MATRIZ RESTADA                /");
                        System.out.println("-------------------------------");
                        
                        for (int i = 0; i < MatrizOP.length; i++) {
                            for (int j = 0; j < MatrizOP[i].length; j++) {
                                MatrizOP[i][j]=Matriz[i][j]-Matriz2[i][j];
                                
                                System.out.printf("%-5s", +MatrizOP[i][j]+ " ");
                            
                            }
                            System.out.println();
                        }
                        break;
                    
                    case 3:
                        
                        System.out.println("-------------------------------");
                        System.out.println("MATRIZ MULTIPLICADA           /");
                        System.out.println("-------------------------------");
                        
                        for (int i = 0; i < MatrizOP.length; i++) {
                            for (int j = 0; j < MatrizOP[i].length; j++) {
                                MatrizOP[i][j]=Matriz[i][j]*Matriz2[i][j];
                                
                                System.out.printf("%-5s", +MatrizOP[i][j]+ " ");
                            
                            }
                            System.out.println();
                        }
                        break;
                    
                    case 4:
                        
                        System.out.println("-------------------------------");
                        System.out.println("SESION TERMINADA              /");
                        System.out.println("-------------------------------");
                        return;
                }
            }
        }
    }
}
