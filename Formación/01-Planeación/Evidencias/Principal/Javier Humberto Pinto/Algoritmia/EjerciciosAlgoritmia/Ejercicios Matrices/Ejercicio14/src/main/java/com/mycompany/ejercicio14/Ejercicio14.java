/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio14;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class Ejercicio14 {

    public static void main(String[] args) {
        System.out.println("Sistema de Inventario por Sucursal");
        
        Scanner teclado = new Scanner (System.in);
        Random random = new Random ();
        int mayorproducto=0,menorsucur=Integer.MAX_VALUE;
        String MVP = "";
        String SMI= "";
        
        String [][] Matriz = new String [5][5];
        
        Matriz[0][0]="[PRODUCTOS]";
        Matriz[0][1]="[Sucursal #1]";
        Matriz[0][2]="[Sucursal #2]";
        Matriz[0][3]="[Sucursal #3]";
        Matriz[0][4]="[Sucursal #4]";
        
        for (int i = 1; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                
                if (j==0) {
                    
                    System.out.println("Ingrese el nombre del producto");
                    Matriz[i][j]=teclado.next();
                    
                }           
            }   
        }
        
        for (int i = 1; i < Matriz.length; i++) {
            for (int j = 1; j < Matriz[i].length; j++) {
                
                System.out.println("Ingrese el N# del Producto "+Matriz[i][0]);
                Matriz[i][j]=teclado.next();
                
            }
            
        }
        
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                
                System.out.printf("%-15s", Matriz[i][j]+ " ");
                
            }
            System.out.println();
            
        }
        int inventarioT=0;
        for (int i = 1; i < Matriz.length; i++) {
            int suma=0;
            for (int j = 1; j < Matriz[i].length; j++) {
                
                suma += Integer.parseInt(Matriz[i][j]);
                inventarioT += Integer.parseInt(Matriz[i][j]);
                
                if (mayorproducto<suma) {
                    
                    mayorproducto=suma;
                    
                    MVP=Matriz[i][0];
                    
                }
                if (suma==0) {
                    
                    System.out.println("Producto agotado "+Matriz[i][0]);
                    break;
                                        
                } 
            }
            System.out.println("El [TOTAL] del producto "+Matriz[i][0]+" es "+suma);

        }
        System.out.println("EL INVENTARIO TOTAL ES "+inventarioT);
        System.out.println("El producto con [MAYOR STOCK] es "+MVP);
        
        for (int j = 1; j < Matriz[0].length; j++) {
            
            int suma=0;
            
            for (int i = 1; i < Matriz.length; i++) {
                
                suma += Integer.parseInt(Matriz[i][j]);
            }
            
            if (suma<menorsucur) {
                
                menorsucur=suma;
                
                SMI=Matriz[0][j];
            
            }
        }
        System.out.println("La sucursal con [MENOS INVENTARIO] ES "+SMI);
    }
}

