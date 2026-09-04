/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio7;

import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        System.out.println("Sistema de Calificaciones");
        Scanner teclado = new Scanner (System.in);
        String [][] Matriz = new String [5][5];
        double promedio=0,TOP1=0,TOP2=0,TOP3=0;
        String primero="",segundo="",tercero="";
        
        Matriz[0][0]="Estudiantes/";
        Matriz[0][1]="Matematicas/";
        Matriz[0][2]="Castellano/";
        Matriz[0][3]="Fisica/";
        Matriz[0][4]="Ingles/";
        
        for (int i = 1; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                if (j==0) {
                    
                    System.out.println("Digite el nombre de sus estudiantes");
                    Matriz[i][j]=teclado.next();
                    
                }
                
            }
        }
        
        for (int i = 1; i < Matriz.length; i++) {
            for (int j = 1; j < Matriz[i].length; j++) {
                
                System.out.println("Digite las nota de su estudiante "+Matriz[i][0]+" para la competencia "+Matriz[0][j]);
                Matriz[i][j]=teclado.next() ;
                
            }
            
        }
        
        for (int i = 1; i < Matriz.length; i++) {
            double suma=0;
            for (int j = 1; j < Matriz[i].length; j++) {
                
                suma += Double.parseDouble(Matriz[i][j]);
                promedio=(double)suma/4;
            }
            System.out.println("El promedio del estudiante "+Matriz[i][0]+" es "+promedio);
                
                if (promedio>TOP1) {
                    
                    TOP1=promedio;
                    primero=Matriz[i][0];
                }
                if (promedio>TOP2&&promedio<TOP1) {
                    
                    TOP2=promedio;
                    segundo=Matriz[i][0];
                }
                if (promedio>TOP3&&promedio<TOP2&&promedio<TOP1) {
                    
                    TOP3=promedio;
                    tercero=Matriz[i][0];
                
            }
            
        }
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                
                System.out.printf("%-12s", Matriz[i][j]+ " ");
                
            }
            System.out.println();
            
        }
        System.out.println("El estudiante #1 puesto es "+primero);
        System.out.println("El estudiante #2 puesto es "+segundo);
        System.out.println("El estudiante #3 puesto es "+tercero);
    }
}





            



