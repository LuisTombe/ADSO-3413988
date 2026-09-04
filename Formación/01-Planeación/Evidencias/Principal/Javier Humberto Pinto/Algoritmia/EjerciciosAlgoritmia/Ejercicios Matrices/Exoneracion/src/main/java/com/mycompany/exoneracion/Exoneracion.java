/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exoneracion;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class Exoneracion {

    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Sistema Administrador de Calificaciones");
        System.out.println("------------------------------------------------------------------------");
        
        Scanner teclado = new Scanner (System.in);
        Random random = new Random ();
        int aprobado=0,reprobado=0,excelente=0,planmejoramiento=0;
        
        String [][] Matriz = new String [11][5];
        Matriz[0][0]="APRENDICES";
        Matriz[0][1]="RAP1";
        Matriz[0][2]="RAP2";
        Matriz[0][3]="RAP3";
        Matriz[0][4]="RAP4";
        
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                
                                    
                    System.out.printf("%-20s", Matriz[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------------------------------");
        for (int i = 1; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                
                if (j==0) {
                    
                    System.out.println("Digite el nombre del aprendiz");
                    Matriz[i][j]=teclado.next();
                }
            }
        }
        String notas=" ";
        for (int i = 1; i < Matriz.length; i++) {
            for (int j = 1; j < Matriz[i].length; j++) {
                
                Matriz[i][j]=String.valueOf(Math.round(1+random.nextDouble()*4*10.0/10.0));
                notas=Matriz[i][j];
                
            }
        }
        System.out.println("------------------------------------------------------------------------");
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                
                System.out.printf("%-20s", Matriz[i][j]+ " ");
                
            }
            System.out.println();
        } 
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Promedio de la Competencia en el Ambiente");
        System.out.println("------------------------------------------------------------------------");
        for (int j = 1; j < Matriz[0].length; j++) {
            double suma2=0;
            double promediorap=0;
            for (int i = 1; i < Matriz.length; i++) {
                
                
                suma2 += Double.parseDouble(Matriz[i][j]);
                
                promediorap=suma2/10;
                
            }
            System.out.println("El promedio de la competencia | "+Matriz[0][j]+" es "+promediorap);
        }
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Estadistica Estudiantes");
        System.out.println("------------------------------------------------------------------------");
        String TOP1="",TOP2="",TOP3="";
        double MAYOR=0,MAYOR2=0,MAYOR3=0;
        double promedio=0;
        for (int i = 1; i < Matriz.length; i++) {
            double suma=0;
            for (int j = 1; j < Matriz[i].length; j++) {
                
                suma+= Double.parseDouble(Matriz[i][j]);
                
                promedio=suma/4;
            }
            
            if (promedio > MAYOR) {
                
                MAYOR3 = MAYOR2;
                TOP3 = TOP2;
                MAYOR2 = MAYOR;
                TOP2 = TOP1;
                MAYOR = promedio;
                TOP1 = Matriz[i][0];
            
            }else if (promedio > MAYOR2) {
                
                MAYOR3 = MAYOR2;
                TOP3 = TOP2;
                MAYOR2 = promedio;
                TOP2 = Matriz[i][0];
            }else if (promedio > MAYOR3) {
                
                MAYOR3 = promedio;
                TOP3 = Matriz[i][0];
                
            }
            if (promedio>= 3.5) {
                
                System.out.println("El estudiante "+Matriz[i][0]+" (APROBO)");
                aprobado++;
            
            }else if (promedio < 3.5 && promedio > 2.9 ){
                
                System.out.println("El estudiante "+Matriz[i][0]+" (NECESITA PLAN DE MEJORAMIENTO");
                planmejoramiento++;
                
            }else if(promedio==5.0){
                
                System.out.println("El estudiante "+Matriz[i][0]+" (APROBO COMO EXCELENTE)");
                excelente++;
                
            }else{
                
                System.out.println("El estudiante "+Matriz[i][0]+" (REPROBO)");
                System.out.println("Plan de mejoramiento");
                reprobado++;                
                
            }
            System.out.println("El promedio de su estudiante "+Matriz[i][0]+" es "+promedio);
            System.out.println("------------------------------------------------------------------------");
        }
        
        System.out.println("Estudiantes aprobados "+aprobado);
        System.out.println("Estudiantes reprobados "+reprobado);
        System.out.println("Estudiantes con plan de mejoramiento "+planmejoramiento);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("El TOP #1 es el estudiante "+TOP1+" con un promedio "+MAYOR);
        System.out.println("EL TOP #2 es el estudiante "+TOP2+" con un promedio "+MAYOR2);
        System.out.println("EL TOP #3 es el estudiante "+TOP3+" con un promedio "+MAYOR3);
        System.out.println("------------------------------------------------------------------------");
        
    while (true) {

    int buscador = 0;

    System.out.println("------------------------------------------------------------------------");
    System.out.println("BUSCADOR DE NOTAS");
    System.out.println("1. Buscar notas entre 1.0 y 1.9");
    System.out.println("2. Buscar notas entre 2.0 y 2.9");
    System.out.println("3. Buscar notas entre 3.0 y 3.9");
    System.out.println("4. Buscar notas entre 4.0 y 4.9");
    System.out.println("5. Buscar notas iguales a 5.0");
    System.out.println("0. Salir");
    System.out.println("------------------------------------------------------------------------");

    buscador = teclado.nextInt();

    switch (buscador) {

        case 1:
            
            System.out.println("NOTAS ENTRE 1.0 Y 1.9");
            
            for (int i = 1; i < Matriz.length; i++) {
                for (int j = 1; j < Matriz[i].length; j++) {

                    double nota = Double.parseDouble(Matriz[i][j]);

                    if (nota >= 1.0 && nota < 2.0) {

                        System.out.println(
                                "Nota: " + nota + " | Estudiante: " + Matriz[i][0] + " | Competencia: " + Matriz[0][j]);
                    }
                }
            }
            break;
            
        case 2:

            System.out.println("NOTAS ENTRE 2.0 Y 2.9");

            for (int i = 1; i < Matriz.length; i++) {
                for (int j = 1; j < Matriz[i].length; j++) {

                    double nota = Double.parseDouble(Matriz[i][j]);

                    if (nota >= 2.0 && nota < 3.0) {

                        System.out.println(
                                "Nota: " + nota + " | Estudiante: " + Matriz[i][0] + " | Competencia: " + Matriz[0][j]);
                    }
                }
            }
            break;
        
        case 3:

            System.out.println("NOTAS ENTRE 3.0 Y 3.9");

            for (int i = 1; i < Matriz.length; i++) {
                for (int j = 1; j < Matriz[i].length; j++) {

                    double nota = Double.parseDouble(Matriz[i][j]);

                    if (nota >= 3.0 && nota < 4.0) {

                        System.out.println(
                                "Nota: " + nota + " | Estudiante: " + Matriz[i][0] + " | Competencia: " + Matriz[0][j]);
                    }
                }
            }
            break;
            
        case 4:

            System.out.println("NOTAS ENTRE 4.0 Y 4.9");

            for (int i = 1; i < Matriz.length; i++) {
                for (int j = 1; j < Matriz[i].length; j++) {

                    double nota = Double.parseDouble(Matriz[i][j]);

                    if (nota >= 4.0 && nota < 5.0) {

                        System.out.println("Nota: " + nota + " | Estudiante: " + Matriz[i][0] + " | Competencia: " + Matriz[0][j]);
                    }
                }
            }
            break;

        case 0:

            System.out.println("Saliendo del buscador...");
            return;

        default:

            System.out.println("Opción inválida.");
    }
    }
    }
}