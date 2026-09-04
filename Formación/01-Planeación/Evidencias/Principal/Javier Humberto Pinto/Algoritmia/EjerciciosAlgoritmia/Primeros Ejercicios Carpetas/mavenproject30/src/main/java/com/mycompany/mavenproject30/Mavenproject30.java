/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


package com.mycompany.mavenproject30;
import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class Mavenproject30 {

    public static void main(String[] args) {
        String L,SEMAF;
        Scanner teclado=new Scanner (System.in);
        System.out.println("Semaforo (Bandera)");
        
        SEMAF=("V");
        
        while (SEMAF.equals("V")){
            System.out.println("Escribir una letra");
            L=teclado.nextLine();
            switch (L){
                
                    
            default -> {
                SEMAF=("V");
                   System.out.println("Rojo");}
            
                case ("A"),("a")-> {
                SEMAF=("R");
                   System.out.println("Verde");}                               
                case ("E"),("e")-> {
                SEMAF=("R");
                   System.out.println("Verde");}   
                case ("I"),("i")-> {
                   SEMAF=("R");
                   System.out.println("Verde");}   
                case ("O"),("o")-> {
                   SEMAF=("R");
                   System.out.println("Verde");}   
                case ("U"),("u")-> {
                   SEMAF=("R");
                   System.out.println("Verde");}   
                                                                                                                    
            }
        }
    }
}