/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3seismayo;

import  java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class Ejercicio3SeisMayo {

    public static void main(String[] args) {
        
        Scanner teclado=new Scanner (System.in);
        
        double media=0,alta=0,menor=0,mayor=0,Suma=0,menor1=0;
        
        Double [] notas=new Double[5];
        

        
        
        
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite la nota "+(i+1));
            notas[i]=teclado.nextDouble();
            
        }
        
        for (int i = 0; i < notas.length; i++) {
            System.out.println("El valor de "+(i+1)+" nota es igual "+notas[i]);
            System.out.println("----------------------------------------");
            media=notas[i]/5;
            
        }
        for (int i = 0; i < notas.length; i++) {
            Suma += notas[i];
            media=Suma/5;
        
            
            if (notas[i]>alta) {
                
                    
                alta=notas[i];
                
                mayor= i;
            }
            else 
                if (notas[i]<menor){
                menor=notas[i];
                menor=i;
                
            }
        }
        
        System.out.println("El promedio de sus notas es "+media);
        System.out.println("La nota mas alta es "+alta+" que se encuentra en la posición "+mayor);
        System.out.println("La nota mas baja es "+menor+" que se encuentra en la posición "+menor);

    }
}