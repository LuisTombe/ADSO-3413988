/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject14;

import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class Incentivos11 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        
        int PL,PMa,PMi,PJ,PV,PS,PT,PP;
        
        System.out.println("Porfavor ingresa el numero de producción del lunes");
        PL=teclado.nextInt();
        System.out.println("Porfavor ingresa el numero de producción del martes");
        PMa=teclado.nextInt();
        System.out.println("Porfavor ingresa el numero de producción del miercoles");
        PMi=teclado.nextInt();
        System.out.println("Porfavor ingresa el numero de producción del jueves");
        PJ=teclado.nextInt();
        System.out.println("Porfavor ingresa el numero de producción del viernes");
        PV=teclado.nextInt();
        System.out.println("Porfavor ingresa el numero de producción del sabado");
        PS=teclado.nextInt();
        PT= (PL+PMa+PMi+PJ+PV+PS);
        PP= PT/6;
        
        if (PP>=100)
            System.out.println("Recibirá incentivos");
        else{
            System.out.println("No recibirá incentivos");
            {
                
            }          
            
        }
    }
}
