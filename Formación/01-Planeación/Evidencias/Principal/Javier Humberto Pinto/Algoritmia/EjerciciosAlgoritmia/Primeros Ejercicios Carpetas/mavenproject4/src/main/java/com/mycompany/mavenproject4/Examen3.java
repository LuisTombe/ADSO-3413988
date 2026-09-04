/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject4;

import java.util.Scanner;


/**
 *
 * @author SoporteSENA
 */
public class Examen3 {

    public static void main(String[] args) {
        
        int RC,RI,RB,PRC,PRI,PF;
        Scanner teclado=new Scanner (System.in);
        System.out.println("Porfavor digite el numero de respuestas correctas");
        RC=teclado.nextInt();
        System.out.println("Porfavor digite el numero de respuestas incorrectas");
        RI=teclado.nextInt();
        System.out.println("Porfavor digite el numero de respuestas en blanco");
        RB=teclado.nextInt();
        
        PRC= RC*4;
        PRI= RI*-1;
        PF= PRC+PRI;
        
        System.out.println("Puntaje de respuestas incorrectas "+PRI);
        
        System.out.println("Puntaje de respuestas correctas "+PRC);
        
        System.out.println("su puntaje final es la suma de "+PRC+" mas "+PRI+" que da como resultado "+PF);

    }
}
