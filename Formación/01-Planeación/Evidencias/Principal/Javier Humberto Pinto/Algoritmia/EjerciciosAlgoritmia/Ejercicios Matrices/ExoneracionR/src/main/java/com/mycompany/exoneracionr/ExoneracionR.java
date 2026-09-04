/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exoneracionr;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class ExoneracionR {

    public static void main(String[] args) {
        System.out.println("Sistema de Calificaciones");
        
        String [][] Matriz = new String [11][5];
        Scanner teclado = new Scanner (System.in);
        Random random = new Random ();
        
        Matriz[0][0]="Aprendices";
        Matriz[0][1]="RAP1";
        Matriz[0][2]="RAP2";
        Matriz[0][3]="RAP3";
        Matriz[0][4]="RAP4";
        
        for (int i = 1; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                
                if (j==0) {
                    
                    System.out.println("Ingrese los nombres de su aprendiz "+(i));
                    Matriz[i][j]=teclado.next();
                    
                }
            }
        }
        String primero="",segundo="",tercero="";
        double TOP1=0,TOP2=0,TOP3=0;
        double promedio=0;
        int APROBADO=0,REPROBADO=0,PLANDEMEJORAMIENTO=0;
        
        //Promedio Total Estudiantes
        for (int i = 1; i < Matriz.length; i++) {
            double suma=0;
            for (int j = 1; j < Matriz[i].length; j++) {
                
                Matriz[i][j]=String.valueOf(random.nextDouble(5));
                
                suma += Double.parseDouble(Matriz[i][j]);
                promedio = suma/5;
            
                
                if (promedio > TOP1) {
                
                TOP3 = TOP2;
                tercero = segundo;
                TOP2 = TOP1;
                segundo = primero;
                TOP1 = promedio;
                primero = Matriz[i][0];
                
                }else if (promedio > TOP2) {
                
                TOP3 = TOP2;
                tercero = segundo;
                TOP2 = promedio;
                segundo = Matriz[i][0];
                
                }else if (promedio > TOP3) {
                
                TOP3 = promedio;
                tercero = Matriz[i][0];
                
                }
            }
            System.out.println("El promedio general de su estudiante : "+Matriz[i][0]+" es "+promedio);
        }
        System.out.println("El estudiante TOP#1 es : "+primero);
        System.out.println("El estudiante TOP#2 es : "+segundo);
        System.out.println("El estudiante TOP#3 es : "+tercero);
        
        if (promedio >= 3.5) {
            
            System.out.println("Estudiante : (APROBADO)");
            APROBADO++;
            
        }else if(promedio < 3.5 && promedio >= 2.5){
            
            System.out.println("Estudiante con : (PLAN DE MEJORAMIENTO)");
            PLANDEMEJORAMIENTO++;
            
        }else if (promedio < 2.5){
            
            System.out.println("Estudiante : (NO APROBADO)");
            REPROBADO++;
        }
        
        //Promedio por General por RAP
        for (int j = 1; j < Matriz[0].length; j++) {
            double sumarap=0;
            double promediorap = 0;
            for (int i = 1; i < Matriz.length; i++) {
                
                sumarap += Double.parseDouble(Matriz[i][j]);
                promediorap = sumarap/10;
                
            }
            System.out.println("Promedio del "+Matriz[0][j]+" : "+promediorap);
        }
        
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                
                System.out.printf("%-20s" , Matriz[i][j]+ " ");
                
            }
            System.out.println();
        }
    }
}