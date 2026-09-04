/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject26;

import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class Mavenproject26 {

    public static void main(String[] args) {
        int EP,MAY,MEN;
        Scanner teclado=new Scanner (System.in);
                
        MEN=0;
        MAY=0;
        
        for (int K = 1; K <= 20; K++){
            System.out.println("Escriba la edad de la persona");
        EP=teclado.nextInt();
        
        if (EP<18){
        MEN=MEN+1;
        
        }else
            MAY=MAY+1;{
            
            }}
        System.out.println(" La cantidad de personas mayores de edad es de "+MAY);
        System.out.println(" La cantidad de personas mayores de edad es de "+MEN);
        }}
  
