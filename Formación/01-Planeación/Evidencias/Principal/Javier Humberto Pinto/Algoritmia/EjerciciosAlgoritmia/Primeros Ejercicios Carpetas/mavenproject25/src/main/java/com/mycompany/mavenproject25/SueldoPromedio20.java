/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject25;

import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class SueldoPromedio20 {

    public static void main(String[] args) {
        int NE,SE,SS,SP;
        Scanner teclado=new Scanner (System.in);
                
        System.out.println("Escriba el numero de empleados");
        NE=teclado.nextInt();
        
        
        SS=0;
        
        for (int K = 1; K <= NE; K++){
            System.out.println("Escriba el sueldo del empleado");
        SE=teclado.nextInt();
        
        
        
           
            SS=SS+SE;
        }
        
        
        SP=SS/NE;
        
        System.out.println("Sueldo promedio o (SP) es igual a "+SP);
        }}
    


