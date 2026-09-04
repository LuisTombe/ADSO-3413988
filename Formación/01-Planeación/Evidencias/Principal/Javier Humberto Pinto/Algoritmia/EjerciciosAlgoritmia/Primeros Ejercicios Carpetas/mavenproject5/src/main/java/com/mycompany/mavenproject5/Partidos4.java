/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject5;

import java.util.Scanner;

/**
 *
 * @author SoporteSENA
 */
public class Partidos4 {

    public static void main(String[] args) {
        
        int PG,PE,PP,PPG,PPE,PT;
        Scanner teclado=new Scanner (System.in);
        
        System.out.println("Porfavor digite el numero de partidos ganados");
        PG=teclado.nextInt();
        System.out.println("Porfavor digite el numero de partidos empatados");
        PE=teclado.nextInt();
        System.out.println("Porfavor digite el numero de partidos perdidos");
        PP=teclado.nextInt();
        
        PPG= PG*3;
        PPE= PE*1;
        PT= PPG+PPE;
        
        System.out.println("Puntaje de partidos ganados "+PPG);
        
        System.out.println("Puntaje de partidos empatados "+PPE);
        
        System.out.println("El puntaje total es de "+PT);

    }
}
